package br.com.controleestoque.lib.commom;

import java.util.Properties;

/**
 * Interface para obtenção das mensagens dos arquivos de resources
 */
public interface Messages {
    Properties getMessages();
    String getMessage(String code, Object... args);
}
