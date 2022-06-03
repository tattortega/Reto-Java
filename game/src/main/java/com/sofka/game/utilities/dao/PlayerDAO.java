package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.IGame;
import com.sofka.game.utilities.pojo.Answer;
import com.sofka.game.utilities.pojo.Category;
import com.sofka.game.utilities.pojo.Player;
import com.sofka.game.utilities.pojo.Question;

public class PlayerDAO extends Conection implements IGame {


    MongoCollection<Player> collection = this.getDatabase().getCollection("player", Player.class);
    MongoCollection<Question> question = this.getDatabase().getCollection("question", Question.class);
    MongoCollection<Category> categoria = this.getDatabase().getCollection("category", Category.class);
    MongoCollection<Answer> answer = this.getDatabase().getCollection("answer", Answer.class);

    @Override
    public void addPlayer(Player player) {
        collection.insertOne(player);
    }

    @Override
    public void listQuestion() {
       // System.out.println("hola"+question.find());
        for (Player q: collection.find()) {
            System.out.println(q);
        }

    }

    @Override
    public void listAnswer() {

    }
}
