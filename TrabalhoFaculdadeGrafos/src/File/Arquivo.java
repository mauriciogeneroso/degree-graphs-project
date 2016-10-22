package File;

import Objetos.Grafo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe para importar e exportar grafos.
 * 
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 * 
 * @since 22/10/2016
 * @version 1.1
 */

public class Arquivo {
    private Arquivo() {
    }
    
    public static Grafo importarGrafo(JFrame frame) throws FileNotFoundException, IOException, ClassNotFoundException {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(frame);
        File arq = fc.getSelectedFile();
        return lerArquivo(frame, arq);
    }

    public static void exportarGrafo(JFrame frame, Grafo grafo) {
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(frame);

        java.io.File sFile = fc.getSelectedFile();
        gravarArquivo(frame, sFile.getAbsolutePath(), grafo);
    }

    private static void gravarArquivo(JFrame frame, String nomeArquivo, Grafo grafo) {
        FileOutputStream output;
        ObjectOutputStream objOutput = null;
        try {
            output = new FileOutputStream(nomeArquivo, false);
            objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(grafo);
            objOutput.flush();
            JOptionPane.showMessageDialog(frame, "Salvo com sucesso");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (objOutput != null) {
                try {
                    objOutput.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar o arquivo: " + ex.getMessage());
                }
            }
        }
    }

    private static Grafo lerArquivo(JFrame frame, File arq) throws ClassNotFoundException, FileNotFoundException, IOException {
        FileInputStream input;
        ObjectInputStream objInput;
         
        input = new FileInputStream(arq);
        objInput = new ObjectInputStream(input);

        return (Grafo) objInput.readObject();
    }
}
