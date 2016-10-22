package Util.Mensagens;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Classe responsável pela exibição de mensagens.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 * 
 * @since 22/10/2016
 * @version 1.2
 */

public class Mensagem extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;
    
    public Mensagem(String message, String title, int icon) throws java.io.IOException{
        initComponents();
        ImageIcon image = null;
        switch(icon){
            case 1: //info
                image = new ImageIcon(getClass().getResource("/Util/Icons/info.png"));
                jpBackground.setBackground(Color.blue);
                break;
            case 2: //warn
                image = new ImageIcon(getClass().getResource("/Util/Icons/warning.png"));
                jpBackground.setBackground(Color.orange);
                break;
            case 3: //settings
                image = new ImageIcon(getClass().getResource("/Util/Icons/settings.png"));
                jpBackground.setBackground(Color.blue);
                break;
            case 4: //plus
                image = new ImageIcon(getClass().getResource("/Util/Icons/plus.png"));
                jpBackground.setBackground(Color.blue);
                break;
            case 5:
                image = new ImageIcon(getClass().getResource("/Util/Icons/export.png"));
                jpBackground.setBackground(Color.green);
                break;
            case 6:
                image = new ImageIcon(getClass().getResource("/Util/Icons/import.png"));
                jpBackground.setBackground(Color.green);
                break;
            case 7:
                image = new ImageIcon(getClass().getResource("/Util/Icons/like.png"));
                jpBackground.setBackground(Color.green);
                break;
            case 8:
                image = new ImageIcon(getClass().getResource("/Util/Icons/error.png"));
                jpBackground.setBackground(Color.red);
                break;
            default:
        }
        
        jlOk.setIcon(new ImageIcon(getClass().getResource("/Util/Icons/check64.png")));
        if(jpBackground.getBackground() == Color.blue){
            jlMessage.setForeground(Color.white);
            jlTitle.setForeground(Color.white);
        }
        jlMessage.setText(message);
        jlTitle.setText(title);
        jlIcon.setIcon(image);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jlMessage = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jlIcon = new javax.swing.JLabel();
        jlOk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpBackground.setPreferredSize(new java.awt.Dimension(770, 151));

        jlMessage.setBackground(new java.awt.Color(255, 255, 255));
        jlMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlTitle.setBackground(new java.awt.Color(255, 255, 255));
        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jlIcon.setBackground(new java.awt.Color(255, 255, 255));
        jlIcon.setPreferredSize(new java.awt.Dimension(128, 128));

        jlOk.setBackground(new java.awt.Color(244, 244, 244));
        jlOk.setPreferredSize(new java.awt.Dimension(64, 64));
        jlOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jlOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOkMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlOkMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlIcon;
    private javax.swing.JLabel jlMessage;
    private javax.swing.JLabel jlOk;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBackground;
    // End of variables declaration//GEN-END:variables
}
