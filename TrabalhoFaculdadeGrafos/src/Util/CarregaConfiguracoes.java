package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Darabas
 */

public final class CarregaConfiguracoes {
    
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