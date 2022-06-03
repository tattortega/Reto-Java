package com.sofka.game.utilities;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class Player {

    private ObjectId id;
    private String namePlayer;
    private Integer score;
    private String status;
    private Integer level;

    public Player() {
    }

    public Player(String namePlayer, Integer score, String status, Integer level) {
        this.namePlayer = namePlayer;
        this.score = score;
        this.status = status;
        this.level = level;
    }

}
