/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * Clearing snow off a sidewalk
 *
 * @author hunterlaverty
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City kw = new City();

        //creating bot
        Robot re = new Robot(kw, 0, 2, Direction.SOUTH);

        //Create road
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);

        //creating sidewalk
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);

        //Create driveway
        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);

        //Creating drive way
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);

        //creating Driveway
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.SOUTH);

        //create Snow on road
        new Thing(kw, 1, 0);
        new Thing(kw, 2, 0);
        new Thing(kw, 3, 0);
        new Thing(kw, 4, 0);
        new Thing(kw, 7, 0);
        new Thing(kw, 9, 0);
        new Thing(kw, 0, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 7, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 1);

        //creating snow on sidewalk
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 7, 7);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 8, 6);

        //Snow banks outside of the driveways
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 6);
        new Thing(kw, 4, 6);
        new Thing(kw, 4, 7);
        new Thing(kw, 5, 5);
        new Thing(kw, 6, 4);
        new Thing(kw, 6, 6);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 6);

        //Shovel the snow
        while (true) {
            //if the front is clear when heading to the drive way
            while (re.frontIsClear()) {
                //move down sidwalk
                re.move();
                //when heading down sidewalk, check if bot can pick up thing
                while (re.canPickThing()) {
                    //bot will pick it up
                    re.pickThing();

                    //turn top face east, down drive way
                    while (re.getDirection() != Direction.EAST) {
                        //turn
                        re.turnLeft();
                    }
                    //if bot can pick thing up while turning, it does s
                    while (re.frontIsClear()) {
                        re.move();
                        while (re.canPickThing()) {
                            //bot will pick it up
                            re.pickThing();
                        }
                    }
                    //when the front isn't clear
                    while (!re.frontIsClear()) {
                        //turn till bot faces south
                        while (re.getDirection() != Direction.SOUTH) {
                            //turn left
                            re.turnLeft();

                            //if bot can pick thing up while turning, it does s
                            while (re.canPickThing()) {
                                //bot will pick it up
                                re.pickThing();
                            }
                        }
                        //when bot tuirns and the front is clear 
                        while (re.frontIsClear()) {
                            //move
                            re.move();
                        }
                        //when the bot turns and front isnt clear
                        while (!re.frontIsClear()) {
                            //when the bot doesn't face west
                            while (re.getDirection() != Direction.WEST) {
                                //turn
                                re.turnLeft();

                                //if bot can pick thing up while turning, it does s
                                while (re.canPickThing()) {
                                    //bot will pick it up
                                    re.pickThing();
                                }
                            }
                        }

                    }
                    //after turning to get out of driveway
                    while (re.frontIsClear()) {
                        //move
                        re.move();
                        //when bot can pick up the thing
                        while (re.canPickThing()) {
                            //bot will pick it up
                            re.pickThing();
                        }
                    }
                    //when finally exit the drive way
                    //check if bot can pick up thing
                    if (re.canPickThing()) {
                        //pick up thing
                        re.pickThing();
                    }
                    //check if bot is facing 
                    while (re.getDirection() != Direction.SOUTH) {
                        //turn to face south
                        re.turnLeft();
                    }
                }

            }

        }
    }
}
