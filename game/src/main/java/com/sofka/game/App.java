package com.sofka.game;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.DB.Conection;
import com.sofka.game.utilities.Player;

public class App {

    public static void main(String[] args) {
        Conection conection = new Conection();
        MongoCollection<Player> collection = conection.getDatabase().getCollection("player", Player.class);

        Player player1 = new Player("ricardo",10, "retirado",1);
        collection.insertOne(player1);
    }
}
