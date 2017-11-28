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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        String[] items = new String[6];
        items[0] = "food";
        items[1] = "DJ";
        items[2] = "hall rental";
        items[3] = "decorations";
        items[4] = "staff fees";
        items[5] = "miscellaneous";

        double[] costs = new double[6];

        for (int i = 0; i < costs.length; i++) {
            System.out.println("How much does the " + items[i] + " cost?");
            costs[i] = input.nextDouble();
        }

        double total = 0;

        for (int i = 0; i < costs.length; i++) {
            total = total + costs[i];
        }

        System.out.println("Your total is: " + total);

        int tickets = (int) Math.ceil(total / 35);

        System.out.println("you have to sell " + tickets + " tickets to break even.");
    }
}
