package SteppingStones;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @Millicent 
 * 
 * SteppingStone Lab 4: Loops
 */
import java.util.Scanner;
import java.util.ArrayList;



public class SteppingStone4_Loops {
    
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String recipeName = "";
       ArrayList<String> ingredientList = new ArrayList();
       String newIngredient = "";
       boolean addMoreIngredients = true;
       
       System.out.println("Please enter the recipe name: ");
       recipeName = scnr.nextLine();
       
       /**
        * 
        */
        Outer:
       do {           
           System.out.println("Would you like to add an ingredient? (y or n)");
           String reply = scnr.next().toLowerCase();
           switch (reply) {
               
            case "y" :
                System.out.println("Please enter name of Ingredient": );
                ingredientList.add(scnr.next());
                break;

            case "n":
                break Outer;
            
            default:
                system.out.println("Please enter y or n");
                break;
           }

           System.out.println("Would you like to add addition ingredients? (y or n)");
           String reply2 = scnr.next().toLowerCase();
           switch (reply) {

            case "y":
                addMoreIngredients = true;
                break;

            case "n":
                addMoreIngredients = false
                break Outer;
                
            default:
                addMoreIngredients = false;
                break Outer;
           }    
       } while (addMoreIngredients);
       
       for (int i = 0; i < ingredientList.size(); i++) {      
		   String ingredient = ingredientList.get(i);
           System.out.println(ingredient);
       }
    }
}



