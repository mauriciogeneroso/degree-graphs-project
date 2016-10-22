package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável pelo tratamento do arquivo de propriedades do programa, 
 * chamado config.properties, manipulanto toda alteração e leitura do mesmo.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 * 
 * @since 15/10/2016
 * @version 1.2
 * @release 19/10/2016
 */

public final class CarregaConfiguracoes {
    
    private CarregaConfiguracoes() {
    }
    
    protected static Properties getProperties() throws IOException {
        Properties temp = new Properties();
        temp.load(new FileInputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')));
        return temp;
    }
    
    public static String getUsuario() throws IOException{
        Properties prop = getProperties();
        return prop.getProperty(Strings.USERNAME_PROPERTIES_NAME);
    }
    
    public static void setUsuario(String usuario) {
        try {
            Properties prop = CarregaConfiguracoes.getProperties();
            prop.setProperty(Strings.USERNAME_PROPERTIES_NAME, usuario);
            prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
        } catch (IOException ex) {
            Logger.getLogger(CarregaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isUsernameSave() throws IOException {
       Properties prop = getProperties();
        return prop.getProperty(Strings.USERNAME_SAVE_NAME).equals("true");
    }
    
    public static void resetUsername() throws IOException {
        Properties prop = getProperties();
        prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_SAVE_DEFAULT); //false
        prop.setProperty(Strings.USERNAME_PROPERTIES_NAME, "Usuario");
        prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
    }
    
    public static void setSaveUsernameTrue() throws IOException {
        Properties prop = getProperties();
        prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_SAVE_SAVED);
        prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
    }
    
    public static void setSaveUsernameFalse() throws IOException {
        Properties prop = getProperties();
        prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_SAVE_DEFAULT);//false
        prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
    }

    
}