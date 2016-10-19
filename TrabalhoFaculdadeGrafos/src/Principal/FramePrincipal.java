package Principal;

import CaracteristicasGrafo.Identificacao;
import Objetos.Armazenamento.Lista;
import Objetos.Grafo;
import View.Login.Configuracao;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.stage.FileChooser;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Estudantes de Ciência da Computação - 4 fase.
 *  
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
 */
public class FramePrincipal extends javax.swing.JFrame {

    private Grafo grafo;
    private Identificacao ident;
    private ButtonGroup buttonGroup;
    
    public FramePrincipal() {
        initComponents();
        ident = new Identificacao();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rButtonMatrizAdj);
        buttonGroup.add(rButtonMatrizInc);
        buttonGroup.add(rButtonListaAdj);
        buttonGroup.add(rButtonListaInc);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rButtonMatrizAdj = new javax.swing.JRadioButton();
        rButtonMatrizInc = new javax.swing.JRadioButton();
        rButtonListaAdj = new javax.swing.JRadioButton();
        rButtonListaInc = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buttonEntradaDados = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btConfig = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiNovoGrafo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSair = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiImportar = new javax.swing.JMenuItem();
        jmiExportar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafos");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Grafo atual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Visualizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        rButtonMatrizAdj.setSelected(true);
        rButtonMatrizAdj.setText("Matriz de Adjacência");
        rButtonMatrizAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonMatrizAdjActionPerformed(evt);
            }
        });

        rButtonMatrizInc.setText("Matriz de Incidência");
        rButtonMatrizInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonMatrizIncActionPerformed(evt);
            }
        });

        rButtonListaAdj.setText("Lista de Adjacência");
        rButtonListaAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonListaAdjActionPerformed(evt);
            }
        });

        rButtonListaInc.setText("Lista de Incidência");
        rButtonListaInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonListaIncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rButtonMatrizAdj)
                    .addComponent(rButtonMatrizInc)
                    .addComponent(rButtonListaAdj)
                    .addComponent(rButtonListaInc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rButtonMatrizAdj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButtonMatrizInc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButtonListaAdj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButtonListaInc)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("O grafo é simples?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("O grafo é completo?");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("O grafo é conexo?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("O grafo é planar?");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Carregar Grafo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salvar Grafo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonEntradaDados.setText("Inserir novo");
        buttonEntradaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradaDadosActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar dados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btConfig.setText("Usuário");
        btConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfigActionPerformed(evt);
            }
        });

        jButton9.setText("Visualizar");

        jMenu1.setText("Arquivo");

        jmiNovoGrafo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNovoGrafo.setText("Inserir novo grafo");
        jmiNovoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoGrafoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNovoGrafo);
        jMenu1.add(jSeparator1);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);
        jMenu1.add(jSeparator2);

        jmiImportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmiImportar.setText("Importar");
        jMenu1.add(jmiImportar);

        jmiExportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiExportar.setText("Exportar");
        jMenu1.add(jmiExportar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEntradaDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton2)
                        .addComponent(jButton9)
                        .addComponent(buttonEntradaDados))
                    .addComponent(btConfig))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntradaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntradaDadosActionPerformed
        grafo = new Grafo();
        EntradaDados entrada = new EntradaDados(grafo);
        entrada.setLocationRelativeTo(this);
        entrada.setVisible(true);
    }//GEN-LAST:event_buttonEntradaDadosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ident.VerifGrafoSimples(grafo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ident.VerifGrafoCompleto(grafo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ident.VerifGrafoConexo(grafo);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ident.VerifGrafoPlanar(grafo);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        verificaSeIraExibirOsDados();
    }//GEN-LAST:event_formWindowGainedFocus

    private void rButtonMatrizAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonMatrizAdjActionPerformed
        verificaSeIraExibirOsDados();
    }//GEN-LAST:event_rButtonMatrizAdjActionPerformed

    private void rButtonMatrizIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonMatrizIncActionPerformed
        verificaSeIraExibirOsDados();
    }//GEN-LAST:event_rButtonMatrizIncActionPerformed

    private void rButtonListaAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonListaAdjActionPerformed
        verificaSeIraExibirOsDados();
    }//GEN-LAST:event_rButtonListaAdjActionPerformed

    private void rButtonListaIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonListaIncActionPerformed
        verificaSeIraExibirOsDados();
    }//GEN-LAST:event_rButtonListaIncActionPerformed

    private void btConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfigActionPerformed
        Configuracao cfg = new Configuracao();
        cfg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btConfigActionPerformed

    private void jmiNovoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoGrafoActionPerformed
        grafo = new Grafo();
        EntradaDados entrada = new EntradaDados(grafo);
        entrada.setLocationRelativeTo(this);
        entrada.setVisible(true);
    }//GEN-LAST:event_jmiNovoGrafoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jmiImportar.doClick();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void verificaSeIraExibirOsDados(){
        if (grafo != null){
            if (rButtonMatrizAdj.isSelected()){
                exibirMatrizAdj();
            } else if (rButtonMatrizInc.isSelected()){
                exibirMatrizInc();
            } else if (rButtonListaAdj.isSelected()){
                exibirListaAdc();
            } else if (rButtonListaInc.isSelected()){
                exibirListaInc();
            }
        }
    }
    
    private void imprimirInformacoes(){
        // Imprime os Nós
            String nosFormal = "Nós = {";
            String[] nos = grafo.getNos();
            for (int i = 0; i < grafo.quantidadeNos() - 1; i++){
                nosFormal += nos[i] + ", ";
            }
            nosFormal += nos[nos.length - 1] + "}\n";
            textArea.setText(nosFormal);
            
            // Imprime as Arestas
            String arestasFormal = "Arestas = {";
            String arestas[] = grafo.getArestas();
            for (int i = 0; i < grafo.quantidadeArestas()- 1; i++){
                arestasFormal += arestas[i] + ", ";
            }
            arestasFormal += arestas[arestas.length - 1] + "}\n\n";
            textArea.setText(textArea.getText() + arestasFormal);
    }
    
    private void exibirMatrizAdj(){
        textArea.setText("");
        imprimirInformacoes();
        textArea.setText(textArea.getText() + "------------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Matriz de Adjacência: \n\n");
        textArea.setText(textArea.getText() + grafo.getMatrizAdj());
    }
    
    private void exibirMatrizInc(){
        textArea.setText("");
        imprimirInformacoes();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Matriz de Incidência: \n\n");
        textArea.setText(textArea.getText() + grafo.getMatrizInc());
    }
    
    private void exibirListaAdc(){
        textArea.setText("");
        imprimirInformacoes();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Lista de Adjacência: \n\n");
        String[] nos = grafo.getNos();
        Lista[] lt = grafo.getListaAdj();
        
        for (int i = 0; i < grafo.quantidadeNos(); i++){
            textArea.setText(textArea.getText() + nos[i] + " -> " + lt[i] + "\n");
        }
    }
    
    private void exibirListaInc(){
        textArea.setText("");
        imprimirInformacoes();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Lista de Incidência: \n\n");
        String[] nos = grafo.getNos();
        Lista[] lt = grafo.getListaInc();
        
        for (int i = 0; i < grafo.quantidadeNos(); i++){
            textArea.setText(textArea.getText() + nos[i] + " -> " + lt[i] + "\n");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfig;
    private javax.swing.JButton buttonEntradaDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmiExportar;
    private javax.swing.JMenuItem jmiImportar;
    private javax.swing.JMenuItem jmiNovoGrafo;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JRadioButton rButtonListaAdj;
    private javax.swing.JRadioButton rButtonListaInc;
    private javax.swing.JRadioButton rButtonMatrizAdj;
    private javax.swing.JRadioButton rButtonMatrizInc;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
