package com.graphs.util;

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
 */
public final class Constants {

    protected static final String USERNAME_PROPERTIES_NAME = "grafos.client.name";
    protected static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "\\src\\com\\graphs\\config\\config.properties";
    protected static final String USERNAME_SAVE_NAME = "grafos.client.saveUsername";
    protected static final String USERNAME_PROPERTIES_DEFAULT_SAVE = "false";
    protected static final String USERNAME_SAVE_SAVED = "true";
    protected static final String USERNAME_PROPERTIES_DEFAULT_NAME = "Usuário";
    public static final String PATH_TO_ICON_FOLDER = "/com/graphs/util/icons/";
    public static final String PATH_TO_IMAGES_FOLDER = "/com/graphs/util/images/";
    public static final String PATH_TO_CURSOR_FOLDER = "/com/graphs/util/icons/Cursor/";

    private Constants() {
    }
}
