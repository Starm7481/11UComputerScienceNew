import java.awt.Robot;

public class Autoclicker {
    private Robot robot; 
    
    private int delay; 
    
    public Autoclicker() {
        try {
            robot = new Robot();
        }catch(Exception e) {
            e.printStackTrace();
        }
        delay = 10;
    }
    
    public void clickMous (int button) {
        try{
        robot.mousePress(button);
        robot.delay(5);
        robot.mouseRelease(button);
        robot.delay(delay);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void setDelay(int ms){
        this.delay = ms;
    }
}