package com.example.recipe.model;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CategoryTest {
    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        Assertions.assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }
}