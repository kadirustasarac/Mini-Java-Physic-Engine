/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package physicsengine_mini;
import java.util.Scanner;
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
        graphMaker(xlength, ylength);
        
    }
    public static void graphMaker(int xlength,int ylength)
    {
        int[][] cordinates = new int[ylength][xlength];
        cordinates[0][0] = 2;
        System.err.println(cordinates[0][1]);
        System.err.println(cordinates[0].length);
        String Table[] = new String[ylength*2+1];
        //                         0       1      2          3         4
        String[] tableConstr = {"-----",  "|"  ,  ""  ,  "     "  ,   " "  };
        String obj = "  O  ";
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
                       /* for(int h =0 ; h < cordinates.length;h++)
                        {
                            
                            for(int b = 0;b < cordinates[h].length;b++)
                            {
                                if(cordinates[h][b] == 2)
                                {
                                    System.out.println(cordinates[h][b]);
                                    Table[y] += obj;
                                }
                                
                            }
                        }*/
                        Table[y] += tableConstr[3];
                    }
                } 
            }
        }
        for(int tabnum = 0;tabnum < Table.length;tabnum++)
        {
            System.out.println(Table[tabnum]);
        }
   
    }
    
}
