package com.sofka.game.utilities.pojo;

import lombok.Data;

@Data
public class Question {
    private String nameQuestion;
    private Category category;
    private Integer level;

}
