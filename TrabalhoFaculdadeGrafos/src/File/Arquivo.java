package File;

import Objetos.Grafo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

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

    /**
     * Reatribui nome de usuário e é salvo ultimo login para valores default.
     *
     * @param frame JFrame - Para poder retornar
     * @return Grafo - Retorna o grafo importado
     */
    public static Grafo importarGrafo(JFrame frame) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(frame);
        return lerArquivo(frame, fc.getSelectedFile());
    }

    /**
     * Exporta o grafo.
     *
     * @param frame JFrame - Para poder retornar
     * @param grafo Grafo - para poder exportar
     */
    public static void exportarGrafo(JFrame frame, Grafo grafo) {
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(frame);
        java.io.File sFile = fc.getSelectedFile();
        gravarArquivo(frame, sFile.getAbsolutePath(), grafo);
    }

    /**
     * Grava arquivo.
     *
     * @param frame JFrame - Para poder retornar
     * @param nomeArquivo String - Nome do arquivo
     * @param grafo Grafo - para poder gravar
     */
    private static void gravarArquivo(JFrame frame, String nomeArquivo, Grafo grafo) {
        FileOutputStream output;
        ObjectOutputStream objOutput = null;
        try {
            output = new FileOutputStream(nomeArquivo, false);
            objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(grafo);
            objOutput.flush();
            Util.MensagemCtrl.callMessage("Grafo salvo com sucesso!", "Sucesso!", 7);
        } catch (IOException ex) {
            Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
        } finally {
            if (objOutput != null) {
                try {
                    objOutput.close();
                } catch (IOException ex) {
                    Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
                }
            }
        }
    }

    /**
     * Lê arquivo
     *
     * @param frame JFrame - Para poder retornar.
     * @param arq File - Arquivo para leitura
     * @return Grafo - Grafo da leitura realizada no arquivo solicitado
     */
    private static Grafo lerArquivo(JFrame frame, File arq) {
        Grafo grafo = null;
        FileInputStream input;
        ObjectInputStream objInput;
        try {
            input = new FileInputStream(arq);
            objInput = new ObjectInputStream(input);
            grafo = (Grafo) objInput.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao ler o arquivo!", 8);
        }
        return grafo;
    }

}
