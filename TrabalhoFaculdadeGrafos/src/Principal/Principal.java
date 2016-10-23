package Principal;

import Util.CarregaConfiguracoes;
import View.Login.Login;

/**
 * Classe comnm objetivo de controlar a inicialização do software.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 19/10/2016
 * @version 1
 */
public class Principal {

    public static void main(String[] args) throws java.io.IOException {
        if (!CarregaConfiguracoes.isUsernameSave()) {
            Login fm = new Login();
            fm.setVisible(true);
        } else {
            FramePrincipal fm = new FramePrincipal();
            fm.setVisible(true);
        }
    }
}
