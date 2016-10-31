package Util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
 * @since 30/10/2016
 * @version 1.0
 */
public final class Log {
    private String file;
    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private final Date date = new Date();
    
    public void put(String file, String function ,String message) {
        try {
            java.io.BufferedWriter buffer = new java.io.BufferedWriter(new java.io.FileWriter("log.txt", true));
            renameDotJava(file);
            write("[" + this.date + "] [" + this.file + "] [" + function + "] :: " + message + " :: [END]", buffer);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void put(String file, String function, int number, String message) {
        try {
            java.io.BufferedWriter buffer = new java.io.BufferedWriter(new java.io.FileWriter("log.txt", true));
            renameDotJava(file);
            write("[" + this.date + "] [" + this.file + "] [" + function + "] [" + number + "] :: " + message + " :: [END]", buffer);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void write(String content, BufferedWriter buffer) {
        try {
            buffer.write(content);
            buffer.flush();
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void renameDotJava(String file) {
        this.file = file + ".java";
    }
}
