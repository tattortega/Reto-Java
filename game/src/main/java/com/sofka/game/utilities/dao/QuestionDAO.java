package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Connection;
import com.sofka.game.utilities.interfaces.IQuestion;
import com.sofka.game.utilities.pojo.Question;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase QuestionDAO para las operaciones en la base de datos de la colección preguntas
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class QuestionDAO extends Connection implements IQuestion {

    MongoCollection<Question> questions = this.getDatabase().getCollection("question", Question.class);

    /**
     * Sobrescritura del método getQuestion para obtener una pregunta aleatoria de la categoría
     *
     * @param category String
     * @return Question
     */
    @Override
    public Question getQuestion(String category) {
        Random random = new Random();
        int aleatorio = random.nextInt(4) + 1;
        ArrayList<Question> questionArrayList = new ArrayList<>();
        for (Question q : questions.find()) {
            if (q.getCategory().equals(category)) {
                questionArrayList.add(q);
            }
        }
        return questionArrayList.get(aleatorio);
    }

}
