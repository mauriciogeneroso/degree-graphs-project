package File;

import Objetos.Graph;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class FileImportExport {

    private static final Util.Log log = new Util.Log();

    private FileImportExport() {
    }

    /**
     * Reatribui nome de usuário e é salvo ultimo login para valores default.
     *
     * @param frame JFrame - Para poder retornar
     * @return Grafo - Retorna o grafo importado
     */
    public static Graph importGraph(JFrame frame) {
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        Graph graph;
        fc.getFileSystemView().getHomeDirectory();
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.grafo", "grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showOpenDialog(frame);
        graph = readFile(frame, fc.getSelectedFile());
        log.put("FileImportExport", "importGraph", 0, "lerArquivo solicitado");
        log.put("FileImportExport", "importGraph", 2, "Grafo retornado");
        return graph;
    }

    /**
     * Exporta o grafo.
     *
     * @param frame JFrame - Para poder retornar
     * @param grafo Grafo - para poder exportar
     */
    public static void exportGraph(JFrame frame, Graph grafo) {
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.grafo", ".grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.getFileSystemView().getHomeDirectory();
        fc.showSaveDialog(frame);
        log.put("FileImportExport", "exportGraph", 0, "JFileChooser exibido com sucesso");
        java.io.File sFile = null;
        File f = fc.getSelectedFile();
        String filePath = f.getAbsolutePath();
        if (!filePath.endsWith(".grafo")) {
            f = new File(filePath + ".grafo");
        }
        saveFile(frame, f.getAbsolutePath(), grafo);
        log.put("FileImportExport", "exportGraph", 1, "Gravou arquivo");
    }

    /**
     * Grava arquivo.
     *
     * @param frame JFrame - Para poder retornar
     * @param nameFile String - Nome do arquivo
     * @param graph Grafo - para poder gravar
     */
    private static void saveFile(JFrame frame, String nameFile, Graph graph) {
        FileOutputStream output;
        ObjectOutputStream objOutput = null;
        try {
            output = new FileOutputStream(nameFile, false);
            objOutput = new ObjectOutputStream(output);
            objOutput.writeObject(graph);
            objOutput.flush();
            log.put("FileImportExport", "saveFile", 1, "Arquivo salvo com sucesso!");
        } catch (java.io.IOException ex) {
            Util.MessageCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
            log.put("FileImportExport", "saveFile", 1, "Erro ao salvar arquivo");
        } finally {
            if (objOutput != null) {
                try {
                    objOutput.close();
                } catch (java.io.IOException ex) {
                    Util.MessageCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
                    log.put("FileImportExport", "saveFile", 2, "Erro ao salvar arquivo");
                }
            }
        }
    }

    /**
     * Lê arquivo
     *
     * @param frame JFrame - Para poder retornarz.
     * @param file File - Arquivo para leitura
     * @return Grafo - Grafo da leitura realizada no arquivo solicitado
     */
    private static Graph readFile(JFrame frame, File file) {
        Graph graph = new Graph();
        try {
            FileInputStream input;
            ObjectInputStream objInput = null;
            input = new FileInputStream(file);
            try {
                objInput = new ObjectInputStream(input);
            } catch (java.io.IOException ex) {
                log.put("FileImportExport", "readFile", 1, ex.getMessage());
            }
            try {
                graph = (Graph) objInput.readObject();
            } catch (java.io.IOException | ClassNotFoundException ex) {
                log.put("FileImportExport", "readFile", 1, ex.getMessage());
            }
            log.put("FileImportExport", "readFile", "Objeto grafo lido com sucesso!");
            return graph;
        } catch (java.io.FileNotFoundException ex) {
            log.put("FileImportExport", "readFile", 1, ex.getMessage());
        }
        return graph;
    }

}
