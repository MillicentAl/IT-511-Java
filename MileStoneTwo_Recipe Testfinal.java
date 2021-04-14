package MileStoneTwo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *@author Millicent 
 * MileStoneTwo RecipeTest
 */

public class RecipeTest { 
    public static void main(String[] args) {

//New Recipe Constructor
        final Recipe newRecipe = new Recipe();

//Invoke createNewRecipe() for user input
        Recipe createNewRecipe = newRecipe.createNewRecipe();

//Access printRecipe
        newRecipe.printRecipe();
    }
}