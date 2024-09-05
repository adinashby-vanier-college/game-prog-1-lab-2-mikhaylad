// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        /* Crab will move towards to edge and then turn right at a random angle (0 to 180 degrees).*/
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(180));
        }
        /* If the Crab manages to touch either player, Seahorse or Lobster, the touched player will die and be removed from the game.*/
        removeTouching(Seahorse.class);
        removeTouching(Lobster.class);
    }
}
