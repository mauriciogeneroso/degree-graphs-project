package Util.Mensagens;

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
                break;
            case 2: //warn
                image = new ImageIcon(getClass().getResource("/Util/Icons/warning.png"));
                break;
            case 3: //settings
                image = new ImageIcon(getClass().getResource("/Util/Icons/settings.png"));
                break;
            case 4: //plus
                image = new ImageIcon(getClass().getResource("/Util/Icons/plus.png"));
                break;
            case 5:
                image = new ImageIcon(getClass().getResource("/Util/Icons/export.png"));
                break;
            case 6:
                image = new ImageIcon(getClass().getResource("/Util/Icons/import.png"));
                break;
            case 7:
                image = new ImageIcon(getClass().getResource("/Util/Icons/like.png"));
                break;
            case 8:
                image = new ImageIcon(getClass().getResource("/Util/Icons/error.png"));
                break;
            default:
        }
        
        jlOk.setIcon(new ImageIcon(getClass().getResource("/Util/Icons/check64.png")));
        jlMessage.setText(message);
        jlTitle.setText(title);
        jlIcon.setIcon(image);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitle = new javax.swing.JLabel();
        jlIcon = new javax.swing.JLabel();
        jlOk = new javax.swing.JLabel();
        jlMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.7F);

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

        jlMessage.setBackground(new java.awt.Color(255, 255, 255));
        jlMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jlOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
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
    // End of variables declaration//GEN-END:variables
}