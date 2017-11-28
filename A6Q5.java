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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// creates a size for the array 
        int x = 10;

        double[] fn = new double[x];

        System.out.println("Enter all your numbers!");

        Scanner numbers = new Scanner(System.in);
// gets all the numbers  in an array 
        for (int i = 0; i < fn.length; i++) {
            fn[i] = numbers.nextDouble();
        }

        int len = fn.length;

        System.out.println("Your numbers in order are:");
// bubble sorts the array 
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (fn[j - 1] > fn[j]) {
                    double temp = fn[j - 1];
                    fn[j - 1] = fn[j];
                    fn[j] = temp;
                }
            }
        }
// prints out the array 
        for (int i = 0; i < fn.length; i++) {
            System.out.println(fn[i]);
        }

        // finds the middle of the array 
        int y = fn.length / 2;
// creates integers to find the median 
        double median = fn[y];

        double mone = fn[y];
        double mtwo = fn[y - 1];

        //  this is what it will print out if the size of the array is even 
        double smedian = ((mone + mtwo) / 2);
//checks to see if the size of the array is even then prints accordingly 
        if ((len % 2 == 0)) {
            System.out.println("Your median mark is " + smedian);

        } else {
            System.out.println("Your median mark is " + median);
        }

    }
}
