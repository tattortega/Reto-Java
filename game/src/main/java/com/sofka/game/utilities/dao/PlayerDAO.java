package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Connection;
import com.sofka.game.utilities.interfaces.IPlayer;
import com.sofka.game.utilities.pojo.Player;

import java.util.ArrayList;

/**
 * Clase PlayerDAO para las operaciones en la base de datos de la colección player
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class PlayerDAO extends Connection implements IPlayer {
    MongoCollection<Player> players = this.getDatabase().getCollection("player", Player.class);
    ArrayList<Player> objectPlayer;

    /**
     * Sobrescritura del método addPlayer para agregar jugadores en la base de datos
     *
     * @param player Player
     */
    @Override
    public void addPlayer(Player player) {
        players.insertOne(player);
    }

    /**
     * Método getPlayer para obtener jugador de la base de datos
     *
     * @return ArrayList
     */
    public ArrayList getPlayer() {
        objectPlayer = new ArrayList<>();
        for (Player p : players.find()) {
            objectPlayer.add(p);
        }
        return objectPlayer;
    }

}
