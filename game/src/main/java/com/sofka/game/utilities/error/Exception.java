package com.sofka.game.utilities.error;

public class Exception extends RuntimeException{
    public Exception(String message) {
        super(message);
    }

    public Exception(String message, Exception exception) {
        super(message, exception);
    }
}
