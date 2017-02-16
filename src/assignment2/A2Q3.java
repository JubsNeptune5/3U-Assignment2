/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author laveh2107
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City
        City kw = new City();

        // Create Bot
        Robot ay = new Robot(kw, -6, 10, Direction.WEST);
        //when it doesn't facwe east turn to face east
        while (ay.getDirection() != Direction.EAST) {
            ay.turnLeft();
        }
        //Turn robot north
        //Check Street 
        //move up if it is in negative avenue
        if (ay.getStreet() < 0) {
            ay.turnLeft();
            ay.turnLeft();
            ay.turnLeft();
            while (ay.getStreet() < 0) {
                ay.move();
            }
        }
        //move down if it is in positive avenue
        if (ay.getStreet() > 0) {
            ay.turnLeft();
            while (ay.getStreet() > 0) {
                ay.move();
            }
        }
        //move up if it is in negative avenue
        if (ay.getAvenue() < 0) {
            while (ay.getAvenue() < 0) {
                ay.move();
            }
        }
        //move down if it is in positive avenue
        if (ay.getAvenue() > 0) {
            ay.turnLeft();
            ay.turnLeft();
            ay.turnLeft();
            while (ay.getAvenue() > 0) {
                ay.move();
            }
        }
    }
    //Keep moving north until on street 0
    //Turn Robot west
    //keep moving until on avenue 0
}
