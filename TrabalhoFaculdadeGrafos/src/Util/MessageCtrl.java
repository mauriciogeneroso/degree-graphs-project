package Util;

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

    private MessageCtrl() {
    }
    private static final Util.Log log = new Util.Log();

    /**
     * Método para chamar classe de mensagem
     *
     * @param mensagem String - Mensagem para ser exibida
     * @param titulo String - Título da mensagem
     * @param iconType int - 1 - Código do ícone: <br>1 - Informação<br>2 -
     * Aviso<br>3 - Configurações<br>4 - Adicionar<br>5 - Exportar<br>6 -
     * Importar<br>7 - Sucesso<br>8 - Erro
     * @see Util.Mensagens.DMessage
     */
    public static void callMessage(String mensagem, String titulo, int iconType) {
        try {
            Util.Mensagens.DMessage message = new Util.Mensagens.DMessage(mensagem, titulo, iconType);
            message.setVisible(true);
            log.put("MensagemCtrl", "callMessage", 0, "Mensagem :: " + mensagem + "] [Título :: " + titulo + "] [Ícone :: " + Integer.toString(iconType));
        } catch (java.io.IOException ex) {
            log.put("MensagemCtrl", "callMessage", 1, ex.getMessage());
        }
    }
}
