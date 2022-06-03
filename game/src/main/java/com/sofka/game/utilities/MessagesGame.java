package com.sofka.game.utilities;

import org.jboss.logging.Logger;

public class MessagesGame {

    private static final Logger logger = Logger.getLogger(MessagesGame.class);

    public static MessagesGame getInstance() {
        return new MessagesGame();
    }

    public void showWelcome(){
        logger.info("Bienvenido al concurso");
    }

    public void inputNamePlayer() {
        logger.info("Ingrese su nombre: ");
    }

    public void showOptions() {
        logger.info("Digite una opción: \n1 \n2 \n3 \n4");
    }

    public void incorrectChoice() {
        logger.warn("La opción elegida es incorrecta");
    }

    public void correctChoice() {
        logger.info("La opción elegida es correcta");
    }


}
