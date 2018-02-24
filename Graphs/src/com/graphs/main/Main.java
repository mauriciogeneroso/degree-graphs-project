package com.graphs.main;

import com.graphs.util.LoadSettings;
import com.graphs.view.login.JLogin;
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

    private static final com.graphs.util.Log LOG = new com.graphs.util.Log();
    private static final String ZERO = " ";
    private static final String ONE = ".";
    private static final String TWO = "..";
    private static final String THREE=  "...";
    private static final AbsoluteLayout ABSOLUTE = new AbsoluteLayout();
    private static final AbsoluteConstraints ABDIMAGE = new AbsoluteConstraints(0, 0);
    private static final AbsoluteConstraints ABSBAR = new AbsoluteConstraints(0, 500);
    
    private final ImageIcon image = new ImageIcon(getClass().getResource(com.graphs.util.Constants.PATH_TO_IMAGES_FOLDER + "splash.png"));
    
    private static final JLabel JLABEL = new JLabel();
    private static final JProgressBar BAR = new JProgressBar();

    /**
     * Metodo construtor.
     */
    public Main() {
        Main.this.getContentPane().setLayout(ABSOLUTE);
        Main.this.getContentPane().add(JLABEL, ABDIMAGE);
        Main.this.getContentPane().add(BAR, ABSBAR);
        Main.this.setAlwaysOnTop(true);
        BAR.setPreferredSize(new Dimension(512, 40));
        BAR.setForeground(Color.gray);
        BAR.setForeground(Color.gray);
        BAR.setString(ZERO);
        BAR.setStringPainted(true);
        JLABEL.setIcon(image);
        JLABEL.setBackground(Color.red);

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
                    BAR.setValue(i);
                    i++;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        LOG.put("Main", "Thread] [Run", 0, ex.getMessage());
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    LOG.put("Main", "Thread] [Run", 1, ex.getMessage());
                }
                chamarLogin();
                try {
                    sleep(30);
                } catch (InterruptedException ex) {
                    LOG.put("Main", "Thread] [Run", 2, ex.getMessage());
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
            BAR.setString(ONE);
        } else if (i % 3 == 0) {
            BAR.setString(TWO);
        } else {
            BAR.setString(THREE);
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
