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
 */
public final class CarregaConfiguracoes {

    private CarregaConfiguracoes() {
    }

    /**
     * Método para resgatar propriedades
     *
     * @return Properties - Propriedades contidas no arquivo
     */
    protected static Properties getProperties() {
        Properties temp = new Properties();
        try {
            temp.load(new FileInputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')));
        } catch (IOException ex) {
            Logger.getLogger(CarregaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    /**
     * Método para resgatar usuário
     *
     * @return String - Nome do usuário contido no arquivo de propriedades
     */
    public static String getUsuario() {
        Properties prop = getProperties();
        return prop.getProperty(Strings.USERNAME_PROPERTIES_NAME);
    }

    /**
     * Método para atribuir um nome de usuário para salvar no arquivo de
     * propriedades
     *
     * @param usuario String - Nomo de usuário para ser inserido
     */
    public static void setUsuario(String usuario) {
        try {
            Properties prop = CarregaConfiguracoes.getProperties();
            prop.setProperty(Strings.USERNAME_PROPERTIES_NAME, usuario);
            prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
        } catch (IOException ex) {
            Logger.getLogger(CarregaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Verifica se existe um usuário com opção de salvar login
     *
     * @return boolean
     */
    public static boolean isUsernameSave() throws IOException {
        Properties prop = getProperties();
        return prop.getProperty(Strings.USERNAME_SAVE_NAME).equals("true");
    }

    /**
     * Reatribui nome de usuário e é salvo ultimo login para valores default
     */
    public static void resetUsername() throws IOException {
        Properties prop = getProperties();
        prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_PROPERTIES_DEFAULT_SAVE); //false
        prop.setProperty(Strings.USERNAME_PROPERTIES_NAME, Strings.USERNAME_PROPERTIES_DEFAULT_NAME);
        prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
    }

    /**
     * Atribui opção de salvar login
     *
     * @param opcao boolean - Valor para atrubiur opção de salvar login
     */
    public static void setSaveUsername(boolean opcao) throws IOException {
        Properties prop = getProperties();
        if (opcao) {
            prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_SAVE_SAVED);
        } else {
            prop.setProperty(Strings.USERNAME_SAVE_NAME, Strings.USERNAME_PROPERTIES_DEFAULT_SAVE);//false
        }
        prop.store(new FileOutputStream(Strings.CONFIG_FILE_PATH.replace('\\', '/')), null);
    }

}
