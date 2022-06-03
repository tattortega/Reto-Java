package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class Player {

    private ObjectId id;
    private String namePlayer;
    private Integer score;
    private String status;
    private Integer level;



}
