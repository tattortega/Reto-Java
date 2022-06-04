package com.sofka.game.utilities.dao;

import com.mongodb.client.MongoCollection;
import com.sofka.game.utilities.db.Conection;
import com.sofka.game.utilities.interfaces.ICategory;
import com.sofka.game.utilities.pojo.Category;

public class CategoryDAO extends Conection implements ICategory {

    MongoCollection<Category> categories = this.getDatabase().getCollection("category", Category.class);
    Category category = new Category();

    @Override
    public void listCategory() {
        for (Category q: categories.find()) {
            System.out.println(q);
            category.setNameCategory(q.getNameCategory());
            System.out.println(category.getNameCategory());
        }
    }

    public Category getCategory(Integer level) {
        for (Category q: categories.find()) {
            if (q.getLevel().equals(level)) {
                return q;
            }
        }
        return null;
    }

}
