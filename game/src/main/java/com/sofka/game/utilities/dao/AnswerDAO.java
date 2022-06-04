package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.IAnswer;
import com.sofka.game.utilities.interfaces.IPlayer;
import com.sofka.game.utilities.pojo.Answer;
import com.sofka.game.utilities.pojo.Category;
import com.sofka.game.utilities.pojo.Player;
import com.sofka.game.utilities.pojo.Question;

public class AnswerDAO extends Conection implements IAnswer {

    MongoCollection<Answer> answers = this.getDatabase().getCollection("answer", Answer.class);
    Answer answer = new Answer();

    @Override
    public Answer listAnswer(Integer question) {
        for (Answer q: answers.find()) {
            if (q.getQuestion().equals(question)) {
                return q;
            }
        }
        return null;
    }

    public boolean validateAnswer(Integer optionChoice, Integer question){
        Integer aux = 1;
        for (Answer q: answers.find()) {
            if (q.getQuestion().equals(question)) {
                for (Object r: q.getOption()) {
                    if (r.equals(q.getAnswerCorrect())){
                        if (aux.equals(optionChoice)){
                            return true;
                        }
                    }
                    aux++;
                }
            }
        }
        return false;
    }
}
