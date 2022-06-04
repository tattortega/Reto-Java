package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Connection;
import com.sofka.game.utilities.interfaces.ICategory;
import com.sofka.game.utilities.pojo.Category;

/**
 * Clase CategoryDAO para las operaciones en la base de datos de la colección category
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @author John Acevedo <jhedacro@gmail.com>
 * @version 1.0.0 2022/06/03
 * @since 1.0.0
 */
public class CategoryDAO extends Connection implements ICategory {

    MongoCollection<Category> categories = this.getDatabase().getCollection("category", Category.class);
    Category category = new Category();

    /**
     * Sobrescritura del método listCategory, que trae todas las categorías
     */
    @Override
    public void listCategory() {
        for (Category q : categories.find()) {
            category.setNameCategory(q.getNameCategory());
        }
    }

    /**
     * Método getCategory, que trae la categoría según el nivel del juego
     *
     * @param level Integer
     * @return Category
     */
    public Category getCategory(Integer level) {
        for (Category q : categories.find()) {
            if (q.getLevel().equals(level)) {
                return q;
            }
        }
        return null;
    }

}
