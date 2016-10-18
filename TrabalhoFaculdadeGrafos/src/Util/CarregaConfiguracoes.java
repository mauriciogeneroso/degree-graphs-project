package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Darabas
 */

public class CarregaConfiguracoes {
    
    protected static Properties getProperties() throws IOException{
        Properties temp = new Properties();
        String user = System.getProperty("user.dir");
        user = user + "\\src\\Config\\configuracao.properties";
        FileInputStream file = new FileInputStream(user.replace('\\', '/'));
        temp.load(file);
        return temp;
    }
    
    public static String getUsuario() throws IOException{
        Properties prop = getProperties();
        String user = prop.getProperty("grafos.client.name");
        return user;
    }
}
