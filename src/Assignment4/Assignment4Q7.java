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
public class Assignment4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 1;
        // creates an integer for position 
        while (pos < 99) {
            System.out.print("Please enter your roll! ");

            Scanner roll = new Scanner(System.in);

            int rolls = roll.nextInt();

            // scanner for the players dice roll 

            pos = pos + rolls;

            // adds the roll to the players position 

            if (pos == 54) {
                pos = 19;
            }
            if (pos == 90) {
                pos = 48;
            }
            if (pos == 99) {
                pos = 77;
            }
            if (pos == 9) {
                pos = 34;
            }
            if (pos == 40) {
                pos = 64;
            }
            if (pos == 67) {
                pos = 86;
            }
            System.out.println("Your position is " + pos);
            // creates a while loop that checks for snakes and ladders against your roll 
            // then it prints out your position 
        }

        System.out.println("You WIN!!");
        // if your position is greater than ninety nine you must be a winner:) 

    }
}
