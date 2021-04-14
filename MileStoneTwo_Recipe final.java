package MileStoneTwo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *@author Millicent 
 * MileStoneTwo
 */

// Declaration of class

public class MileStoneTwo_Recipe {
    
    private String recipeName;

    private int servings;

    ArrayList<String> recipeIngredients = new ArrayList();

    private double totalRecipeCalories;
  
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
    public void setTotalRecipeCalories(double setTotalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    public double getTtotalRecipeCalories() {
        return totalRecipeCalories;
    }
// New object (Constructor)
    public MileStoneTwo_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<String>(); 
        this.totalRecipeCalories = 0.0;

    }
// Constructor Overloaded
    public MileStoneTwo_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
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
    
    public void addNewRecipe() {
        double  totalRecipeCalories = 0;
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
        MileStoneTwo recipe1 = new MileStoneTwo(recipeName, servings, recipeIngredients, totalRecipeCalories);
        
        recipe1.printRecipe();

        return recipe1;
    }
}
// Pseudocode for custom method (via Stepping Stone Five Lab)
/* Constructing new ArrayList for users to submit and print, (via printRecipe()), step by step instructions. 
*
Public Method EnterInstructions
1. Enter a new String ArrayList, "Instructions"
    - Create mutators and accessors
2. Do
    1. Ask user for first Instructions
    2. Add boolean addMoreIngredients statement
    3. Prompt user for additional Instructions, if any. (Y/N)

        - If yes - Boolean addMoreIngredients = True
        - if no - Boolean addMoreIngredients = False
            - Break
    while addMoreIngredients = True
3. Print each different Instructions
4. Return and break Method
*
*/