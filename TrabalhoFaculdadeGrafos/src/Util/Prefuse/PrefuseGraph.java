package Util.Prefuse;

import javax.swing.JFrame;
import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.layout.graph.ForceDirectedLayout;
import prefuse.activity.Activity;
import prefuse.controls.DragControl;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.data.Graph;
import prefuse.data.io.DataIOException;
import prefuse.data.io.GraphMLReader;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

public class PrefuseGraph {

    public static void main(String[] args) {

        Graph graph = null;
        try {
            graph = new GraphMLReader().readGraph("graphXML.xml");

        } catch (DataIOException e) {
            e.printStackTrace();
            System.err.println("Error loading graph. Exiting...");
            System.exit(1);
        }
        // add the graph to the visualization as the data grou/p "graph"
        // nodes and edges are accessible as "graph.nodes" and "graph.edges"
        Visualization vis = new Visualization();
        vis.add("graph", graph);

        // create our nominal color palette
        // pink for females, baby blue for males
        int[] palette = new int[]{
            ColorLib.rgb(255, 180, 180), ColorLib.rgb(190, 190, 255)
        };
        
        // map nominal data values to colors using our provided palette
//        DataColorAction fill = new DataColorAction("graph.nodes", "gender",
//                Constants.NOMINAL, VisualItem.FILLCOLOR, palette);
        // use black for node text
        ColorAction text = new ColorAction("graph.nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));
        // use light grey for edges
        ColorAction edges = new ColorAction("graph.edges",
                VisualItem.STROKECOLOR, ColorLib.gray(200));

        // create an action list containing all color assignments
        ActionList color = new ActionList();
//        color.add(fill);
        color.add(text);
        color.add(edges);

        // create an action list with an animated layout
        // the INFINITY parameter tells the action list to run indefinitely
        ActionList layout = new ActionList(Activity.INFINITY);
        layout.add(new ForceDirectedLayout("graph"));
        layout.add(new RepaintAction());

        // add the actions to the visualization
        vis.putAction("color", color);
        vis.putAction("layout", layout);

        // add the actions to the visualization
        vis.putAction("color", color);
        vis.putAction("layout", layout);

        // create a new Display that pull from our Visualization
        Display display = new Display(vis);
        display.setSize(720, 500); // set display size
        display.addControlListener(new DragControl()); // drag items around
        display.addControlListener(new PanControl());  // pan with background left-drag
        display.addControlListener(new ZoomControl()); // zoom with vertical right-drag

        // create a new window to hold the visualization
        JFrame frame = new JFrame("prefuse example");
        // ensure application exits when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(display);
        frame.pack();           // layout components in window
        frame.setVisible(true); // show the window

        vis.run("color");  // assign the colors
        vis.run("layout"); // start up the animated layout

    }
}
