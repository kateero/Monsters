package Entities;

import java.util.List;
 
public class Poison {
    private List<Ingredient> recipe;
    private int cookingTime;
    private String efficiency;

    public List<Ingredient> getRecipe() {
        return recipe;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setRecipe(List<Ingredient> recipe) {
        this.recipe = recipe;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
    
}
