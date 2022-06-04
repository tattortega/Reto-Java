package com.sofka.game.utilities.pojo;

import lombok.Data;
import org.bson.types.ObjectId;

/**
 * Clase Category
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
@Data
public class Category {
    private ObjectId id;
    private String identify;
    private String nameCategory;
    private Integer level;


}
