package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;


@Data
public class Answer {
    private ObjectId id;
    private String answerText;
    private Question question;
    private boolean status;
}
