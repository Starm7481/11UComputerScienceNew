/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Starm7481
 */
public class Assignment4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.print("Please enter your name: ");

        Scanner name = new Scanner(System.in);

        String names = name.nextLine();

        // End of name 

        System.out.println("What was the first test out of?: ");

        Scanner toone = new Scanner(System.in);

        double tooneMs = toone.nextDouble();

        System.out.println("What mark did you get?: ");

        Scanner tione = new Scanner(System.in);

        double tioneMs = tione.nextDouble();



        // End of test one 

        System.out.println("What was the second test out of?: ");

        Scanner totwo = new Scanner(System.in);

        double totwoMs = totwo.nextDouble();

        System.out.println("What mark did you get?: ");

        Scanner titwo = new Scanner(System.in);

        double titwoMs = titwo.nextDouble();

        // End of test two 

        System.out.println("What was the third test out of?: ");

        Scanner tothree = new Scanner(System.in);

        double tothreeMs = tothree.nextDouble();

        System.out.println("What mark did you get?: ");

        Scanner tithree = new Scanner(System.in);

        double tithreeMs = tithree.nextDouble();

        // end of Test three 

        System.out.println("What was the fourth test out of?: ");

        Scanner tofour = new Scanner(System.in);

        double tofourMs = tofour.nextDouble();

        System.out.println("What mark did you get?: ");

        Scanner tifour = new Scanner(System.in);

        double tifourMs = tifour.nextDouble();

        // End of test four 

        System.out.println("What was the fifth test out of?: ");

        Scanner tofive = new Scanner(System.in);

        double tofiveMs = tofive.nextDouble();

        System.out.println("What mark did you get?: ");

        Scanner tifive = new Scanner(System.in);

        double tifiveMs = tifive.nextDouble();

        // end of test five 
        // Everything Above was just a pattern of creating scanners 
        // for the tests in order to get numbers to figure the score out of later on 

        System.out.println("Test Scores for " + names);

        double sone = tioneMs / tooneMs;

        double stwo = titwoMs / totwoMs;

        double sthree = tithreeMs / tothreeMs;

        double sfour = tifourMs / tofourMs;

        double sfive = tifiveMs / tofiveMs;

        // creates variables for the test scores in percent 

        double Avrg = sone + stwo + sthree + sfour + sfive;

        // creates a variable for the average, this hasn't been divided yet 

        System.out.println("Test one score: " + sone * 100 + "%");

        System.out.println("Test two score: " + stwo * 100 + "%");

        System.out.println("Test three score: " + sthree * 100 + "%");

        System.out.println("Test four score: " + sfour * 100 + "%");

        System.out.println("Test five score: " + sfive * 100 + "%");

        // prints the test scores 


        System.out.println(names + " your average is: " + Avrg * 100 / 5 + "%");

        //prints the average 
    }
}
