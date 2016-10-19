package Principal;

import Util.CarregaConfiguracoes;
import View.Login.Login;
import java.io.IOException;

/**
 * @author Darabas
 */

public class Principal {
    public static void main(String[] args) throws IOException {
        if(CarregaConfiguracoes.isUsernameSave()){
            Login fm = new Login();
            fm.setVisible(true);
        }else{
            FramePrincipal fm = new FramePrincipal();
            fm.setVisible(true);
        }
    }
    
}
