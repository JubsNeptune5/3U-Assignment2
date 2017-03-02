/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * To Move around a castle
 *
 * @author hunterlaverty
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new kingdom
        City eng = new City();

        //Create knight
        Robot nite = new Robot(eng, 1, 2, Direction.EAST);

        //Create piler
        new Wall(eng, 1, 1, Direction.EAST);
        new Wall(eng, 1, 1, Direction.NORTH);
        new Wall(eng, 1, 1, Direction.WEST);
        new Wall(eng, 1, 1, Direction.SOUTH);

        //Create piler
        new Wall(eng, 1, 4, Direction.EAST);
        new Wall(eng, 1, 4, Direction.NORTH);
        new Wall(eng, 1, 4, Direction.WEST);
        new Wall(eng, 1, 4, Direction.SOUTH);

        //Create piler
        new Wall(eng, 4, 1, Direction.EAST);
        new Wall(eng, 4, 1, Direction.NORTH);
        new Wall(eng, 4, 1, Direction.WEST);
        new Wall(eng, 4, 1, Direction.SOUTH);

        //Create piler
        new Wall(eng, 4, 4, Direction.EAST);
        new Wall(eng, 4, 4, Direction.NORTH);
        new Wall(eng, 4, 4, Direction.WEST);
        new Wall(eng, 4, 4, Direction.SOUTH);

        //Creating centre castle
        new Wall(eng, 2, 2, Direction.NORTH);
        new Wall(eng, 2, 3, Direction.NORTH);
        new Wall(eng, 2, 3, Direction.EAST);
        new Wall(eng, 3, 3, Direction.EAST);
        new Wall(eng, 3, 3, Direction.SOUTH);
        new Wall(eng, 3, 2, Direction.SOUTH);
        new Wall(eng, 3, 2, Direction.WEST);
        new Wall(eng, 2, 2, Direction.WEST);

        //Move around the castle
        while (true) {
            //move if clear
            nite.move();
            //Did knight aproach piler
            if (!nite.frontIsClear()) {
                //Move around piler
                nite.turnLeft();
                nite.move();
                nite.turnLeft();
                nite.turnLeft();
                nite.turnLeft();
                nite.move();
                nite.move();
                nite.turnLeft();
                nite.turnLeft();
                nite.turnLeft();
                nite.move();
                nite.move();
                nite.turnLeft();
                nite.turnLeft();
                nite.turnLeft();
                nite.move();
                nite.turnLeft();

            }
        }
    }
}
