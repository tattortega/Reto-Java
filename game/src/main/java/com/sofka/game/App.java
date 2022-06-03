package com.sofka.game;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.dao.PlayerDAO;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.pojo.Player;

public class App {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setNamePlayer("Juan");

        PlayerDAO funcionees = new PlayerDAO();
        funcionees.addPlayer(player1);

    }
}
