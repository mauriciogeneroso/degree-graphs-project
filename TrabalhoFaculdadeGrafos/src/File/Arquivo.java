/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author pigo
 */
public class Arquivo {

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
        FileOutputStream output = null;
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
        FileInputStream input = null;
        ObjectInputStream objInput = null;

        input = new FileInputStream(arq);
        objInput = new ObjectInputStream(input);

        return (Grafo) objInput.readObject();

    }
}
