package com.sofka.game;

import com.sofka.game.utilities.MessagesGame;
import com.sofka.game.utilities.MyScanner;
import com.sofka.game.utilities.dao.AnswerDAO;
import com.sofka.game.utilities.dao.CategoryDAO;
import com.sofka.game.utilities.dao.PlayerDAO;
import com.sofka.game.utilities.dao.QuestionDAO;
import com.sofka.game.utilities.pojo.Answer;
import com.sofka.game.utilities.pojo.Category;
import com.sofka.game.utilities.pojo.Player;
import com.sofka.game.utilities.pojo.Question;

import java.util.ArrayList;


public class App {

    static MessagesGame messages = MessagesGame.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    static Player player = new Player();
    static Category category = new Category();
    static Question question = new Question();
    static Answer answer = new Answer();

    static PlayerDAO playerDAO = new PlayerDAO();
    static CategoryDAO categoryDAO = new CategoryDAO();

    static QuestionDAO questionDAO = new QuestionDAO();
    static AnswerDAO answerDAO = new AnswerDAO();

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        messages.showWelcome();
         int option;
         messages.optionChoice();
         option = scanner.getInteger();
         switch (option){
             case 1:
                 play();
                 break;
             case 2:
                 history();
                 break;
             case 3:
                 break;
             default:
                 messages.showMessage("Opción no valida");

         }


    }

    private static void play() {
        messages.inputNamePlayer();
        player.setNamePlayer(scanner.getString());
        int level = 1;
        int score=0;
        do {
            Question questionChoice = questionDAO.getQuestion(categoryDAO.getCategory(level).getIdentify());
            messages.showLevelGame(level);
            messages.showNameCategory(categoryDAO.getCategory(level).getNameCategory());
            messages.showPoints(score);
            messages.showMessage("Pregunta: "+ questionChoice.getNameQuestion());
            Answer optionsAnswer = answerDAO.listAnswer(questionChoice.getIdentify());
            int i = 1;
            for (Object options: optionsAnswer.getOption()) {
                messages.showMessage(i+". "+ options.toString());
                i++;
            }
            messages.showOptions();
            if (answerDAO.validateAnswer(scanner.getInteger(), questionChoice.getIdentify())){
                messages.correctChoice();
                answer.setStatus(true);
                level++;
                score= (score*2) + 100;
            }else {
                messages.incorrectChoice();
                answer.setStatus(false);
                player.setScore(score);
                player.setLevel(level);
                player.setStatus("Perdedor");
                playerDAO.addPlayer(player);
            }
            if(level>5){
                messages.showWinner(player.getNamePlayer(),score);
                player.setScore(score);
                player.setLevel(level);
                player.setStatus("Ganador");
                playerDAO.addPlayer(player);
                answer.setStatus(false);
            }
        } while (answer.getStatus());


    }

    private static void history() {
        // TODO document why this method is empty
        ArrayList<Player> objectPlayer = playerDAO.getPlayer();
        for (Player p: objectPlayer ) {
            messages.showMessage("Nombre: "+p.getNamePlayer()+ " Puntaje: "+p.getScore()+"\n");
        }
    }

}
