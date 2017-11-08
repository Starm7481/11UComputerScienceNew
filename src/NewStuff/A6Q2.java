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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.print("Please enter how many kids are in the class: ");
            
            Scanner input = new Scanner(System.in); 
        
            Scanner words = new Scanner(System.in);
            
            double total = 0;

            int kids = words.nextInt();
            
            double[]tallpeople = new double[kids];
            
            double[] heights = new double[kids];
            
            for(int i = 0; i < kids; i++){
                
                System.out.print("height are the kids ");
                heights[i] = input.nextDouble();
            }
            
            for(int i=0; i <kids; i++){
                total = total + heights[i]; 
            }
            
            double average = total/kids;
            
            System.out.println("Your class average is:" + average);
            
            for(int i=0; i <kids; i++){
                if(heights[i] > average){
                    tallpeople[i] = heights[i];
                }
                
            }
            
            System.out.println("The heights that are above average are");
            
            int tall = tallpeople.length;
            
            for(int i = 0;i < tall; i++){
                
                if(tallpeople[i] > 0){
                System.out.println(tallpeople[i]);
                }
            
            }
            
            
    }
}
