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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner number = new Scanner(System.in); 
        
        System.out.print("Please enter approximately how many numbers you will input:");
        
        int x = number.nextInt() + 5;
        
        double[] fn = new double[x];
        
        System.out.print("Enter all your numbers!");    
        
        Scanner numbers = new Scanner(System.in);
        
        for(int i = 0; i < x; i++){
            fn[i] = numbers.nextDouble();
        }
        
        double[] sn = new double[x];
        
        int counter = 0;
        
        for(int i = 0; i <x; i++){
            if(fn[i] < )
        }
        
        
    }
}
