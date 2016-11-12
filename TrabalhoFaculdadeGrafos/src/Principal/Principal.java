package Principal;

import Util.LoadSettings;
import View.Login.Login;
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
public class Principal extends JWindow {

    private static final long serialVersionUID = 1L;

    private static final Util.Log log = new Util.Log();
    private int i = 0;
    private static final String zero = " ";
    private static final String um = ".";
    private static final String dois = "..";
    private static final String tres = "...";
    private final AbsoluteLayout absoluto;
    private final AbsoluteConstraints absimage;
    private final AbsoluteConstraints absbarra;
    private final ImageIcon image;
    private final JLabel jlabel;
    private JProgressBar barra;
    

    /**
     * Metodo construtor.
     */
    public Principal() {
        absoluto = new AbsoluteLayout();
        absimage = new AbsoluteConstraints(0, 0);
        absbarra = new AbsoluteConstraints(0, 500);
        jlabel = new JLabel();
        image = new ImageIcon(getClass().getResource(Util.Strings.PATH_TO_IMAGES_FOLDER + "splash.png"));
        jlabel.setIcon(image);
        jlabel.setBackground(Color.red);
        barra = new JProgressBar();
        barra.setPreferredSize(new Dimension(512, 40));
        barra.setForeground(Color.gray);
        this.getContentPane().setLayout(absoluto);
        this.getContentPane().add(jlabel, absimage);
        this.getContentPane().add(barra, absbarra);
        this.setAlwaysOnTop(true);
        barra.setForeground(Color.gray);
        barra.setString(zero);
        barra.setStringPainted(true);
        /**
         * Reponsável por iniciar uma nova thread.
         *
         */
        new Thread() {
            @Override
            public void run() {
                while (i < 101) {
                    progresso();
                    barra.setValue(i);
                    i++;
                    try {
                        sleep(10);
                    } catch (InterruptedException ex) {
                        log.put("Principal", "Thread] [Run", 0, ex.getMessage());
                    }
                }
                try {
                    sleep(300);
                } catch (InterruptedException ex) {
                    log.put("Principal", "Thread] [Run", 1, ex.getMessage());
                }
                if (i >= 100) {
                    barra.setForeground(Color.green);
                }
                //chama login,
                chamarLogin();
                try {
                    sleep(30);
                } catch (InterruptedException ex) {
                    log.put("Principal", "Thread] [Run", 2, ex.getMessage());
                }
                dispose();
            }
        }.start();

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * Método responsável por redefinir texto para a barra de carregamento.
     */
    public void progresso() {
        if (i % 2 == 0) {
            barra.setString(um);
        } else {
            if (i % 3 == 0) {
                barra.setString(dois);
            } else {
                if (i % 1 == 0) {
                    barra.setString(tres);
                }
            }
        }
    }

    /**
     * Metodo responsável por chamar a tela de usuário ou menu inicial
     */
    public static void chamarLogin() {
        if (!LoadSettings.isUsernameSave()) {
            Login fm = new Login();
            fm.setVisible(true);
        } else {
            FramePrincipal fm = new FramePrincipal();
            fm.setVisible(true);
        }
    }

    /**
     * Metodo principal.
     *
     * @param args String[] - Argumentos
     */
    public static void main(String[] args) {
        new Principal();
        int coluna1 = 20;
        int idx = 10;

        System.out.println(coluna1 + "    " + idx);
        System.out.println(coluna1 + "    " + idx);
        System.out.println(coluna1 + "    " + idx);

    }
}
