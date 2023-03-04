package services;

import model.Recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeServiceImpl implements RecipeService {

    private static Map<Long, Recipe> recipesList = new HashMap<>();
    private static long recipeId = 0;

    @Override
    public Recipe addRecipe(Recipe recipe) {

        recipesList.putIfAbsent(recipeId++, recipe);
        return recipe;
    }

    @Override
    public Recipe getRecipe(long recipeNumber) {

        return recipesList.get(recipeNumber);

    }
    
    
}
