package Assignment4;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Starm7481
 */
public class Assignment4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        Scanner inputone = new Scanner(System.in);

        Scanner inputtwo = new Scanner(System.in);

        Scanner inputthree = new Scanner(System.in);

        System.out.print("please enter four numbers on different lines");

        double numbers = input.nextDouble();

        double numbersone = inputone.nextDouble();

        double numberstwo = inputtwo.nextDouble();

        double numbersthree = inputthree.nextDouble();

        System.out.print(numbers + "," + numbersone + "," + numberstwo + "," + numbersthree);


    }
}
