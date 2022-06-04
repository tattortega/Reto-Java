package com.sofka.game.utilities.abstracts;

import java.util.Scanner;

/**
 * Clase abstracta de Scanner
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public abstract class MyScannerAbstract {

    /**
     * Instancia de la clase Scanner
     */
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para obtener entero
     *
     * @return Integer
     */
    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Método para obtener string
     *
     * @return String
     */
    public abstract String getString();


}
