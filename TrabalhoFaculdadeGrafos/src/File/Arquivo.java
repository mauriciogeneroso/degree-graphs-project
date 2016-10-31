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
import javax.swing.filechooser.FileNameExtensionFilter;

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
    private static final Util.Log log = new Util.Log();
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
        Grafo grafo = new Grafo();
        fc.getFileSystemView().getHomeDirectory();
        fc.setFileFilter(new FileNameExtensionFilter("*.grafo", "grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showOpenDialog(frame);
        try {
            grafo = lerArquivo(frame, fc.getSelectedFile());
        } catch (IOException | ClassNotFoundException ex) {
            Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
            log.put("arquivo", "ImportarGrafo", 2, ex.getMessage());
        }

        return grafo;
    }

    /**
     * Exporta o grafo.
     *
     * @param frame JFrame - Para poder retornar
     * @param grafo Grafo - para poder exportar
     */
    public static void exportarGrafo(JFrame frame, Grafo grafo) {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("*.grafo", ".grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.getFileSystemView().getHomeDirectory();
        fc.showSaveDialog(frame);
        java.io.File sFile = null;
        File f = fc.getSelectedFile();
        String filePath = f.getAbsolutePath();
        if (!filePath.endsWith(".grafo")) {
            f = new File(filePath + ".grafo");
        }
        gravarArquivo(frame, f.getAbsolutePath(), grafo);
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
     * @param frame JFrame - Para poder retornarz.
     * @param arq File - Arquivo para leitura
     * @return Grafo - Grafo da leitura realizada no arquivo solicitado
     */
    private static Grafo lerArquivo(JFrame frame, File arq) throws FileNotFoundException, IOException, ClassNotFoundException {
        Grafo grafo = new Grafo();
        FileInputStream input;
        ObjectInputStream objInput;
        input = new FileInputStream(arq);
        objInput = new ObjectInputStream(input);
        grafo = (Grafo) objInput.readObject();
        return grafo;
    }

}
