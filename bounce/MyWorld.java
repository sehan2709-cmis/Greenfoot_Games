import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,140,109);
        block block = new block();
        addObject(block,139,149);
        spike spike = new spike();
        addObject(spike,169,144);
        for (int i = 1; i < 4; i++)
        {
            addObject(new block(), 169 + i*30, 149);
        }
        spike spike2 = new spike();
        addObject(spike2,289,144);
        spike spike3 = new spike();
        addObject(spike3,320,144);
        boost boost = new boost();
        addObject(boost,350,144);
        for (int i = 1; i < 18; i++)
        {
            addObject(new spike(), 342 + i*30, 200);
        }
        Sand sand = new Sand();
        for (int i = 1; i < 7; i++)
        {
            addObject(new Sand(), 968 - i*90, 360);
        }
        block block5 = new block();
        addObject(block5,322,433);
        Sand sand7 = new Sand();
        addObject(sand7,160,464);
        Sand sand8 = new Sand();
        addObject(sand8,127,464);
        Sand sand9 = new Sand();
        addObject(sand9,127,497);
        Sand sand10 = new Sand();
        addObject(sand10,160,497);
        block block6 = new block();
        addObject(block6,129,596);
        Sand sand11 = new Sand();
        addObject(sand11,194,497);
        Sand sand12 = new Sand();
        addObject(sand12,194,463);
        block block7 = new block();
        addObject(block7,129,667);
        boost boost2 = new boost();
        addObject(boost2,191,668);
        Star star = new Star();
        addObject(star,226,87);
        Star star2 = new Star();
        addObject(star2,546,140);
        Star star3 = new Star();
        addObject(star3,914,145);
        Star star4 = new Star();
        addObject(star4,737,287);
        Star star5 = new Star();
        addObject(star5,479,284);
        Star star6 = new Star();
        addObject(star6,158,380);
        for (int i = 1; i < 7; i++)
        {
            addObject(new Star(), 273 + i*90, 634);
        }
        star2.setLocation(536,123);
        star3.setLocation(921,126);
        Star star13 = new Star();
        addObject(star13,127,631);
        Sand sand13 = new Sand();
        addObject(sand13,954,679);
        Star star14 = new Star();
        addObject(star14,954,583);
        star14.setLocation(951,597);
    }
}
