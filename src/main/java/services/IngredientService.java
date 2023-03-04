package services;

import model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long ingredientNumber);

}
