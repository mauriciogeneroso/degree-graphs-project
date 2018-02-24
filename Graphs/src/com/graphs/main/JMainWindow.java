package com.graphs.main;

import com.graphs.objects.Graph;
import com.graphs.util.Constants;
import com.graphs.util.Log;
import com.graphs.util.prefuse.CreateGraphml;
import com.graphs.util.prefuse.PrefuseGraph;
import javax.swing.ImageIcon;

/**
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 15/10/2016
 * @version 1.7
 */
public class JMainWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private static final Log LOG = new Log();

    private Graph graph = new Graph();
    private JDataInput dataInput;
    private com.graphs.identification.IdentificationGraph ident = new com.graphs.identification.IdentificationGraph();
    private javax.swing.ButtonGroup buttonGroup = new javax.swing.ButtonGroup();

    public JMainWindow() {
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
            java.util.logging.Logger.getLogger(JMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource(Constants.PATH_TO_ICON_FOLDER + "icon.png"));
        JMainWindow.this.setIconImage(img.getImage());
        buttonGroup.add(rButtonMatrizAdj);
        buttonGroup.add(rButtonMatrizInc);
        buttonGroup.add(rButtonListaAdj);
        buttonGroup.add(rButtonListaInc);
        LOG.put("JMainWindow", "Construtor", "Construído com sucesso");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rButtonMatrizAdj = new javax.swing.JRadioButton();
        rButtonMatrizInc = new javax.swing.JRadioButton();
        rButtonListaAdj = new javax.swing.JRadioButton();
        rButtonListaInc = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btSimples = new javax.swing.JButton();
        btCompleto = new javax.swing.JButton();
        btConexo = new javax.swing.JButton();
        btPlanar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btCarrregarGrafo = new javax.swing.JButton();
        btSalvarGrafo = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();
        btEntradaDados = new javax.swing.JButton();
        btConfig = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiNovoGrafo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiImportar = new javax.swing.JMenuItem();
        jmiExportar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
        rButtonMatrizAdj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rButtonMatrizAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonMatrizAdjActionPerformed(evt);
            }
        });

        rButtonMatrizInc.setText("Matriz de Incidência");
        rButtonMatrizInc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rButtonMatrizInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonMatrizIncActionPerformed(evt);
            }
        });

        rButtonListaAdj.setText("Lista de Adjacência");
        rButtonListaAdj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rButtonListaAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonListaAdjActionPerformed(evt);
            }
        });

        rButtonListaInc.setText("Lista de Incidência");
        rButtonListaInc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        btSimples.setText("O grafo é simples?");
        btSimples.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimplesActionPerformed(evt);
            }
        });

        btCompleto.setText("O grafo é completo?");
        btCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompletoActionPerformed(evt);
            }
        });

        btConexo.setText("O grafo é conexo?");
        btConexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btConexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConexoActionPerformed(evt);
            }
        });

        btPlanar.setText("O grafo é planar?");
        btPlanar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btPlanar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlanarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btPlanar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btSimples, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSimples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPlanar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btCarrregarGrafo.setText("Importar Grafo");
        btCarrregarGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCarrregarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarrregarGrafoActionPerformed(evt);
            }
        });

        btSalvarGrafo.setText("Exportar Grafo");
        btSalvarGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalvarGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCarrregarGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCarrregarGrafo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvarGrafo)
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

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/graphs/util/images/ic_exit.png"))); // NOI18N
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/graphs/util/images/ic_clear.png"))); // NOI18N
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/graphs/util/images/ic_view.png"))); // NOI18N
        btVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        btEntradaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/graphs/util/images/ic_add.png"))); // NOI18N
        btEntradaDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEntradaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntradaDadosActionPerformed(evt);
            }
        });

        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/graphs/util/images/ic_settings.png"))); // NOI18N
        btConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        menuArquivo.setText("Arquivo");

        jmiNovoGrafo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNovoGrafo.setText("Inserir novo grafo");
        jmiNovoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoGrafoActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiNovoGrafo);
        menuArquivo.add(jSeparator1);

        jmiImportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmiImportar.setText("Importar");
        jmiImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiImportarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiImportar);

        jmiExportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiExportar.setText("Exportar");
        jmiExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExportarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiExportar);
        menuArquivo.add(jSeparator2);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setText("Sobre");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSobre.add(jMenuItem1);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntradaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntradaDadosActionPerformed
        JDataInput input = new JDataInput(this);
        input.setLocationRelativeTo(this);
        new Thread() {
            @Override
            public void run() {
                input.setVisible(true);
            }
        }.start();
        this.setVisible(false);
        LOG.put("JMainWindow", "btEntradaDadosActionPerformed", "EntradaDados exibido com sucesso");
    }//GEN-LAST:event_btEntradaDadosActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        if (graph.getAdjMatrix() != null) {
            com.graphs.util.MessageCtrl mc = new com.graphs.util.MessageCtrl();
            if (mc.callConfirmDialog("Deseja realmente destruir o grafo informado? Irá perder todas os dados.", "Confirmar ação")) {
                textArea.setText("");
                graph.destroyGraph();
                LOG.put("JMainWindow", "btLimparActionPerformed", 0, "Grafo destruído");
            } else {
                LOG.put("JMainWindow", "btLimparActionPerformed", 1, "Grafo não destruído");
            }
        }
        LOG.put("JMainWindow", "btLimparActionPerformed", 2, "Sem grafo para destruir");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimplesActionPerformed
        if (graph.getAdjMatrix() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para verificar se é simples", "Grafo Simples", 2);
            LOG.put("JMainWindow", "btSimplesActionPerformed", 0, "Não existe um grafo para verificar se é simples");
        } else if (ident.checkSimpleGraph(graph)) {
            com.graphs.util.MessageCtrl.callMessage("O grafo é simples!", "Grafo Simples", 1);
            LOG.put("JMainWindow", "btSimplesActionPerformed", 1, "O grafo é simples");
        } else {
            com.graphs.util.MessageCtrl.callMessage("O grafo não é simples!", "Grafo Simples", 1);
            LOG.put("JMainWindow", "btSimplesActionPerformed", 2, "O grafo não é simples");
        }
    }//GEN-LAST:event_btSimplesActionPerformed

    private void btCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompletoActionPerformed
        if (graph.getAdjMatrix() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para verificar se é completo.", "Grafo completo", 2);
            LOG.put("JMainWindow", "btCompletoActionPerformed", 0, "Não existe um grafo para verificar se é completo");
        } else if (ident.checkCompleteGraph(graph)) {
            com.graphs.util.MessageCtrl.callMessage("O grafo é completo", "Grafo Completo", 1);
            LOG.put("JMainWindow", "btCompletoActionPerformed", 1, "O grafo é completo");
        } else {
            com.graphs.util.MessageCtrl.callMessage("O grafo não é completo", "Grafo Completo", 1);
            LOG.put("JMainWindow", "btCompletoActionPerformed", 2, "O grafo não é completo");
        }
    }//GEN-LAST:event_btCompletoActionPerformed

    private void btConexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConexoActionPerformed
        if (graph.getListAdj() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para verificar se é conexo", "Grafo Conexo", 2);
            LOG.put("JMainWindow", "btConexoActionPerformed", 0, "Não existe um grafo para verificar se é conexo");
        } else if (ident.checkConnectedGraph(graph)) {
            com.graphs.util.MessageCtrl.callMessage("O grafo é conexo", "Grafo Conexo", 1);
            LOG.put("JMainWindow", "btConexoActionPerformed", 1, "O grafo é conexo");
        } else {
            com.graphs.util.MessageCtrl.callMessage("O grafo não é conexo", "Grafo Conexo", 1);
            LOG.put("JMainWindow", "btConexoActionPerformed", 2, "O grafo não é conexo");
        }
    }//GEN-LAST:event_btConexoActionPerformed

    private void btPlanarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlanarActionPerformed
        if (graph.getListAdj() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para verificar se é planar", "Grafo Planar", 2);
            LOG.put("JMainWindow", "btPlanarActionPerformed", 0, "Não existe um grafo para verificar se é planar");

        } else if (ident.checkPlanarGraph(graph)) {
            com.graphs.util.MessageCtrl.callMessage("O grafo é planar", "Grafo Planar", 1);
            LOG.put("JMainWindow", "btPlanarActionPerformed", 1, "O grafo é planar");
        } else {
            com.graphs.util.MessageCtrl.callMessage("O grafo não é planar", "Grafo Planar", 1);
            LOG.put("JMainWindow", "btPlanarActionPerformed", 2, "O grafo não é planar");
        }
    }//GEN-LAST:event_btPlanarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        checkIfGoWillDisplayTheData();
    }//GEN-LAST:event_formWindowGainedFocus

    private void rButtonMatrizAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonMatrizAdjActionPerformed
        checkIfGoWillDisplayTheData();
    }//GEN-LAST:event_rButtonMatrizAdjActionPerformed

    private void rButtonMatrizIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonMatrizIncActionPerformed
        checkIfGoWillDisplayTheData();
    }//GEN-LAST:event_rButtonMatrizIncActionPerformed

    private void rButtonListaAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonListaAdjActionPerformed
        checkIfGoWillDisplayTheData();
    }//GEN-LAST:event_rButtonListaAdjActionPerformed

    private void rButtonListaIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonListaIncActionPerformed
        checkIfGoWillDisplayTheData();
    }//GEN-LAST:event_rButtonListaIncActionPerformed

    private void btConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfigActionPerformed
        com.graphs.view.login.JSettings cfg = new com.graphs.view.login.JSettings();
        cfg.setVisible(true);
        this.dispose();
        LOG.put("JMainWindow", "btConfigActionPerformed", "Configuracao.java chamada com sucesos");

    }//GEN-LAST:event_btConfigActionPerformed

    private void jmiNovoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoGrafoActionPerformed
        JDataInput input = new JDataInput(this);
        input.setLocationRelativeTo(this);
        input.setVisible(true);
        this.setVisible(false);
        LOG.put("JMainWindow", "btConfigActionPerformed", "EntradaDados.java chamada com sucesos");
    }//GEN-LAST:event_jmiNovoGrafoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        LOG.put("JMainWindow", "jmiSairActionPerformed", "Programa finalizado");
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        LOG.put("JMainWindow", "btSairActionPerformed", "Programa finalizado");
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btCarrregarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarrregarGrafoActionPerformed
        importGraph();
    }//GEN-LAST:event_btCarrregarGrafoActionPerformed

    private void btSalvarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarGrafoActionPerformed
        exportGraph();
    }//GEN-LAST:event_btSalvarGrafoActionPerformed

    private void jmiImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImportarActionPerformed
        importGraph();
    }//GEN-LAST:event_jmiImportarActionPerformed

    private void jmiExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExportarActionPerformed
        exportGraph();
    }//GEN-LAST:event_jmiExportarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JAbout jAbout = SingleStanceAbout.getStance();
        jAbout.setLocationRelativeTo(this);
        jAbout.setVisible(true);
        LOG.put("JMainWindow", "btConfigActionPerformed", "JAbout.java chamada com sucesos");

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        if (graph.getAdjMatrix() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para visualizar.", "Visualização do grafo", 2);
            LOG.put("JMainWindow", "btVisualizarActionPerformed", 0, "Não existe um grafo para visualizar");
        } else if (!ident.checkSimpleGraph(graph)) {
            // Um grafo simples não possui laço ou aresta paralela, então se não for simples é porque possui
            com.graphs.util.MessageCtrl.callMessage("Não deve possuir laço ou aresta paralela", "Visualização do grafo", 2);
            LOG.put("JMainWindow", "btVisualizarActionPerformed", 0, "Não pode visualziar porque existe um laço ou aresta paralela");
        } else {
            CreateGraphml create = new CreateGraphml();
            create.createXml(graph);
            PrefuseGraph.showGraficMode();
            LOG.put("JMainWindow", "btVisualizarActionPerformed", "Prefuse chamada com sucesso para visualziar o grafo");
        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    /**
     * Método para importar um grafo
     */
    private void importGraph() {
        try {
            graph = com.graphs.file.FileImportExport.importGraph(this);
            checkIfGoWillDisplayTheData();
        } catch (NullPointerException ex) {
            LOG.put("JMainWindow", "ImportGraph", "Cancelado com sucesso!");
        }
    }

    /**
     * Método para exportar o Grafo
     */
    private void exportGraph() {
        if (graph.getListInc() == null) {
            com.graphs.util.MessageCtrl.callMessage("Não existe um grafo para ser exportado!", "Exportar", 8);
            LOG.put("JMainWindow", "exportGraph", "Não existe um grafo para ser exportado!");
        } else {
            try {
                com.graphs.file.FileImportExport.exportGraph(this, graph);
            } catch (NullPointerException e) {
                LOG.put("JMainWindow", "exportGraph", "Cancelado com sucesso!");
            }
        }
    }

    /**
     * Método para verificar se os dados do Grafo serão exibidos em tela
     */
    private void checkIfGoWillDisplayTheData() {
        if (graph.getListAdj() != null) {
            if (rButtonMatrizAdj.isSelected()) {
                displayAdjacencyMatrix();
            } else if (rButtonMatrizInc.isSelected()) {
                displayIncidenceMatrix();
            } else if (rButtonListaAdj.isSelected()) {
                displayAdjacencyList();
            } else if (rButtonListaInc.isSelected()) {
                displayIncidenceList();
            }
        }
    }

    /**
     * Método que imprime as informações em tela de acordo com a opção que
     * estiver selecionada no momento
     */
    private void imprimirInfo() {
        // Imprime os Nós
        String nodesFormal = "Nós = {";
        String[] nodes = graph.getNodes();
        for (int i = 0; i < graph.countNode() - 1; i++) {
            nodesFormal += nodes[i] + ", ";
        }
        nodesFormal += nodes[nodes.length - 1] + "}\n";
        textArea.setText(nodesFormal);

        // Imprime as Arestas
        String edgeFormal = "Arestas = {";
        String edges[] = graph.getEdges();
        for (int i = 0; i < graph.countEdge() - 1; i++) {
            edgeFormal += edges[i] + ", ";
        }
        edgeFormal += edges[edges.length - 1] + "}\n\n";
        textArea.setText(textArea.getText() + edgeFormal);
    }

    /**
     * Método para exibir a Matriz de Adjacência em tela
     */
    private void displayAdjacencyMatrix() {
        textArea.setText("");
        imprimirInfo();
        textArea.setText(textArea.getText() + "------------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Matriz de Adjacência: \n\n");
        textArea.setText(textArea.getText() + graph.getAdjMatrix());
    }

    /**
     * Método para exibir a Matriz de Incidência em tela
     */
    private void displayIncidenceMatrix() {
        textArea.setText("");
        imprimirInfo();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Matriz de Incidência: \n\n");
        textArea.setText(textArea.getText() + graph.getIncMatrix());
    }

    /**
     * Método para exibir a Lista de Adjacência em tela
     */
    private void displayAdjacencyList() {
        textArea.setText("");
        imprimirInfo();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Lista de Adjacência: \n\n");
        String[] nos = graph.getNodes();
        java.util.LinkedList[] lt = graph.getListAdj();

        for (int i = 0; i < graph.countNode(); i++) {
            textArea.setText(textArea.getText() + nos[i] + " -> " + lt[i] + "\n");
        }
    }

    /**
     * Método para exibir a Lista de Incidẽncia em tela
     */
    private void displayIncidenceList() {
        textArea.setText("");
        imprimirInfo();
        textArea.setText(textArea.getText() + "-----------------------------------------\n\n");
        textArea.setText(textArea.getText() + "Lista de Incidência: \n\n");
        String[] nos = graph.getNodes();
        java.util.LinkedList[] lt = graph.getListInc();

        for (int i = 0; i < graph.countNode(); i++) {
            textArea.setText(textArea.getText() + nos[i] + " -> " + lt[i] + "\n");
        }
    }

    public void setGraph(Graph graph) {
        if (this.graph != graph) {
            LOG.put("JMainWindow", "setGrafo", 0, "Grafo setado com sucesso");
        } else {
            LOG.put("JMainWindow", "setGrafo", 1, "Grafo mantido");
        }

        this.graph = graph;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarrregarGrafo;
    private javax.swing.JButton btCompleto;
    private javax.swing.JButton btConexo;
    private javax.swing.JButton btConfig;
    private javax.swing.JButton btEntradaDados;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPlanar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarGrafo;
    private javax.swing.JButton btSimples;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmiExportar;
    private javax.swing.JMenuItem jmiImportar;
    private javax.swing.JMenuItem jmiNovoGrafo;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JRadioButton rButtonListaAdj;
    private javax.swing.JRadioButton rButtonListaInc;
    private javax.swing.JRadioButton rButtonMatrizAdj;
    private javax.swing.JRadioButton rButtonMatrizInc;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
