/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;
import java.util.Scanner;

public class SteppingStone2_IngredientCalculator {
   
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        public class SteppingStone2_Ingredients{
           private String nameOfIngredient = " ";
           private float numberCups = 0.0; 
           private int numberCaloriesPerCup = 0;
           private double totalCalories = 0.0;
        }
       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the name of the ingredient: ");
       nameOfIngredient = scnr.next();
       
       System.out.println("Please enter the number of cups of " 
        + nameOfIngredient + " we'll need: ");
       numberCups = scnr.nextFloat();
       
       System.out.println("Please enter the name of calories per cup: ");
       numberCaloriesPerCup = scnr.nextInt();
       
        totalCalories = numberCups * numberCaloriesPerCup;
       
       System.out.println(nameOfIngredient + " uses " + numberCups 
       + " cups and has " + totalCalories + " calories.");
       
    }
    
}
