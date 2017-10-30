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
        int x = 0;
        
        while(x < 1){
        
         System.out.print("Please enter your word: ");

            Scanner words = new Scanner(System.in);

            String word = words.nextLine();
            
            String ex = "EXIT";
            
            if(word.equals(ex)){
                
                System.out.print("goodbye");
                
               break;
                
            }
            
            String translate = "";
            
            Boolean foundvowel = false; 
            
            for(int i = 0; i < word.length(); i++){
                
                // look for a vowel at spot i 
                if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')  && foundvowel == false){
                    
                  translate = translate + "ub";
                  
                  translate = translate + word.charAt(i);
                  
                  foundvowel = true; 
                  
                  
                }else{
                    
                    if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true){
                        translate = translate + word.charAt(i);
                    }else{
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }
                }
            
            
    }
            
            System.out.print(translate);
            x = x +1;
            
        }
        
}
}
