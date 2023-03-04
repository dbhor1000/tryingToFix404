package services;

import model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private static Map<Long, Ingredient> ingredientsList = new HashMap<>();
    private static long ingredientId = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {

        ingredientsList.putIfAbsent(ingredientId++, ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(long ingredientNumber) {

        return ingredientsList.get(ingredientNumber);

    }




}
