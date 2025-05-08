package Entities;

import java.util.ArrayList;
import java.util.stream.Collectors;
 
public class Poison {
    private ArrayList<Ingredient> recipe = new ArrayList<Ingredient>();
    private int cookingTime;
    private String efficiency;
    
    public Poison(){}

    public ArrayList<Ingredient> getRecipe() {
        return recipe;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setIngredient(Ingredient ingredient) {
        this.recipe.add(ingredient);
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
    
    public String getStringRecipe(){
        String result = "";
        for (Ingredient ingredient : recipe) {
            result += ingredient.toString() + "; ";
        }
        return result;
    }
}
