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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// creates array for the makrs 
        int x = 10;

        double[] fn = new double[x];
// collects marks and populates array 
        System.out.println("Enter all your marks!");

        Scanner numbers = new Scanner(System.in);

        for (int i = 0; i < fn.length; i++) {
            fn[i] = numbers.nextDouble();
        }

        // an integer for the size of the array 
        int len = fn.length;

        System.out.println("Your marks in order are:");

        // this is a bubble sort 
        // it uses what I learned in Q3 and just makes it a little bit more complex, with the same principle ideas 
        for (int i = len - 1; i >= 0; i--) {
            // this is the big for loop that starts at the highest end of the array and counts backwards 
            for (int j = 1; j <= i; j++) {
                // this is the smaller array that compares numbers side by side
                
                // this is what we used in the previous question 
                if (fn[j - 1] > fn[j]) {
                    // creates temporary values and swaps them if they are out of order then the loop moves onto the next pair
                    double temp = fn[j - 1];
                    fn[j - 1] = fn[j];
                    fn[j] = temp;
                }
            }
        }
// prints the array
        for (int i = 0; i < fn.length; i++) {
            System.out.println(fn[i]);
        }

    }
}
