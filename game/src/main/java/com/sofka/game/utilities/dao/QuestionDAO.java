package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.IPlayer;
import com.sofka.game.utilities.interfaces.IQuestion;
import com.sofka.game.utilities.pojo.Answer;
import com.sofka.game.utilities.pojo.Category;
import com.sofka.game.utilities.pojo.Player;
import com.sofka.game.utilities.pojo.Question;

import java.util.ArrayList;
import java.util.Random;

public class QuestionDAO extends Conection implements IQuestion {

    MongoCollection<Question> questions = this.getDatabase().getCollection("question", Question.class);
    Question question = new Question();
    @Override
    public Question getQuestion(String category) {
        Random random = new Random();
        int aleatorio = random.nextInt(4) + 1 ;
        ArrayList<Question> questionArrayList = new ArrayList<>();
        for (Question q: questions.find()) {
            if (q.getCategory().equals(category)) {
                questionArrayList.add(q);
            }
        }
        return questionArrayList.get(aleatorio);
    }

}
