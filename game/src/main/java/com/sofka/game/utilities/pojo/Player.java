package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;

/**
 * Clase Player
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
@Data
public class Player {

    private ObjectId id;
    private String namePlayer;
    private Integer score;
    private String status;
    private Integer level;



}
