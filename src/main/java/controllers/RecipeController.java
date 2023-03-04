package controllers;

import model.Recipe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.RecipeService;
import services.RecipeServiceImpl;

@RestController
@RequestMapping("/recipe")

public class RecipeController {

    private RecipeServiceImpl recipeService;

    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {

        Recipe createdRecipe = recipeService.addRecipe(recipe);
        return ResponseEntity.ok(createdRecipe);

    }

    @PostMapping("/{recipeNumber}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable long recipeNumber){

        Recipe recipe = recipeService.getRecipe(recipeNumber);

        if (recipe == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(recipe);
    }



}
