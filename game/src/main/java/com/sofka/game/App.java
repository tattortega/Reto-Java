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
//        messages.showWelcome();
//        messages.inputNamePlayer();
//        player.setNamePlayer(scanner.getString());
        int level = 1;
        do {
            Question questionChoice = questionDAO.getQuestion(categoryDAO.getCategory(level).getIdentify());
            messages.showLevelGame(level);
            messages.showNameCategory(categoryDAO.getCategory(level).getNameCategory());
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
            }else {
                messages.incorrectChoice();
                answer.setStatus(false);
            }
        } while (answer.getStatus());


    }
}
