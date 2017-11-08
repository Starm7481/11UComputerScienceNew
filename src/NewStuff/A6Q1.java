/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStuff;

import java.util.Scanner;

/**
 *
 * @author starm7481
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.print("Please enter how many kids are in the class: ");
Scanner input = new Scanner(System.in); 
        
            Scanner words = new Scanner(System.in);
            
            double total = 0;

            int kids = words.nextInt();
            
            double[] marks = new double[kids];
            
            for(int i = 0; i < kids; i++){
                
                System.out.print("what are the marks of the kids ");
                marks[i] = input.nextDouble();
            }
            
            for(int i=0; i <kids; i++){
                total = total + marks[i]; 
            }
            
            double average = total/kids;
            
            System.out.print("Your class average is:" + average);
            
            
            
            
        
    }
}
