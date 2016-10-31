package File;

import Objetos.Grafo;
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
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        Grafo grafo = new Grafo();
        fc.getFileSystemView().getHomeDirectory();
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.grafo", "grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showOpenDialog(frame);
        grafo = lerArquivo(frame, fc.getSelectedFile());
        log.put("Arquivo", "importarGrafo", 0, "lerArquivo solicitado");
        log.put("Arquivo", "importarGrafo", 2, "Grafo retornado");
        return grafo;
    }

    /**
     * Exporta o grafo.
     *
     * @param frame JFrame - Para poder retornar
     * @param grafo Grafo - para poder exportar
     */
    public static void exportarGrafo(JFrame frame, Grafo grafo) {
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.grafo", ".grafo"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.getFileSystemView().getHomeDirectory();
        fc.showSaveDialog(frame);
        log.put("Arquivo", "exportarGrafo", 0, "JFileChooser exibido com sucesso");
        java.io.File sFile = null;
        File f = fc.getSelectedFile();
        String filePath = f.getAbsolutePath();
        if (!filePath.endsWith(".grafo")) {
            f = new File(filePath + ".grafo");
        }
        gravarArquivo(frame, f.getAbsolutePath(), grafo);
        log.put("Arquivo", "exportarGrafo", 1, "Gravou arquivo");
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
            log.put("Arquivo", "gravarArquivo", 1, "Arquivo salvo com sucesso!");
        } catch (java.io.IOException ex) {
            Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
            log.put("Arquivo", "gravarArquivo", 1, "Erro ao salvar arquivo");
        } finally {
            if (objOutput != null) {
                try {
                    objOutput.close();
                } catch (java.io.IOException ex) {
                    Util.MensagemCtrl.callMessage(ex.getMessage(), "Erro ao salvar o arquivo!", 8);
                    log.put("Arquivo", "gravarArquivo", 2, "Erro ao salvar arquivo");
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
    private static Grafo lerArquivo(JFrame frame, File arq) {
        Grafo grafo = new Grafo();
        try {
            FileInputStream input;
            ObjectInputStream objInput = null;
            input = new FileInputStream(arq);
            try {
                objInput = new ObjectInputStream(input);
            } catch (java.io.IOException ex) {
                log.put("Arquivo", "lerArquivo", 1, ex.getMessage());
            }
            try {
                grafo = (Grafo) objInput.readObject();
            } catch (java.io.IOException | ClassNotFoundException ex) {
                log.put("Arquivo", "lerArquivo", 1, ex.getMessage());
            }
            log.put("Arquivo", "lerArquivo", "Objeto grafo lido com sucesso!");
            return grafo;
        } catch (java.io.FileNotFoundException ex) {
            log.put("Arquivo", "lerArquivo", 1, ex.getMessage());
        }
        return grafo;
    }

}
