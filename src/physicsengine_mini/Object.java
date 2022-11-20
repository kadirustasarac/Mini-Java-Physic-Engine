/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package physicsengine_mini;

import static java.lang.Math.abs;

/**
 *
 * @author Abdulkadir
 */
public class Object {
    static public final int gravity = 1,limit = 2;
    public int velocityX = 0,velocityY =0,cordinatesX = 1,cordinatesY = 1;
    public boolean collusion = false;
    Object(int velocityX,int velocityY,int cordinatesX,int cordinatesY)
    {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.cordinatesX = cordinatesX;
        this.cordinatesY = cordinatesY;
    }
    void setLoc()
    {
        this.cordinatesX += velocityX;
        if(collusion)
        {
            velocityY += -1*(abs(velocityY+1));
        }
        this.cordinatesY += velocityY;
        //if(velocityX >= gravity){
        if(velocityY <= limit){
          this.velocityY += gravity;
        }
        //}     
    }
}
