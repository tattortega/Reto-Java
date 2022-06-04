package com.sofka.game.utilities.interfaces;


import com.sofka.game.utilities.pojo.Question;

/**
 * Interface para la clase Question
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public interface IQuestion {
    Question getQuestion(String category);

}
