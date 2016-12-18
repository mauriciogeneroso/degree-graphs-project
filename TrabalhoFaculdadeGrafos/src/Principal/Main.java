package Principal;

import Util.LoadSettings;
import View.Login.JLogin;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import org.netbeans.lib.awtextra.*;

/**
 * Classe com objetivo de controlar a inicialização do software.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 19/10/2016
 * @version 2
 */
public class Main extends JWindow {

    private static final long serialVersionUID = 1L;

    private static final Util.Log log = new Util.Log();
    private static final String zero = " ";
    private static final String um = ".";
    private static final String dois = "..";
    private static final String tres = "...";
    private static final AbsoluteLayout absoluto = new AbsoluteLayout();
    private static final AbsoluteConstraints absimage = new AbsoluteConstraints(0, 0);
    private static final AbsoluteConstraints absbarra = new AbsoluteConstraints(0, 500);
    
    private final ImageIcon image = new ImageIcon(getClass().getResource(Util.Strings.PATH_TO_IMAGES_FOLDER + "splash.png"));
    
    private static final JLabel jlabel = new JLabel();
    private static final JProgressBar barra = new JProgressBar();

    /**
     * Metodo construtor.
     */
    public Main() {
        Main.this.getContentPane().setLayout(absoluto);
        Main.this.getContentPane().add(jlabel, absimage);
        Main.this.getContentPane().add(barra, absbarra);
        Main.this.setAlwaysOnTop(true);
        barra.setPreferredSize(new Dimension(512, 40));
        barra.setForeground(Color.gray);
        barra.setForeground(Color.gray);
        barra.setString(zero);
        barra.setStringPainted(true);
        jlabel.setIcon(image);
        jlabel.setBackground(Color.red);

        /**
         * Reponsável por iniciar uma nova thread.
         *
         */
        new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (i < 101) {
                    progresso(i);
                    barra.setValue(i);
                    i++;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        log.put("Main", "Thread] [Run", 0, ex.getMessage());
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    log.put("Main", "Thread] [Run", 1, ex.getMessage());
                }
                chamarLogin();
                try {
                    sleep(30);
                } catch (InterruptedException ex) {
                    log.put("Main", "Thread] [Run", 2, ex.getMessage());
                }
                dispose();
            }
        }.start();

        Main.this.pack();
        Main.this.setVisible(true);
        Main.this.setLocationRelativeTo(null);
    }

    /**
     * Método responsável por redefinir texto para a barra de carregamento.
     *
     * @param i int - Control "barra" String text
     */
    public void progresso(int i) {
        if (i % 2 == 0) {
            barra.setString(um);
        } else if (i % 3 == 0) {
            barra.setString(dois);
        } else {
            barra.setString(tres);
        }
    }

    /**
     * Metodo responsável por chamar a tela de usuário ou menu inicial
     */
    public static void chamarLogin() {
        if (!LoadSettings.isUsernameSave()) {
            JLogin fm = new JLogin();
            fm.setVisible(true);
        } else {
            JMainWindow fm = new JMainWindow();
            fm.setVisible(true);
        }
    }

    /**
     * Metodo principal.
     *
     * @param args String[] - Argumentos
     */
    public static void main(String[] args) {
        new Main();
    }
}
