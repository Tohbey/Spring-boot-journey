package com.example.recipe.service;

import com.example.recipe.model.Recipe;
import com.example.recipe.repository.RecipeRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
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
}