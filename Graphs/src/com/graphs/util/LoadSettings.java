package com.graphs.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

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
public final class LoadSettings {

    private static final com.graphs.util.Log LOG = new com.graphs.util.Log();

    /**
     * Construct.
     */
    private LoadSettings() {
    }

    /**
     * Método para resgatar propriedades
     *
     * @return Properties - Propriedades contidas no arquivo
     */
    protected static Properties getProperties() {
        Properties temp = new Properties();
        try {
            temp.load(new java.io.FileInputStream(Constants.CONFIG_FILE_PATH.replace('\\', '/')));
        } catch (IOException ex) {
            LOG.put("CarregaConfiguracoes", "getProperties", 1, ex.getMessage());
        }
        LOG.put("LoadSettings", "getProperties", 0, "Propriedades carregadas");
        return temp;
    }

    /**
     * Método para resgatar usuário
     *
     * @return String - Nome do usuário contido no arquivo de propriedades
     */
    public static String getUsuario() {
        Properties prop = getProperties();
        String user = prop.getProperty(Constants.USERNAME_PROPERTIES_NAME);
        LOG.put("LoadSettings", "getUsuario", ("Usuário \"" + user + "\" capturado com sucesso"));
        return user;
    }

    /**
     * Método para atribuir um nome de usuário para salvar no arquivo de
     * propriedades
     *
     * @param usuario String - Nomo de usuário para ser inserido
     */
    public static void setUsuario(String usuario) {
        try {
            Properties prop = LoadSettings.getProperties();
            prop.setProperty(Constants.USERNAME_PROPERTIES_NAME, usuario);
            prop.store(new FileOutputStream(Constants.CONFIG_FILE_PATH.replace('\\', '/')), null);
            LOG.put("CarregaConfiguracoes", "setUsuario", 0, ("Usuário \"" + usuario + "\" salvo com sucesso"));
        } catch (IOException ex) {
            LOG.put("LoadSettings", "setUsuario", 1, ("Erro ao salvar usuário \"" + usuario + "\"!"));
        }
    }

    /**
     * Verifica se existe um usuário com opção de salvar login
     *
     * @return boolean
     */
    public static boolean isUsernameSave() {
        Properties prop = getProperties();
        Boolean stats = prop.getProperty(Constants.USERNAME_SAVE_NAME).equals("true");
        LOG.put("LoadSettings", "isUsernameSave", 1, Boolean.toString(stats));
        return stats;
    }

    /**
     * Reatribui nome de usuário e é salvo ultimo login para valores default
     */
    public static void resetUsername() {
        Properties prop = getProperties();
        prop.setProperty(Constants.USERNAME_SAVE_NAME, Constants.USERNAME_PROPERTIES_DEFAULT_SAVE); //false
        prop.setProperty(Constants.USERNAME_PROPERTIES_NAME, Constants.USERNAME_PROPERTIES_DEFAULT_NAME);
        try {
            prop.store(new FileOutputStream(Constants.CONFIG_FILE_PATH.replace('\\', '/')), null);
        } catch (IOException ex) {
            LOG.put("LoadSettings", "resetUsername", 0, ex.getMessage());
        }
        LOG.put("LoadSettings", "resetUsername", 1, "Usuário resetado com sucesso!");

    }

    /**
     * Atribui opção de salvar login
     *
     * @param opcao boolean - Valor para atrubiur opção de salvar login
     */
    public static void setSaveUsername(boolean opcao) {
        Properties prop = getProperties();
        if (opcao) {
            prop.setProperty(Constants.USERNAME_SAVE_NAME, Constants.USERNAME_SAVE_SAVED);
            LOG.put("LoadSettings", "setSaveUsername", 0, "Usuário salvo setado como] [ TRUE");
        } else {
            prop.setProperty(Constants.USERNAME_SAVE_NAME, Constants.USERNAME_PROPERTIES_DEFAULT_SAVE);//false
            LOG.put("LoadSettings", "setSaveUsername", 1, "Usuário salvo setado como] [ FALSE");
        }
        try {
            prop.store(new FileOutputStream(Constants.CONFIG_FILE_PATH.replace('\\', '/')), null);
        } catch (IOException ex) {
            LOG.put("LoadSettings", "setSaveUsername", 2, ex.getMessage());
        }
    }

}
