package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Starm7481
 */
public class Assignment2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        // TODO code application logic here

        Robot kevin = new Robot(kitchener, 1, 1, Direction.EAST);

        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);

        kevin.move();

        while (kevin.frontIsClear()) {

            if ((kevin.canPickThing())
                    && (kevin.countThingsInBackpack() < 7)) {

                kevin.pickThing();
                kevin.move();

            } else {

                kevin.move();
                kevin.move();
                kevin.move();
                break;

            }


        }
    }
}
