/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author laveh2107
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City
        City kw = new City();

        //Create robot
        Robot ay = new Robot(kw, 2, 1, Direction.EAST);

        //Create Things
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 5);
        new Thing(kw, 2, 6);
        new Thing(kw, 2, 7);
        new Thing(kw, 2, 8);
        new Thing(kw, 2, 9);
        new Thing(kw, 2, 10);
        new Thing(kw, 2, 11);

        //move
        ay.move();

        //Loop Picking up thing
        while (true) {
            //check backpack if less than 7
            while (ay.countThingsInBackpack() < 7) {
                //Pick up
                ay.pickThing();
                //move
                ay.move();
             }
            break;
        }
        //move util bot can't pick thing up
        while (ay.canPickThing()) {
            //move
            ay.move();
        }
        







    }
}
