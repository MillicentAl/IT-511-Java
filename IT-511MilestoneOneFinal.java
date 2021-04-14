/**
 * @author Millicent Alhamis
 * @title  Milestone 1: The Ingredient Class
 * @date   05-Dec-2017
 *
 */
 
package TheIngredientClass;

import java.util.Scanner;

// New java class and private fields 
public class Ingredient {
    private String ingredientName;
    private String unitMeasurement; 
    private float ingredientAmount;
    private double numberCaloriesPerUnit; 
    private double totalCalories;
    

// Ingredient Name (Set and Return)
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
    public String getIngredientName() {
        return ingredientName;
    }

//Unit Measurement (Set and Return)
    public void setUnitMeasurement (String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }
    public String getUnitMeasurement() {
        return unitMeasurement;
    }
    
//Ingredient Amount (Set and Return)
    public void setIngredientAmount(float ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }
    public float getIngredientAmount() {
        return ingredientAmount;
    }

//Number of Calories per Unit (Set and Return)
    public void setNumerCaloriesPerUnit(int numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
    }
    public double getNumberCaloriesPerUnit() {
        return numberCaloriesPerUnit
    }

//Total Calories (Set and Return)
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
    public double getTotalCalories() {
        return totalCalories;
    }

}

/**
 * Program execution by prompting user for ingredient information. 
 * Creation of new ingredient object.
 */

import java.util.Scanner;

public class NewIgredient {
    public static void main(String[] args) {
        this.ingredientName = "";
        this.ingredientAmount = 0.0;
        this.numberCaloriesPerUnit = 0.0;
        this.totalCalories = 0.0;

        Scanner scnr = new Scanner(System.in);

    //Prompt user for Igredient Name    
        System.out.println("Please enter igredient name");
        if (scnr.hasNextString()) {
            ingredientName = scnr.nextLing();
        }
        else{
            System.out.println("Error, Please enter a valid name with characters only: ");
        }

    //Prompt user for Unit Measurement   
        System.out.println("Please enter the ingredient's unit of measurement from the provided options: ");
        System.out.println("Tbsp");
        System.out.println("Tsp");
        System.out.println("Cup(s)");
        System.out.println("Gram(s)");

        if(scnr.hasNextString()) {
            unitMeasurement = scnr.next();
        }
            if ((unitMeasurement == "Tbsp") || (unitMeasurement == "Tsp") || (unitMeasurement == "Cup(s)") || (unitMeasurement == "Gram(s)")) {
                System.out.println("You have entered " + unitMeasurement);

             }
            else {
             System.out.println("Please enter one of previous options.");
             }
             
        else {
            System.out.println("Please enter one of previous options.");
        }

    //Prompt user for  Ingredient Amount (number of units)   
        System.out.println("Please enter the number of units of " + ingredientName + " required. Must be between 1 and 100");

        if (scnr.hasNextInt()) {
            ingredientAmount = scnr.hasNextFloat();
        }
            if ((ingredientAmount >= 1) && (ingredientAmount <= 100)){
                System.out.println(ingredientAmount + " is a valid amount.");

            }
            else {
                System.out.println(ingredientAmount + " is an invalid amount.");
                System.out.println("Please enter a number between 1 and 100: ");

                    if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                        System.out.println(ingredientAmount + "is a valid.");

                    }
                    else if (ingredientAmount < 1) {
                        System.out.println(ingredientAmount + " is less than 1. Error");

                    }
                    else {
                        System.out.println(ingredientAmount + " is greater than 100. Error");
                }
            else {
                System.out.println("Error: That is not a number. Try again.");
            }

        //Prompt user for number of calories per unit    
            System.out.println("Please enter the number of calories per unit of " + ingredientName + " {between 1 and 3000}: ");

            if (scnr.hasNextInt()) {
                numberCaloriesPerUnit = scnr.nextInt();

                if((numberCaloriesPerUnit >=1) && (numberCaloriesPerUnit <=3000)) {
                    System.out.println(numberCaloriesPerUnit + " is a valid number.");    

                else {
                    System.out.println(numberCaloriesPerUnit + " is invalid number of calories. ");
                    System.out.println("Please enter a valid number of  calories per unit between 1 and 3000: ");

                    if((numberCaloriesPerUnit >=1) && (numberCaloriesPerUnit <=3000)) {
                        System.out.println(numberCaloriesPerUnit + " is a valid number.");
                    }
                    else if (numberCaloriesPerUnit < 1) {
                        System.out.println(numberCaloriesPerUnit + " is less than 1. Error");
    
                    }
                    else {
                        System.out.println(numberCaloriesPerUnit + " is greater than 3000. Error");
    
                    }
                }
        else {
            System.out.println("Error: That is not a number. Try again.");
        
         //Total calories calculation
            totalCalories = ingredientAmount * numberCaloriesPerUnit;

            System.out.println(ingredientName + "uses" + ingredientAmount + "number of" + unitMeasurement + ", containing" + totalCalories + "total calories");
            System.out.println("Ingredient has been successfully added.");

             }
    return
            }
        }
    
    }
}