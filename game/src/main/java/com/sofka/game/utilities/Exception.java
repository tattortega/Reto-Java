package com.sofka.game.utilities;

/**
 * Clase Exception para ejecutar excepciones
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class Exception extends RuntimeException{

    public Exception(String message, Exception exception) {
        super(message, exception);
    }
}
