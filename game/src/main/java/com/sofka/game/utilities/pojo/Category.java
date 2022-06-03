package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class Category {
    private ObjectId id;
    private String identify;
    private String nameCategory;
    private Integer level;


}
