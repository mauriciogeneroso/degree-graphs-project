package com.graphs.util;

/**
 * Classe responsável controle de exibição de mensagens.
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
 *
 */
public final class MessageCtrl {

    public MessageCtrl() {
    }
    private static final com.graphs.util.Log LOG = new com.graphs.util.Log();

    /**
     * Método para chamar classe de mensagem
     *
     * @param mensagem String - Mensagem para ser exibida
     * @param titulo String - Título da mensagem
     * @param iconType int - 1 - Código do ícone: <br>1 - Informação<br>2 -
     * Aviso<br>3 - Configurações<br>4 - Adicionar<br>5 - Exportar<br>6 -
     * Importar<br>7 - Sucesso<br>8 - Erro
     * @see com.graphs.util.mensages.DMessage
     */
    public static void callMessage(String mensagem, String titulo, int iconType) {
        try {
            com.graphs.util.mensages.DMessage message = new com.graphs.util.mensages.DMessage(mensagem, titulo, iconType);
            message.setVisible(true);
            LOG.put("MessageCtrl", "callMessage", 0, "Mensagem :: " + mensagem + "] [Título :: " + titulo + "] [Ícone :: " + Integer.toString(iconType));
        } catch (java.io.IOException ex) {
            LOG.put("MessageCtrl", "callMessage", 1, ex.getMessage());
        }
    }

    /**
     * Método para chamar classe de mensagem
     *
     * @param mensagem String - Mensagem para ser exibida
     * @param titulo String - Título da mensagem
     * @return boolean
     */
    public boolean callConfirmDialog(String mensagem, String titulo) {
        int response = javax.swing.JOptionPane.showConfirmDialog(null, mensagem, titulo, 2);
        LOG.put("MessageCtrl", "callConfirmDialog", 0, "Mensagem :: " + mensagem + "] [Título :: " + titulo + "] [Ícone :: 2] [Response:: " + response + "]");
        //System.out.println(response);
        return response == 0;
    }
}
