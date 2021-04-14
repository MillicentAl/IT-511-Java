package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *@author Millicent 
 * SteppingStone 5 
 */

// Declaration of class

public class SteppingStone5_Recipe {
    
    private String recipeName;

    private int servings;

    ArrayList<String> recipeIngredients = new ArrayList();

    private int totalRecipeCalories;
  
//Mutators and accessors for each class variable 
   
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }
    public void setServings(int servings) {
        this.servings = servings;
    }
    public int getServings() {
        return servings;
    }
    public void setTotalRecipeCalories(int setTotalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    public int getTtotalRecipeCalories() {
        return totalRecipeCalories;
    }
// New object (Constructor)
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<String>(); 
        this.totalRecipeCalories = 0;

    }
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients
        this.totalRecipeCalories = totalRecipeCalories;
    }
// Print of recipe method
    public void printRecipe() {
        int singleServingCalories = (totalRecipeCalories / servings);

        System.out.println("Recepie: " + recipeName);

        System.out.println("Serves: " + servings);

        System.out.println("Ingredients: ");

        for (int i = 0; i <recipeIngredients.size(); i++) {
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }

        System.out.println("Each serving has " + singleServingCalories + "Calories.");
    }
    
    public static void main(String[] args) {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt()

// Add more ingredients with Do-While loop
        do {
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();

            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
                break;

            } else {
                recipeIngredients.add(ingredientName);
                addMoreIngredients = true;
        
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
        totalRecipeCalories = (ingredientCalories * ingredientAmount);
            
            }
       } 
        
            while (!reply.equals("n") ;
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
    }
}

