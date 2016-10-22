package Util;

/**
 * Classe responsável por armazenar as variáveis finais do aplicativo.
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

public final class Strings {
    
    private Strings() {
    }
    
    protected static final String USERNAME_PROPERTIES_NAME = "grafos.client.name";
    protected static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "\\src\\Config\\config.properties";
    protected static final String USERNAME_SAVE_NAME = "grafos.client.saveUsername";
    protected static final String USERNAME_SAVE_DEFAULT = "false";
    protected static final String USERNAME_SAVE_SAVED = "true";
}
