package services;

import model.Ingredient;
import model.Recipe;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(long recipeNumber);



}
