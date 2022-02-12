package com.example.recipe.service;

import com.example.recipe.converters.RecipeCommandToRecipe;
import com.example.recipe.converters.RecipeToRecipeCommand;
import com.example.recipe.model.Recipe;
import com.example.recipe.repository.RecipeRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;


public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this); // initializing mock

        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }

    @Test
    public void getRecipes() throws  Exception{
        Recipe recipe = new Recipe();
        HashSet<Recipe> recipeData = new HashSet<Recipe>();
        recipeData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeData);
        Set<Recipe> recipeSet = recipeService.getRecipes();

        assertEquals(recipeSet.size(), 1);
        //to check if find all was called once
        verify(recipeRepository, times(1)).findAll();
    }

    @Test
    public void getRecipeByIdTest() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        Optional<Recipe> recipeOptional = Optional.of(recipe);

        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);

        Recipe recipeReturned = recipeService.findById(1L);

        assertNotNull("Null recipe returned", recipeReturned);
        verify(recipeRepository, times(1)).findById(anyLong());
        verify(recipeRepository, never()).findAll();
    }
}