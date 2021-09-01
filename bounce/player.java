import greenfoot.*;  
public class player extends Actor
{    
    int gx = 0;
    int gy = 0;
    int bt = 0;
    int gacc = 40;
    int a = 0;
    int count = 0;
    public void act() 
    {
        control();
        movement();
        bounce();
        restart();
        boost();
        dust();
        star();
        gameover();
    }
    public void control()
    {
        if (Greenfoot.isKeyDown("left") == true)
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right") == true)
        {
            move(3);
        }
    }
    public void movement()
    {
        setLocation(getX() + gx, getY() + gy);
    }
    public void bounce()
    {
        if (isTouching(block.class))
        {
            gy = - 7;
            bt = 18;
            gacc = 40;
        }
        else
        { 
           if (a == 0)
           { if (bt != 0)
             {
                bt = bt-1;
                if (gy == 0)
                {
                    gy = -3;
                }
                else
                {
                    gy = gy + 1;
                }
             }
             else if (gy != 4 && bt == 0)
             {
                gy++;
                gacc = gacc-1;
             }
             else if (gacc == 0)
             {
                gy = 4;
             }
             else
             {
                gy = 2;
                gacc = gacc-1;
             }
           }
        }
    }
    public void restart()
    {
        if (isTouching(spike.class))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        else if (getY() == 699)
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public void boost()
    {
        if (a == 1) 
        {    if (Greenfoot.isKeyDown("left") == true)
            {
                move(-3);
                gx = 0;
                gy = 4;
                a = 0;
            }
            if (Greenfoot.isKeyDown("right") == true)
            {
                move(3);
                gx = 0;
                gy = 4;
                a = 0;
            }
        }
        else if (a == 0)
        { 
          if (isTouching(boost.class))
          { 
             gx = 5;
             gy = 0;
             a = 1;
          }
        }
    }
    public void dust()
    {
        Actor bloc = getOneIntersectingObject(Sand.class);
        if (bloc != null)
        {
            getWorld().removeObject(bloc);
            gy = - 8;
            bt = 25;
            gacc = 40;
        }
    }
    public void star()
    {
        Actor hit = getOneIntersectingObject(Star.class);
        if (hit != null)
        {
            getWorld().removeObject(hit);
            count++;
        }
    }
    public void gameover()
    {
        Actor win = new win();
        if (count == 14)
        {
            getWorld().addObject(win,450,300);
            Greenfoot.stop();
        }
    }
}
