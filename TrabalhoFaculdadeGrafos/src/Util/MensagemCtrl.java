package Util;

import Util.Mensagens.Mensagem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

public final class MensagemCtrl {
    private MensagemCtrl() {
    }
    
    
     /**Método para chamar classe de mensagem
     * @param  mensagem String - Mensagem para ser exibida
     * @param  titulo String - Título da mensagem
     * @param iconType int - 1 - Código do ícone: <br>1 - Informação<br>2 - Aviso<br>3 - Configurações<br>4 - Adicionar<br>5 - Exportar<br>6 - Importar<br>7 - Sucesso
     */
    
    
    public static void callMessage(String mensagem, String titulo, int iconType) {
        try {
            Mensagem message = new Mensagem(mensagem, titulo, iconType);
            message.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MensagemCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
