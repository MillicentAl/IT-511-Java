package SteppingStones;

import java.util.ArrayList;

import java.until.Scanner;

public class SteppingStone6_RecipeBox {
	
    //Declaration of variable
    private ArrayList<SteppingStone6_RecipeBox> listOfRecipes = new ArrayList();

    //Accesor and Mutator 
    public void setListOfRecipes(ArrayList<SteppingStone6_RecipeBox> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }
    public ArrayList<SteppingStone6_RecipeBox> getListOfRecipes() {
        return listOfRecipes; 
    }

    //Constructors (initial & Overloaded)
    public void SteppingStone6_RecipeBox() {
        this.listOfRecipes = new ArrayList<SteppingStone6_RecipeBox>();
    }
    public void SteppingStone6_RecipeBox(ArrayList<SteppingStone6_RecipeBox> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

//Print All Recipe Details(String): void Method 
//Pseudo (All memebers of ArrayList ListOfRecipes, calling printRecipe() method via SS5)
    Public void printAllRecipeDetails() {
        SteppingStone5_Recipe tmpRecipe = new SteppingStone5_Recipe(); 
        
        int i = 0;
        for (i = 0; i <listOfRecipes.size(); i++) {
            tmpRecipe.printRecipe();
        }
    }

//Print All Recipe Names(): void Method
//Pseduo (All members of ArrayList ListOfRecipes, printRecipeName())
    public void printAllRecipeDetails() {

        int i = 0;
        for (i = 0; i <listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }
    }

//Add Recipe Method(): void Method (From SS5)
    public void addNewRecipe() {
        SteppingStone5_Recipe tmpRecipe2 = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        tmpRecipe2.addNewRecipe();
    }
    
    /**
     * MENU
     * 
     */


       /**
    	* A variation of following menu method should be used as the actual main 
    	* once you are ready to submit your final application.  For this 
    	* submission and for using it to do stand-alone tests, replace the 
    	* public void menu() with the standard 
    	* public static main(String[] args)
    	* method
    	*
    	*/
	
	public void menu() {
    	// Create a Recipe Box
    		
		//SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);
        
		
		/**
		* Print a menu for the user to select one of the three options:
		*
		*/
		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
         
         while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			*/
			
			if (input == 1) {
                newRecipe();

            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                printAllRecipeDetails(selectedRecipeName);

            } else if (input == 3) {
                
				
				for (int j = 0; j < listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName()); 
                }

            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipesBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipesBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			*
			*/
			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
	}

}
