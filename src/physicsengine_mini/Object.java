/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package physicsengine_mini;

/**
 *
 * @author Abdulkadir
 */
public class Object {
    static public final int gravity = 1;
    public int velocityX = 0,velocityY =0,cordinatesX = 1,cordinatesY = 1;
    Object(int velocityX,int veloxityY,int cordinatesX,int cordinatesY)
    {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityX = velocityX;
        this.velocityY = veloxityY;
    }
    void setLoc()
    {
        this.cordinatesX += velocityX;
        this.cordinatesY += velocityY;
        //if(velocityX >= gravity){
          this.velocityY += gravity;
        //}     
    }
}
