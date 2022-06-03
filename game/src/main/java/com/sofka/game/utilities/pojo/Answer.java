package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.ArrayList;


@Data
public class Answer {
    private ObjectId id;
    private String identify;
    private ArrayList option;
    private Integer question;
    private String answerCorrect;
    private boolean status;
}
