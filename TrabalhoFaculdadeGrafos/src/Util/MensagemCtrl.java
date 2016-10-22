package Util;

import Util.Mensagens.Mensagem;

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
 * @release 22/10/2016
 */

public final class MensagemCtrl {
    private MensagemCtrl() {
    }
    
    public static void callMessage(String titulo, String mensagem, int iconType) throws java.io.IOException{
        Mensagem message = new Mensagem(mensagem, titulo, iconType);
        message.setVisible(true);
    }
}
