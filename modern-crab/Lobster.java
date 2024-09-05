// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* The goal of the Lobster is to eat the Seahorse before the Crab, while also avoiding contact with the Crab.*/
        move(4);
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
        /* If the Lobster comes in contact with the Seahorse, it eats it and the Seahorse "dies" and is removed from the game.*/
        removeTouching(Seahorse.class);
    }
}
