package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.IGame;
import com.sofka.game.utilities.pojo.Player;

public class PlayerDAO extends Conection implements IGame {


    MongoCollection<Player> collection = this.getDatabase().getCollection("player", Player.class);

    @Override
    public void addPlayer(Player player) {
        collection.insertOne(player);
    }

    @Override
    public void listQuestion() {
        
    }

    @Override
    public void listAnswer() {

    }
}
