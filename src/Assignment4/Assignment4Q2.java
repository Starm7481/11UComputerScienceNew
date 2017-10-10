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
public class Assignment4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("please enter your measurment in inches");

        Scanner inches = new Scanner(System.in);

        double inch = inches.nextDouble();
        
        double cm =  (inch * 2.54);
        
        System.out.println("that is " + cm + " centimeters");
    }
}
