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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creates a new scanner for the amount this will become the size of the array 
        Scanner am = new Scanner(System.in);
        
        System.out.println("Enter how many marks you would like to calculate");
        
        
        
        int x = am.nextInt();
        
        double[] fn = new double[x];
        // populates the array with the numbers 
        System.out.println("Enter all your numbers!");    
        
        Scanner numbers = new Scanner(System.in);
        
        for(int i = 0; i< fn.length; i++){
            fn[i] = numbers.nextDouble();
        }
        
        int len = fn.length;
        // bubble sorts the numbers and prints them 
        System.out.println("Your numbers in order are:");
        
        for (int i = len-1; i>=0;i--){
            for(int j = 1; j<=i; j++){
                if(fn[j-1]>fn[j]){
                    double temp = fn[j-1];
                    fn[j-1] = fn[j];
                    fn[j] = temp;
                }
            } 
        }
        
        for(int i = 0; i < fn.length; i++){
            System.out.println(fn[i]);
        }
        
        // uses what we had last question to find the median 
        int y = fn.length/2;
        
        double median = fn[y];
        
        double mone = fn[y];
        double mtwo = fn[y-1];
        
        double smedian = ((mone+mtwo)/2);
        
        if((len%2==0)){
            System.out.println("Your median mark is " + smedian);
            
        }
        else{
            System.out.println("Your median mark is " + median);
        }
        // finds the average and prints it 
        double total = 0;
           for(int i=0; i <x; i++){
                total = total + fn[i]; 
            }
            
           
           
            double average = total/x;
            
            System.out.print("Your class average is " + average);
            
        
        
    
        
    }
}
