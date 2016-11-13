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
import prefuse.controls.NeighborHighlightControl;
import prefuse.controls.PanControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.data.Graph;
import prefuse.data.io.DataIOException;
import prefuse.data.io.GraphMLReader;
import prefuse.render.AbstractShapeRenderer;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.LabelRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

/**
 * Classe com utilização da API prefuse para realizar a leitura um arquivo XML
 * no modelo graphml, e demonstrar em tela a visualização do grafo 
 * Site: http://prefuse.org/
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 12/11/2016
 * @version 2.1
 */
public class PrefuseGraph extends JFrame{

    public static void showGraficMode(){

        Graph graph = null;
        try {
            graph = new GraphMLReader().readGraph("graphML.xml");
        } catch (DataIOException e) {
            System.err.println("Error loading graph. Exiting...");
            System.exit(1);
        }
        // add the graph to the visualization as the data grou/p "graph"
        // nodes and edges are accessible as "graph.nodes" and "graph.edges"
        Visualization vis = new Visualization();
        vis.add("graph", graph);

        LabelRenderer render = new LabelRenderer("name");
        render.setRoundedCorner(8, 8); // round the corners  
        render.setRenderType(AbstractShapeRenderer.RENDER_TYPE_DRAW_AND_FILL);
        render.setHorizontalAlignment(Constants.CENTER);

        // create a new default renderer factory  
        // return our name label renderer as the default for all non-EdgeItems  
        // includes straight line edges for EdgeItems by default  
        vis.setRendererFactory(new DefaultRendererFactory(render));

        // create our nominal color palette
        // color to nodes
        int[] palette = new int[]{
            ColorLib.rgb(255, 180, 180), ColorLib.rgb(190, 190, 255),
            ColorLib.rgb(107, 35, 142), ColorLib.rgb(35, 142, 35),
            ColorLib.rgb(255, 165, 0), ColorLib.rgb(234, 234, 174),
            ColorLib.rgb(168, 168, 168), ColorLib.rgb(0, 0, 156)
        };

        // map nominal data values to colors using random in create XML
        DataColorAction fill = new DataColorAction("graph.nodes", "idcolor",
                Constants.NOMINAL, VisualItem.FILLCOLOR, palette);
        // use black for node text
        ColorAction text = new ColorAction("graph.nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));
        // use light grey for edges
        ColorAction edges = new ColorAction("graph.edges",
                VisualItem.STROKECOLOR, ColorLib.gray(200));

        // create an action list containing all color assignments
        ActionList color = new ActionList();
        color.add(fill);
        color.add(text);
        color.add(edges);

        // create an action list with an animated layout
        ActionList layout = new ActionList(Activity.INFINITY);
        layout.add(new ForceDirectedLayout("graph", true));
        layout.add(new RepaintAction());

        // add the actions to the visualization
        vis.putAction("color", color);
        vis.putAction("layout", layout);

        // create a new Display that pull from our Visualization
        Display display = new Display(vis);
        display.setHighQuality(true);
        display.pan(230, 300);
        display.setSize(600, 500); // set display size
        display.addControlListener(new DragControl()); // drag items around
        display.addControlListener(new PanControl());  // pan with background left-drag
        display.addControlListener(new ZoomControl()); // zoom with vertical right-drag
        display.addControlListener(new WheelZoomControl());
        display.addControlListener(new ZoomToFitControl());
        display.addControlListener(new NeighborHighlightControl());

        // create a new window to hold the visualization
        JFrame frame = new JFrame("Visualizar Grafo");
        // ensure application exits when window is closed
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(display);
        frame.pack();           // layout components in window
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        javax.swing.ImageIcon img = new javax.swing.ImageIcon(frame.getClass().getResource(Util.Strings.PATH_TO_ICON_FOLDER + "icon.png"));
        frame.setIconImage(img.getImage());
        frame.setVisible(true); // show the window
        
        vis.run("color");  // assign the colors
        vis.run("layout"); // start up the animated layout

    }
}
