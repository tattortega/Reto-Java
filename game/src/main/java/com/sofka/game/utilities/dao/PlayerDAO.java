package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.IPlayer;
import com.sofka.game.utilities.pojo.Player;

import java.util.ArrayList;

public class PlayerDAO extends Conection implements IPlayer {
    MongoCollection<Player> players = this.getDatabase().getCollection("player", Player.class);

    Player player = new Player();

    ArrayList<Player> objectPlayer;
    @Override
    public void addPlayer(Player player) {
        players.insertOne(player);
    }

    public ArrayList getPlayer(){
        objectPlayer = new ArrayList<>();
        for (Player p: players.find()) {
            objectPlayer.add(p);
        }
        return objectPlayer;
    }

}
