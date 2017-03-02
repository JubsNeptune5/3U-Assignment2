/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 * move robot from any point to 0,0
 *
 * @author hunterlaverty
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City
        City kw = new City();

        //Create Robot
        Robot ay = new Robot(kw, 45, 124, Direction.NORTH);

        //Check if robots on avenue 0
        while (ay.getAvenue() > 0) {
            //move to be in right direction
            while (ay.getDirection() != Direction.WEST) {
                //turn till facing west
                ay.turnLeft();
            }
            //move bot to get to 0
            ay.move();
        }
        //Check if robots on avenue 0
        while (ay.getAvenue() < 0) {
            //move to the right direction
            while (ay.getDirection() != Direction.EAST) {
                //turn to face direction
                ay.turnLeft();
            }
            //move robot to get to 0
            ay.move();
        }
        //Check the Street if its greater than 0
        while (ay.getStreet() > 0) {
            //Move to the right direction to move to the origin
            while (ay.getDirection() != Direction.NORTH) {
                //turn to face north direction
                ay.turnLeft();
            }
            //move bot to 0
            ay.move();
        }
        //Check the stret is lees than zero
        while (ay.getStreet() < 0) {
            //rotate to the south direction to move to the origin
            while (ay.getDirection() != Direction.SOUTH) {
                //turn to face south
                ay.turnLeft();
            }
            //move bot to 0
            ay.move();
        }
    }
}
