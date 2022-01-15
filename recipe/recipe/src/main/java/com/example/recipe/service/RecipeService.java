package com.example.recipe.service;


import com.example.recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
