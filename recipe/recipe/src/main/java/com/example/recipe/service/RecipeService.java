package com.example.recipe.service;


import com.example.recipe.commands.RecipeCommand;
import com.example.recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
