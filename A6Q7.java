/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Starm7481
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// asks the user for a size, that way this program can have real world applications 

System.out.println("what is the limit that you would like to search to? ");

        Scanner numbers = new Scanner(System.in);
        
        int size = numbers.nextInt()+1;
        
        // creates an array that is the desired size the npopulates it 
        
        int nums[] = new int[size];

        int x = 0;

        for (int i = 2; i < nums.length; i++) {
            nums[x] = i;
            x = x + 1;
        }
        
        // this commented code out code below was for testing but i'll leave it in anyways 
        
        //int numstemp[] = nums;

        /*   for(int i=0; i <nums.length; i++){
         System.out.println(nums[i]);
         }
         */


// this is where the magic happens
// this is the mother loop, this scans through numbers 2 to size
        for (int p = 2; p < nums.length; p++) {      
            // then the number from the loop above is multiplied (to all of its multiples below the max size of the array) and all of its multiples are set to 0, 
            for (int i = 2; i < nums.length; i++) {    
                // checks that the number won't exceed the length of the array 
                if ((i * p)-2 < nums.length){ 
                    // this checks that the number isn't out of bounds, then sets the multiples of nums[x] to 0
                    // we also have to shift the number back two spots because we are starting at the second spot in the array in the first for loop 
                        nums[(i * p)-2] = 0;  
                }
               
            }               
        }
        // prints out all the numbers in the array that aren't 0s these are the prime numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                System.out.println(nums[i]);
            }
        }

    }
}