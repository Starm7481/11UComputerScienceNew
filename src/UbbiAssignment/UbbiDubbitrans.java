package UbbiAssignment;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Starm7481
 */
public class UbbiDubbitrans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
         * ----The plan-----------
         * Check the word for vowels 
         * Check each 'vowel' postion if the position ahead of it has a vowel as well
         * place 'ub' before each single vowel 
         * for each double vowel only put ub in front of the first vowel
         * us and if else and for loop to check vowels, split the if and else into 
         * single vowel and double vowel 
         * 
         */
        
         System.out.print("Please enter your word: ");

            Scanner words = new Scanner(System.in);

            String word = words.nextLine();
            
            int x = 0;
            
            while(x < 1){
                
                
                for(int i = 0; i < word.length(); i++){
                    
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ){
                    
                    String front = word.substring(0, i);
                    
                    String ending = word.substring(i);
                    // asseble translation 
                    
                    String translated =  front + "ub" + ending;
                    
                     String first = front + "ub";
                    
                     for(int s = 0; s < ending.length(); s++){
                    // loop to find a second variable 
                     if(ending.charAt(s) == 'a' || ending.charAt(s) == 'e' || ending.charAt(s) == 's' || ending.charAt(s) == 'o' || ending.charAt(s) == 'u' ){
                         
                         
                    String sfront = ending.substring(0, i);
                    
                    String sending = ending.substring(i);
                    // asseble translation 
                    
                    String ssending =  first + sfront + "ub" + sending;
                    
                    System.out.println(word + " in UbbiDubbi is " + ssending);
                    
                    // assemble whole word 
                    
                     }
                    
                     
                     }
                    
                    
                    
                    
                    
                    x = x+1;
                    
                    break;   
                    
                    
                    
                }
            }
    }
    }
}
