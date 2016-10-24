package Principal;

import Objetos.Armazenamento.MatrizAdj;
import Objetos.Armazenamento.MatrizInc;
import Objetos.Grafo;
import Util.MensagemCtrl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 * Janela para entrada do Grafo, nesta janela o usuário estará informando as
 * características para realizar a criação do grafo.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 15/10/2016
 * @version 2.0
 */
public class EntradaDados extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Grafo grafo2;
    private FramePrincipal frame;
    private ButtonGroup buttonGroup;

    public EntradaDados(FramePrincipal frame) {
        initComponents();
        this.frame = frame;
        this.grafo2 = new Grafo();

        // Grupo de botões para informar se o grafo é completo ou se o usuário definirá as adjacências
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rButtonCompleto);
        buttonGroup.add(rButtonDefinir);
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
        jlInfoMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Grafo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Definição formal do Grafo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Grafo = (N, A, G);");

        jLabel2.setText("N = Conjunto de nós.");

        jLabel3.setText("A = Conjunto de arestas.");

        jLabel4.setText("G = Função de adjacência entre os nós.");

        jLabel5.setText("Insira os dados do grafo:");

        jLabel6.setText("N = {");

        entradaNos.setToolTipText("Exemplo: N = {A, B, C}");
        entradaNos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNosFocusLost(evt);
            }
        });

        jLabel7.setText("A = {");

        entradaArestas.setToolTipText("Exemplo: A = {a1, a2, a3}");
        entradaArestas.setEnabled(false);
        entradaArestas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaArestasFocusGained(evt);
            }
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Definição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Forma de Criação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        rButtonCompleto.setSelected(true);
        rButtonCompleto.setText("Automático");
        rButtonCompleto.setToolTipText("Definir o grafo de forma completa");
        rButtonCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonCompletoActionPerformed(evt);
            }
        });

        rButtonDefinir.setText("Manual");
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
                .addComponent(rButtonCompleto)
                .addGap(18, 18, 18)
                .addComponent(rButtonDefinir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButtonCompleto)
                    .addComponent(rButtonDefinir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDefinirAdjacencia))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDefinirNo2)
                            .addComponent(labelDefinirNo)
                            .addComponent(labelDefinirAresta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxNoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxNoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
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
        buttonCriarGrafo.setPreferredSize(new java.awt.Dimension(85, 40));
        buttonCriarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarGrafoActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setPreferredSize(new java.awt.Dimension(75, 40));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.setPreferredSize(new java.awt.Dimension(63, 40));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCriarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonCriarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlInfoMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void rButtonDefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonDefinirActionPerformed
        if (entradaNos.getText().equals("")) {
            rButtonDefinir.setSelected(false);
            rButtonCompleto.setSelected(true);
            MensagemCtrl.callMessage("Informe os Nós para definir", "Aviso", 2);
        } else if (nosRepetidos()) {
            rButtonDefinir.setSelected(false);
            rButtonCompleto.setSelected(true);
            MensagemCtrl.callMessage("Existem nós com o mesmo nome", "Aviso", 2);
        } else {
            botaoDefinir();
        }
    }//GEN-LAST:event_rButtonDefinirActionPerformed

    private void rButtonCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonCompletoActionPerformed
        entradaNos.setText("");
        entradaArestas.setText("");
        entradaArestas.setEnabled(false);
        labelDefinirNo.setEnabled(false);
        labelDefinirNo2.setEnabled(false);
        labelDefinirAresta.setEnabled(false);
        cBoxNoInicial.setEnabled(false);
        cBoxNoFinal.setEnabled(false);
        cBoxAresta.setEnabled(false);
        cBoxNoInicial.removeAllItems();
        cBoxNoFinal.removeAllItems();
        cBoxAresta.removeAllItems();
        buttonDefinirAdjacencia.setEnabled(false);
        buttonCriarGrafo.setEnabled(true);
        cancelarCriacaoGrafo();

    }//GEN-LAST:event_rButtonCompletoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        exit();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void entradaArestasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaArestasFocusLost
        jlInfoMessage.setText("");
        if (entradaArestas.getText().equals("")) {
            MensagemCtrl.callMessage("Informe as Arestas para definir o grafo", "Aviso", 2);
        } else if (arestasRepetidas()) {
            MensagemCtrl.callMessage("Existem arestas com o mesmo nome", "Aviso", 2);
        } else {
            try {
                grafo2.setArestas(capturarArestas(entradaArestas.getText()));
                grafo2.iniciarMatriz(new MatrizInc(), grafo2.quantidadeNos(), grafo2.quantidadeArestas());
                grafo2.iniciarListas();
                cBoxAresta.removeAllItems();
                botaoDefinir();
                for (String arestaa : grafo2.getArestas()) {
                    cBoxAresta.addItem(arestaa);
                }
                buttonDefinirAdjacencia.setEnabled(true);
            } catch (Exception e) {
                MensagemCtrl.callMessage("Valores inválidos para as Arestas informadas", "Aviso", 8);
                entradaArestas.setFocusable(true);
            }
        }
    }//GEN-LAST:event_entradaArestasFocusLost

    private void buttonDefinirAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefinirAdjacenciaActionPerformed
        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizAdj(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizInc(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        grafo2.alterarListaGrafoNaoDirecionado(grafo2.getNoPosicao(posicaoNoInicialSelecionado()), grafo2.getNoPosicao(posicaoNoFinalSelecionado()), grafo2.getArestaPosicao(posicaoArestaSelecionada()));

        //Após definir remove a aresta da seleção de acordo com o index
        cBoxAresta.removeItemAt(cBoxAresta.getSelectedIndex());
        if (cBoxAresta.getSelectedIndex() == -1) {
            buttonDefinirAdjacencia.setEnabled(false);
            buttonCriarGrafo.setEnabled(true);
        }
    }//GEN-LAST:event_buttonDefinirAdjacenciaActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        resetarJanela();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonCriarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarGrafoActionPerformed
        if (rButtonDefinir.isSelected()) {
            frame.setGrafo(grafo2);
            exit();
        } else if (entradaNos.getText().trim().equals("")) {
            MensagemCtrl.callMessage("É necessário informar os nós para criar o grafo", "Aviso", 2);
        } else {
            // CRIA AUTOMATICAMENTE O GRAFO COMPLETO
            grafo2.setNos(capturarNos(entradaNos.getText()));

            if (grafo2.quantidadeNos() == 1) {
                MensagemCtrl.callMessage("Não é posśivel criar um grafo completo com apenas um nó", "Aviso", 2);

            } else if (nosRepetidos()) {
                MensagemCtrl.callMessage("Existem nós com o mesmo nome", "Aviso", 2);
            } else {

                int contArestas = 0;
                for (int i = 0; i < grafo2.quantidadeNos(); i++) {
                    for (int j = i + 1; j < grafo2.quantidadeNos(); j++) {
                        contArestas++;
                    }
                }

                grafo2.iniciarMatriz(new MatrizAdj(), grafo2.quantidadeNos(), grafo2.quantidadeNos()); // Adjacência
                grafo2.iniciarListas();

                String[] arestasNaoDirecionado = new String[contArestas];
                for (int i = 0; i < contArestas; i++) {
                    arestasNaoDirecionado[i] = String.valueOf(i);
                }

                grafo2.setArestas(arestasNaoDirecionado);
                grafo2.iniciarMatriz(new MatrizInc(), grafo2.quantidadeNos(), grafo2.quantidadeArestas());
                contArestas = 0;
                for (int i = 0; i < grafo2.quantidadeNos(); i++) {
                    for (int j = i + 1; j < grafo2.quantidadeNos(); j++) {
                        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizAdj(), i, j, contArestas);
                        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizInc(), i, j, contArestas);
                        grafo2.alterarListaGrafoNaoDirecionado(grafo2.getNoPosicao(i), grafo2.getNoPosicao(j), grafo2.getArestaPosicao(contArestas++));
                    }
                }
                frame.setVisible(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(EntradaDados.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.setGrafo(grafo2);
                exit();
            } // fim do else            
        } // fim do else
    }//GEN-LAST:event_buttonCriarGrafoActionPerformed

    private void entradaNosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNosFocusGained
        jlInfoMessage.setText("Exemplo: N = {A, B, C}");
    }//GEN-LAST:event_entradaNosFocusGained

    private void entradaNosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNosFocusLost
        jlInfoMessage.setText("");
    }//GEN-LAST:event_entradaNosFocusLost

    private void entradaArestasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaArestasFocusGained
        jlInfoMessage.setText("Exemplo: A = {a1, a2, a3}");
    }//GEN-LAST:event_entradaArestasFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Verifica se há nós repetidos digitado pelo usuário
     *
     * @return boolean - Retorna true se existir nó repetido e false se não
     * existir
     */
    private boolean nosRepetidos() {
        String[] n = capturarNos(entradaNos.getText());
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i].equals(n[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Verifica se há arestas repetidas digitada pelo usuário
     *
     * @return boolean - Retorna true se existir aresta repetida e false se não
     * existir
     */
    private boolean arestasRepetidas() {
        String[] a = capturarArestas(entradaArestas.getText());
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Retorna a posição do primeiro nó no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição do nó selecionado
     */
    private int posicaoNoInicialSelecionado() {
        String tempNoInicialSelected = cBoxNoInicial.getItemAt(cBoxNoInicial.getSelectedIndex());
        int posicaoLinhaNo = 0;
        for (int i = 0; i < grafo2.quantidadeNos(); i++) {
            if (grafo2.getNos()[i].equals(tempNoInicialSelected)) {
                posicaoLinhaNo = i;
                break;
            }
        }
        return posicaoLinhaNo;
    }

    /**
     * Retorna a posição do segundo nó no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição do nó selecionado
     */
    private int posicaoNoFinalSelecionado() {
        String tempNoFinalSelected = cBoxNoFinal.getItemAt(cBoxNoFinal.getSelectedIndex());
        int posicaoColunaNo = 0;
        for (int i = 0; i < grafo2.quantidadeNos(); i++) {
            if (grafo2.getNos()[i].equals(tempNoFinalSelected)) {
                posicaoColunaNo = i;
                break;
            }
        }
        return posicaoColunaNo;
    }

    /**
     * Retorna a posição da aresta no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição da aresta selecionado
     */
    private int posicaoArestaSelecionada() {
        String tempArestaSelected = cBoxAresta.getItemAt(cBoxAresta.getSelectedIndex());
        int posicaoAresta = 0;
        for (int i = 0; i < grafo2.quantidadeArestas(); i++) {
            if (grafo2.getArestas()[i].equals(tempArestaSelected)) {
                posicaoAresta = i;
                break;
            }
        }
        return posicaoAresta;
    }

    /**
     * Método para capturar os nós informandos pelo usuário
     *
     * @return String[] - retorna um array com os nós informados pelo usuário
     */
    private String[] capturarNos(String entradaNos) {
        return entradaNos.replace(" ", "").split(",");
    }

    /**
     * Método para capturar as arestas informandas pelo usuário
     *
     * @return String[] - retorna um array com as arestas informadas pelo
     * usuário
     */
    private String[] capturarArestas(String entradaArestas) {
        return entradaArestas.replace(" ", "").split(",");
    }

    private void botaoDefinir() {
        grafo2.setNos(capturarNos(entradaNos.getText()));
        if (!grafo2.noIsEmpty()) {
            grafo2.iniciarMatriz(new MatrizAdj(), grafo2.quantidadeNos(), grafo2.quantidadeNos());
            // A matriz de incidência é inicializada quando tirar o foco do campo de arestas pois as colunas é o número de arestas,
            // quanto clicar neste botão ainda não tem o número de arestas para poder inicialiar a matriz de Incidência.
            grafo2.iniciarListas();
            cBoxNoInicial.removeAllItems();
            cBoxNoFinal.removeAllItems();
            for (String no : grafo2.getNos()) {
                cBoxNoInicial.addItem(no);
                cBoxNoFinal.addItem(no);
            }
            entradaArestas.setEnabled(true);
            labelDefinirNo.setEnabled(true);
            labelDefinirNo2.setEnabled(true);
            labelDefinirAresta.setEnabled(true);
            cBoxNoInicial.setEnabled(true);
            cBoxNoFinal.setEnabled(true);
            cBoxAresta.setEnabled(true);
            buttonCriarGrafo.setEnabled(false);
        }
    }

    /**
     * Método para voltar a janela ao estado inicial a sua abertura
     *
     */
    protected void resetarJanela() {
        entradaNos.setEnabled(true);
        entradaNos.setText("");
        entradaArestas.setEnabled(false);
        entradaArestas.setText("");
        rButtonCompleto.setSelected(true);
        rButtonDefinir.setSelected(false);
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

    /**
     * Método para cancelar a criação do grafo
     */
    private void cancelarCriacaoGrafo() {
        if (grafo2.getMatrizAdj() == null) {
            grafo2.destruirGrafo();
        }
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlInfoMessage;
    private javax.swing.JLabel labelDefinirAresta;
    private javax.swing.JLabel labelDefinirNo;
    private javax.swing.JLabel labelDefinirNo2;
    private javax.swing.JRadioButton rButtonCompleto;
    private javax.swing.JRadioButton rButtonDefinir;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        frame.setVisible(true);
        try {
            Thread.sleep(10);

        } catch (InterruptedException ex) {
            Logger.getLogger(EntradaDados.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }
}
