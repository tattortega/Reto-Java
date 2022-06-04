package com.sofka.game.utilities;

import com.sofka.game.utilities.abstracts.MyScannerAbstract;

/**
 * Clase MyScanner que instancia la clase Scanner
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class MyScanner extends MyScannerAbstract {

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    /**
     * Sobrescritura del método getInteger
     * @return Integer
     */
    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new Exception(exception.getMessage(), exception);
        }
    }

    /**
     * Sobrescritura del método getString
     * @return String
     */
    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new Exception(exception.getMessage(), exception);
        }
    }
}
