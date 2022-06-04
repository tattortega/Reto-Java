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
        logger.info("Digite la opción correcta: ");
    }

    public void incorrectChoice() {
        logger.warn("La opción elegida es incorrecta");
    }

    public void correctChoice() {
        logger.info("La opción elegida es correcta");
    }

    public void optionChoice() {
        logger.info("Elije una opción: \n 1. JUGAR \n 2. VER HISTORIAL\n 3.SALIR");
    }

    public void showPoints(int score) {
        logger.info("Tu puntaje es: "+score);
    }

    public void showNameCategory(String category) {
        logger.info("Categoría: "+ category);
    }
    public void showLevelGame(int level) {
        logger.info("Nivel del juego: "+ level);
    }


    public void showMessage(String message) {
        logger.info(message);
    }

    public void showWinner(String userName, Integer score) {

        logger.info("""
                ***************************************************\s
                ************** FELICITACIONES *********************\s
                ********** HAZ TERMINADO EL JUEGO CON EXITO *******\s
                ***************************************************\s""");
        logger.info(userName +" Tu puntaje fue "+ score);

    }

}
