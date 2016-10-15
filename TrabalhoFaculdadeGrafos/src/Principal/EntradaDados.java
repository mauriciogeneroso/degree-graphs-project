package Principal;

import Objetos.Grafo;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 * Janela para entrada do Grafo, Nesta janela o usuário estará informando as
 * características para realizar a criação do grafo.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 */
public class EntradaDados extends javax.swing.JFrame {

    private Grafo grafo;

    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;

    public EntradaDados(Grafo grafo) {
        initComponents();
        this.grafo = grafo;
        
        // Grupo de botões para os JRadioButton direcionado e não direcionado
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rButtonNaoDirecionado);
        buttonGroup1.add(rButtonDirecionado);
        // Fim do grupo de botões da direção das arestas

        // Grupo de botões para informar se o grafo é completo ou se o usuário definirá as adjacências
        buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rButtonCompleto);
        buttonGroup2.add(rButtonDefinir);
        // Fim do grupo de botões da direção das arestas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entradaNos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        entradaArestas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rButtonDirecionado = new javax.swing.JRadioButton();
        rButtonNaoDirecionado = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rButtonCompleto = new javax.swing.JRadioButton();
        rButtonDefinir = new javax.swing.JRadioButton();
        cBoxNoInicial = new javax.swing.JComboBox<>();
        labelDefinirNo = new javax.swing.JLabel();
        labelDefinirNo2 = new javax.swing.JLabel();
        cBoxNoFinal = new javax.swing.JComboBox<>();
        buttonDefinirAdjacencia = new javax.swing.JButton();
        labelDefinirAresta = new javax.swing.JLabel();
        cBoxAresta = new javax.swing.JComboBox<>();
        buttonCriarGrafo = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Definição formal do Grafo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Grafo = (N, A, G);");

        jLabel2.setText("N = Número de nós.");

        jLabel3.setText("A = Conjunto de arestas.");

        jLabel4.setText("G = Função de adjacência entre os nós.");

        jLabel5.setText("Insira os dados do grafo:");

        jLabel6.setText("N = {");

        entradaNos.setToolTipText("Exemplo: N = {A, B, C}");

        jLabel7.setText("A = {");

        entradaArestas.setToolTipText("Exemplo: A = {a1, a2, a3}");
        entradaArestas.setEnabled(false);
        entradaArestas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaArestasFocusLost(evt);
            }
        });

        jLabel8.setText("}");

        jLabel9.setText("}");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaNos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaNos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rButtonDirecionado.setText("Direcionado");
        rButtonDirecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonDirecionadoActionPerformed(evt);
            }
        });

        rButtonNaoDirecionado.setSelected(true);
        rButtonNaoDirecionado.setText("Não direcionado");
        rButtonNaoDirecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonNaoDirecionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonDirecionado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rButtonNaoDirecionado)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonDirecionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButtonNaoDirecionado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rButtonCompleto.setSelected(true);
        rButtonCompleto.setText("Completo");
        rButtonCompleto.setToolTipText("Grafo simples onde todos os nós são adjacêntes a todos os nós");
        rButtonCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonCompletoActionPerformed(evt);
            }
        });

        rButtonDefinir.setText("Definir:");
        rButtonDefinir.setToolTipText("Definir a adjcência dos nós");
        rButtonDefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonDefinirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rButtonCompleto)
                    .addComponent(rButtonDefinir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rButtonDefinir)
                .addContainerGap())
        );

        cBoxNoInicial.setToolTipText("");
        cBoxNoInicial.setEnabled(false);

        labelDefinirNo.setText("Nó:");
        labelDefinirNo.setEnabled(false);

        labelDefinirNo2.setText("Adjacênte ao nó:");
        labelDefinirNo2.setEnabled(false);

        cBoxNoFinal.setEnabled(false);

        buttonDefinirAdjacencia.setText("Definir Adjacência");
        buttonDefinirAdjacencia.setEnabled(false);
        buttonDefinirAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDefinirAdjacenciaActionPerformed(evt);
            }
        });

        labelDefinirAresta.setText("Aresta:");
        labelDefinirAresta.setEnabled(false);

        cBoxAresta.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDefinirAdjacencia))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDefinirNo2)
                                    .addComponent(labelDefinirNo)
                                    .addComponent(labelDefinirAresta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cBoxNoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cBoxNoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cBoxAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefinirNo)
                    .addComponent(cBoxNoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxNoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDefinirNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDefinirAresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDefinirAdjacencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonCriarGrafo.setText("Criar grafo");
        buttonCriarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarGrafoActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonCriarGrafo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCancelar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonCriarGrafo)
                    .addComponent(buttonLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void rButtonDefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonDefinirActionPerformed
        if (entradaNos.getText().equals("")) {
            rButtonDefinir.setSelected(false);
            rButtonCompleto.setSelected(true);
            JOptionPane.showMessageDialog(this, "Informe os Nós para definir", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                entradaArestas.setEnabled(true);
                labelDefinirNo.setEnabled(true);
                labelDefinirNo2.setEnabled(true);
                labelDefinirAresta.setEnabled(true);
                cBoxNoInicial.setEnabled(true);
                cBoxNoFinal.setEnabled(true);
                cBoxAresta.setEnabled(true);
                buttonCriarGrafo.setEnabled(false);

                grafo.setNos(capturarNos(entradaNos.getText()));
                if (!grafo.noIsEmpty()) {
                    grafo.iniciarMatriz(grafo.getMatrizAdj(), grafo.quantidadeNos(), grafo.quantidadeNos());
                    // A matriz de incidência é inicializada quando tirar o foco do campo de arestas pois as colunas é o número de arestas,
                    // quanto clicar neste botão ainda não tem o número de arestas para poder inicialiar a matriz de Incid.
                    cBoxNoInicial.removeAllItems();
                    cBoxNoFinal.removeAllItems();
                    for (String no : grafo.getNos()) {
                        cBoxNoInicial.addItem(no);
                        cBoxNoFinal.addItem(no);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Valores inválidos para os Nós informados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_rButtonDefinirActionPerformed

    private void rButtonCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonCompletoActionPerformed
        entradaArestas.setText("");
        entradaArestas.setEnabled(false);
        labelDefinirNo.setEnabled(false);
        labelDefinirNo2.setEnabled(false);
        labelDefinirAresta.setEnabled(false);
        cBoxNoInicial.setEnabled(false);
        cBoxNoFinal.setEnabled(false);
        cBoxAresta.setEnabled(false);
        buttonDefinirAdjacencia.setEnabled(false);
        buttonCriarGrafo.setEnabled(true);
    }//GEN-LAST:event_rButtonCompletoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        cancelarCriacaoGrafo();
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void entradaArestasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaArestasFocusLost
        if (entradaArestas.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe as Arestas para definir o grafo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                grafo.setArestas(capturarArestas(entradaArestas.getText()));
                grafo.iniciarMatriz(grafo.getMatrizInc(), grafo.quantidadeNos(), grafo.quantidadeArestas());
                cBoxAresta.removeAllItems();
                for (String arestaa : grafo.getArestas()) {
                    cBoxAresta.addItem(arestaa);
                }
                buttonDefinirAdjacencia.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Valores inválidos para as Arestas informadas", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                entradaArestas.setFocusable(true);
            }
        }
    }//GEN-LAST:event_entradaArestasFocusLost

    private void buttonDefinirAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefinirAdjacenciaActionPerformed
        if (rButtonNaoDirecionado.isSelected() && rButtonDefinir.isSelected()) {
            grafo.alterarMatrizGrafoNaoDirecionado(grafo.getMatrizAdj(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
            grafo.alterarMatrizGrafoNaoDirecionado(grafo.getMatrizInc(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        } else if (rButtonDirecionado.isSelected() && rButtonDefinir.isSelected()) {
            grafo.alterarMatrizGrafoDirecionado(grafo.getMatrizAdj(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
            grafo.alterarMatrizGrafoDirecionado(grafo.getMatrizInc(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        }
        //Após definir remove a aresta da seleção de acordo com o index
        cBoxAresta.removeItemAt(cBoxAresta.getSelectedIndex());
        if (cBoxAresta.getSelectedIndex() == -1) {
            buttonDefinirAdjacencia.setEnabled(false);
            buttonCriarGrafo.setEnabled(true);
        }
    }//GEN-LAST:event_buttonDefinirAdjacenciaActionPerformed

    private void buttonCriarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarGrafoActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCriarGrafoActionPerformed

    private void rButtonDirecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonDirecionadoActionPerformed
    }//GEN-LAST:event_rButtonDirecionadoActionPerformed

    private void rButtonNaoDirecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonNaoDirecionadoActionPerformed
    }//GEN-LAST:event_rButtonNaoDirecionadoActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        resetarJanela();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private int posicaoNoInicialSelecionado() {
        String tempNoInicialSelected = cBoxNoInicial.getItemAt(cBoxNoInicial.getSelectedIndex());
        int posicaoLinhaNo = 0;
        for (int i = 0; i < grafo.quantidadeNos(); i++) {
            if (grafo.getNos()[i].equals(tempNoInicialSelected)) {
                posicaoLinhaNo = i;
                break;
            }
        }
        return posicaoLinhaNo;
    }

    private int posicaoNoFinalSelecionado() {
        String tempNoFinalSelected = cBoxNoFinal.getItemAt(cBoxNoFinal.getSelectedIndex());
        int posicaoColunaNo = 0;
        for (int i = 0; i < grafo.quantidadeNos(); i++) {
            if (grafo.getNos()[i].equals(tempNoFinalSelected)) {
                posicaoColunaNo = i;
                break;
            }
        }
        return posicaoColunaNo;
    }

    private int posicaoArestaSelecionada() {
        String tempArestaSelected = cBoxAresta.getItemAt(cBoxAresta.getSelectedIndex());
        int posicaoAresta = 0;
        for (int i = 0; i < grafo.quantidadeArestas(); i++) {
            if (grafo.getArestas()[i].equals(tempArestaSelected)) {
                posicaoAresta = i;
                break;
            }
        }
        return posicaoAresta;
    }

    private String[] capturarNos(String entradaNos) {
        return entradaNos.split(",");
    }

    private String[] capturarArestas(String entradaArestas) {
        return entradaArestas.split(",");
    }

    private void resetarJanela() {
        entradaNos.setEnabled(true);
        entradaNos.setText("");
        entradaArestas.setEnabled(false);
        entradaArestas.setText("");
        rButtonCompleto.setSelected(true);
        rButtonDefinir.setSelected(false);
        rButtonDirecionado.setSelected(false);
        rButtonNaoDirecionado.setSelected(true);
        labelDefinirNo.setEnabled(false);
        labelDefinirNo2.setEnabled(false);
        labelDefinirAresta.setEnabled(false);
        cBoxNoInicial.setEnabled(false);
        cBoxNoInicial.removeAllItems();
        cBoxNoFinal.setEnabled(false);
        cBoxNoFinal.removeAllItems();
        cBoxAresta.setEnabled(false);
        cBoxAresta.removeAllItems();
        buttonDefinirAdjacencia.setEnabled(false);
        buttonCriarGrafo.setEnabled(true);
        cancelarCriacaoGrafo();
    }

    private void cancelarCriacaoGrafo() {
        grafo.destruirGrafo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCriarGrafo;
    private javax.swing.JButton buttonDefinirAdjacencia;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JComboBox<String> cBoxAresta;
    private javax.swing.JComboBox<String> cBoxNoFinal;
    private javax.swing.JComboBox<String> cBoxNoInicial;
    private javax.swing.JTextField entradaArestas;
    private javax.swing.JTextField entradaNos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDefinirAresta;
    private javax.swing.JLabel labelDefinirNo;
    private javax.swing.JLabel labelDefinirNo2;
    private javax.swing.JRadioButton rButtonCompleto;
    private javax.swing.JRadioButton rButtonDefinir;
    private javax.swing.JRadioButton rButtonDirecionado;
    private javax.swing.JRadioButton rButtonNaoDirecionado;
    // End of variables declaration//GEN-END:variables
}
