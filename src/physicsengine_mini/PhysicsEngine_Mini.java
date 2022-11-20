/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package physicsengine_mini;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
/**
 *
 * @author Abdulkadir
 */
public class PhysicsEngine_Mini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //IniEngine();
        IniEngine();
    }
    public static void IniEngine()
    {
        Scanner inpUser = new Scanner(System.in);
        System.out.println("Enter X heigth:");
        int xlength = inpUser.nextInt();
        System.out.println("Enter Y heigth");
        int ylength = inpUser.nextInt();
        System.out.println("Enter Obj Location as a X");
        int objx = inpUser.nextInt();
        System.out.println("Enter Obj Location as a y");
        int objy = inpUser.nextInt();
        System.out.println("Enter Obj Y velocity");
        int vely = inpUser.nextInt();
        System.out.println("Enter Obj X Velocity");
        int velx = inpUser.nextInt();
        Object obj= new Object(velx,vely,objx,objy);
        graphMaker(xlength, ylength,obj);
        
    }
    public static void graphMaker(int xlength,int ylength,Object object)
    {
        
        String Table[] = new String[ylength*2+1];
        //                         0       1      2          3         4
        String[] tableConstr = {"-----",  "|"  ,  ""  ,  "     "  ,   " "  };
        String obj = "  O  ";
        while(true){
            {
            try{
            TimeUnit.MILLISECONDS.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.err.println("An Error happened");
            }
            }
        int CordinatesY = object.cordinatesY,CordinatesX = object.cordinatesX;
        object.setLoc();
        for(int l = 0;l<Table.length;l++)
        {
            Table[l] = "";
        }
        for(int y = 0;y <(2*ylength+1);y++)
        {
            
            if(y % 2 == 0)
            {
               
                for(int x = 0;x < 2*xlength;x++)
                {
                    if(x % 2 == 0)
                    {

                        Table[y] += tableConstr[4];
                    }
                    else
                    {
                        Table[y] += tableConstr[0];
                    }
                }
            }
            else
            {
                for(int x = 0;x < 2*xlength+1;x++)
                {
                    if(x % 2 == 0)
                    {
                        Table[y] += tableConstr[1];
                    }
                    else
                    {
                        if((((CordinatesY*2+1) == y) && ((CordinatesX*2+1) == x)) || (((CordinatesY*2-1) == y) && ((CordinatesX*2-1) == x)) || (((CordinatesY*2-1) == y) && ((CordinatesX*2+1) == x)) || (((CordinatesY*2+1) == y) && ((CordinatesX*2-1) == x)))
                        {
                         Table[y] += obj;   
                        }
                        
                        else
                        {
                        Table[y] += tableConstr[3];
                        }
                    }
                } 
            }
        }
        for(int tabnum = 0;tabnum < Table.length;tabnum++)
        {
            System.out.println(Table[tabnum]);
        }
        if(CordinatesY+6 > ylength)
        {
           
           object.collusion = true;  
           //System.out.println(object.collusion);
        }
        
        else
        {

            object.collusion = false;
        }
        }
    }
    
}
