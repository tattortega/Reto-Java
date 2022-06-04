package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Connection;
import com.sofka.game.utilities.interfaces.IAnswer;
import com.sofka.game.utilities.pojo.Answer;


/**
 * Clase AnswerDAO para las operaciones en la base de datos de la colección answer
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class AnswerDAO extends Connection implements IAnswer {

    MongoCollection<Answer> answers = this.getDatabase().getCollection("answer", Answer.class);

    /**
     * Sobrescritura del método listAnswer, que trae todas las respuestas
     *
     * @param question Integer
     * @return answer
     */
    @Override
    public Answer listAnswer(Integer question) {
        for (Answer q : answers.find()) {
            if (q.getQuestion().equals(question)) {
                return q;
            }
        }
        return null;
    }

    /**
     * Método validateAnswer que valida la respuesta del jugador
     *
     * @param optionChoice Integer
     * @param question     Integer
     * @return boolean
     */
    public boolean validateAnswer(Integer optionChoice, Integer question) {
        Integer aux = 1;
        for (Answer q : answers.find()) {
            if (q.getQuestion().equals(question)) {
                for (Object r : q.getOption()) {
                    if (r.equals(q.getAnswerCorrect())) {
                        if (aux.equals(optionChoice)) {
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
