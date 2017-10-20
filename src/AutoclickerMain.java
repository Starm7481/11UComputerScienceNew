import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;


public class AutoclickerMain {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("-----AutoClicker-----");
        System.out.print("Enter the number of desired clicks: ");
        int clicks = scanner.nextInt();
        
        System.out.print("Enter delay between clicks in milliseconds: ");
        int delay = scanner.nextInt();
        System.out.println();
        
        System.out.println("Program will start in 3 seconds");
        
        try{
        Thread.sleep(3000);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        Autoclicker clicker = new Autoclicker();
        clicker.setDelay(delay);
        
        for (int i = 0; i < clicks; i++){
            clicker.clickMous(InputEvent.BUTTON1_MASK);
        }
    }
}        
