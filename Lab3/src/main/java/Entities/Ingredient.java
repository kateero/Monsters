package Entities;

public class Ingredient {

    private String nameIngredient;
    private int quantity;
    
    public Ingredient(){}

    public String getNameIngredient() {
        return nameIngredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNameIngredient(String ingredient) {
        this.nameIngredient = ingredient;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return nameIngredient + ", " + quantity;
    }
}