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
public class Assignment4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please enter the speed limit: ");

        Scanner limit = new Scanner(System.in);

        int limits = limit.nextInt();

        System.out.print("Please enter your speed: ");

        Scanner speed = new Scanner(System.in);

        int speeds = speed.nextInt();

        int over = speeds - limits;

        // creates scanners for the speed limit and speed 


        while (true) {
            if (speeds <= limits) {
                System.out.print("Congratulations you are within the speed limit!");
            }
            if (over > 1 && over < 20) {
                System.out.print("Your fine is $100");
            }
            if (over > 21 && over < 30) {
                System.out.print("Your fine is $270");
            }
            if (over > 30) {
                System.out.print("Your fine is $500");
            }

            // checks what the speed is and prints the fine 

            break;
            // ends the program after one run 

        }
        // in a while loop(temporarily disabled) in the case that someone would want to run the on repeat 
    }
}
