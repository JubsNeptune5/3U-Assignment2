package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

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
        Robot ay = new Robot(kw, 1, 0, Direction.EAST);

        //Creating Track
        new Wall(kw, 1, 0, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);

        //create hurdle
        new Wall(kw, 1, 0, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 1, 6, Direction.EAST);

        //Create thing
        new Thing(kw, 1, 8);

        //Move to end hurdles

        while (true) {
            //Check if it can move
            //yes, move, no, turn over hurdle
            //end if can pick up
            //Check if bot can move
            //while (!ay.canPickThing()) {
                //Check if front is clear
                while (ay.frontIsClear()) {
                    //Move if clear
                    ay.move();
                //}
                //Jump over hurdle
                ay.turnLeft();
                ay.move();
                ay.turnLeft();
                ay.turnLeft();
                ay.turnLeft();
                ay.move();
                ay.turnLeft();
                ay.turnLeft();
                ay.turnLeft();
                ay.move();
                ay.turnLeft();
            }
            //Stop once the bot is on the bot
            break;
        }


    }
}
