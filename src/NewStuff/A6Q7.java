/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStuff;

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

        int nums[] = new int[1001];

        int x = 0;

        for (int i = 2; i < nums.length; i++) {
            nums[x] = i;
            x = x + 1;
        }

        /*   for(int i=0; i <nums.length; i++){
         System.out.println(nums[i]);
         }
         */



        for (int p = 1; p < nums.length; p++) {
            for (int i = 2; i < nums.length; i++) {
                if (nums[p] != 0) {
                    nums[i*p] = 0;
                }
            }
            
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                System.out.println(nums[i]);
            }
            }

    }
}
