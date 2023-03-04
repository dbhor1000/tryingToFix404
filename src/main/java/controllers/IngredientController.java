package controllers;

import model.Ingredient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.IngredientServiceImpl;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private IngredientServiceImpl ingredientService;

    public IngredientController(IngredientServiceImpl ingredientService){

        this.ingredientService = ingredientService;

    }

    @PostMapping
    public ResponseEntity<Ingredient> addIngredient(@RequestBody Ingredient ingredient) {

        Ingredient addedIngredient = ingredientService.addIngredient(ingredient);
        return ResponseEntity.ok(addedIngredient);

    }


    @GetMapping("/{ingredientNumber}")
    public ResponseEntity<Ingredient> getIngredient(@PathVariable long ingredientNumber) {

        Ingredient ingredient = ingredientService.getIngredient(ingredientNumber);

        if (ingredient == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ingredient);
    }

}
