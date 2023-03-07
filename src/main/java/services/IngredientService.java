package services;

import model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long ingredientNumber);
    Ingredient editIngredient(long ingredientNumber, Ingredient ingredient);
    boolean deleteIngredient(long ingredientNumber);

}
