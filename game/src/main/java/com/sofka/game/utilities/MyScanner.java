package com.sofka.game.utilities;

import com.sofka.game.utilities.abstracts.MyScannerAbstract;

public class MyScanner extends MyScannerAbstract {

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new Exception(exception.getMessage(), exception);
        }
    }

    @Override
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new Exception(exception.getMessage(), exception);
        }
    }
}
