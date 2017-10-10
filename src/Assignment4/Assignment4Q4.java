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
public class Assignment4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner food = new Scanner(System.in);

        System.out.print("How much does the food for prom cost? ");
        
        int foods = food.nextInt();
        
        Scanner dj = new Scanner(System.in);
        
        System.out.print("How much does the DJ for prom cost? ");
        
        int djs = dj.nextInt();
        
        Scanner rent = new Scanner(System.in);
        
        System.out.print("How much does the rent for prom cost? ");
        
        int rents = rent.nextInt();

        Scanner dec = new Scanner(System.in);
        
        System.out.print("How much do the decorations for prom cost? ");
        
        int decs = dec.nextInt();
        
        Scanner staff = new Scanner(System.in);
        
        System.out.print("How much do the staff for prom cost? ");
        
        int staffs = staff.nextInt();

        Scanner mis = new Scanner(System.in);
        
        System.out.print("How much does the miscellaneous stuff for prom cost? ");
        
        int miss = mis.nextInt();
        
        int cost = foods + djs + rents + decs + staffs + miss;
        
        int tickets = (cost / 35);
        
        System.out.print("The total cost is $" + cost + ". You will need " + tickets + " tickets to break even!");
        
    }
}
