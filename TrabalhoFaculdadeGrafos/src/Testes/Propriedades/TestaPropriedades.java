package Testes.Propriedades;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darabas
 */
public class TestaPropriedades {
    public static void main(String[] args) throws IOException {
        
            String user = Util.CarregaConfiguracoes.getUsuario();
            System.out.println(user);
        
        
    }
}
