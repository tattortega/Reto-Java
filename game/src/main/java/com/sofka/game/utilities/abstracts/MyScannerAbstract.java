package com.sofka.game.utilities.abstracts;

import java.util.Scanner;

public abstract class MyScannerAbstract {

    protected static final Scanner scanner = new Scanner(System.in);

    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    public abstract String getString();

    public void close() {
        scanner.close();
    }
}
