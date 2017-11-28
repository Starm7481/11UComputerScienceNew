/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author starm7481
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creates scanner and ints for the amount of kids in the class 
        System.out.print("Please enter how many kids are in the class: ");

        Scanner input = new Scanner(System.in);

        Scanner words = new Scanner(System.in);

        double total = 0;

        int kids = words.nextInt();
// creates arrays  for the heights of the kids 
        double[] tallpeople = new double[kids];

        double[] heights = new double[kids];
// collects the heights in an array 
        for (int i = 0; i < kids; i++) {

            System.out.print("height of the kids ");
            heights[i] = input.nextDouble();
        }
        // grabs the total by adding onto itself 

        for (int i = 0; i < kids; i++) {
            total = total + heights[i];
        }
// gets the average 
        double average = total / kids;

        System.out.println("Your class average is:" + average);

        // goes back and fills an array with heights that are above the average 
        for (int i = 0; i < kids; i++) {
            if (heights[i] > average) {
                tallpeople[i] = heights[i];
            }

        }
        // prints out the heights of the tall kids

        System.out.println("The heights that are above average are");

        int tall = tallpeople.length;

        for (int i = 0; i < tall; i++) {

            if (tallpeople[i] > 0) {
                System.out.println(tallpeople[i]);
            }

        }

    }
}
