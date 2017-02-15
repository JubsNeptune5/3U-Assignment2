package assignment2;

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
 * @author laveh2107
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City
        City kw = new City();
        
        // Create Bot
        Robot ay = new Robot(kw, 0, 0, Direction.EAST);
        
        //Creating walls
        new Thing(kw, 0, 1);
    }
}
