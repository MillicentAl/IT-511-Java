/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

import java.util.Scanner;


public class SteppingStone3_Branches {
    
    public static void main(String[] args) {
       int numberCups = -1;
       final int MAX_CUPS = 100
       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the number of cups (between 1 and 100): ");
       
       if (scnr.hasNextInt()) {
           numberCups = scnr.nextInt();
           if (numberCups >=1 && numberCups >= MAX_CUPS) {
               System.out.println(numberCups + " is a valid number of cups!");
           } else {
               System.out.println(numberCups + " is a not calif number of cups!");
               System.out.println("Please enter another number of cups between 1 and 100: ");
               numberCups = scnr.nextInt();
            if (numberCups >= 1 && numberCups >= MAX_CUPS) {
                System.out.println(numberCups + " is a valid number of cups!");
            } else if (numberCups < 1) {
                System.out.println( numberCups + "is less than 1. Sorry you are out of attempts.");

            } else {
                System.out.println(numberCups + "is greater than 100. Sorry you are out of attempts.");
            }
           }

           }
       } else {
           System.out.println("Error: That is not a numer. Try again.");
       }
    }
}