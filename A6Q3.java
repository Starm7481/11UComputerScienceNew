/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author MacUD5H
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creates a scanner and an array
        System.out.println("Enter all your numbers!");

        Scanner numbers = new Scanner(System.in);

        int nums[] = new int[2];
// collects the two numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbers.nextInt();
        }
// creates temoorary integers 
        int numsz = nums[0];
        int numso = nums[1];
// this was a testing check but i'll leave it in anyways 
        System.out.println("Your first number is");

        System.out.println(numsz);

        System.out.println("Your second number is");

        System.out.println(numso);
// swaps the numbers if the first number was greater than the second 
        if (nums[0] > nums[1]) {
            nums[1] = numsz;
            nums[0] = numso;
        }
        // prints out the array of numbers in order 
        System.out.println("Your numbers in order are");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

}
