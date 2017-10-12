/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Starm7481
 */
public class Quizone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();

        Robot kevin = new Robot(kw, 3, 3, Direction.EAST);

        kw.showThingCounts(true);

        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 5, Direction.NORTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.NORTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.EAST);

        new Thing(kw, 3, 5);
        new Thing(kw, 3, 6);
        new Thing(kw, 3, 7);

        // sets up the scene 

        int mine = 0;

        // integer for amount of debris 

        while (true) {
            while (mine < 3) {
                while (kevin.canPickThing() == false) {
                    kevin.move();
                }
                kevin.pickThing();
                kevin.turnLeft();
                kevin.turnLeft();

                while (kevin.frontIsClear() == true) {
                    kevin.move();
                }
                kevin.putThing();
                kevin.turnLeft();
                kevin.turnLeft();

                if (kevin.canPickThing() == true) {
                    kevin.move();
                }

                mine = mine + 1;
            }
            //  counts how many times he has picked up "debris" and stops after three pieces
            // have been picked up

            kevin.turnLeft();
            kevin.turnLeft();
            kevin.move();
            kevin.turnLeft();
            kevin.turnLeft();

            // moves the robot back to its starting position 
            break;

            // ends the program 
        }

    }
}
