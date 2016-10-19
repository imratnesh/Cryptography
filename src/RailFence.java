/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcl
 */
import java.util.Scanner;
public class RailFence {
   public char[]  c;
   public int tl;
    public static void main(String args[])
    {
        System.out.println("Enter ur plaintext");
       Scanner in = new Scanner(System.in);
       
       String text=in.nextLine();
       
     double tlD =text.length();
     int tl=(int) Math.ceil(tlD/2);
     System.out.print(tl/2);
     
    
     if(tl%2!=0)
     {
           //char[]  c = text.toCharArray();         //for odd length padd space  inc to even length
           //System.out.print(c.length);
          text=text.concat(".");
          tl=text.length()/2;
     }
     char[][] rf = new char [2][tl];
   
     
     System.out.print(text.length());
     for (int i=0;i<1;i++)
     {
         for(int j=0;j<tl;j++)
         {
             rf[i][j]= text.charAt(j*2);          //encrypt for 0,2,4......
         }
     }
     for (int i=1;i<2;i++)
     {
         for(int j=0;j<tl;j++)
         {
             rf[i][j]= text.charAt(j*2+1);         //encrypt for 1,3,5......
         }
     }
     
     for (int i=0;i<2;i++)
     {
         for(int j=0;j<tl;j++)
         {
            System.out.print(rf[i][j]);            //printing encrypting text
         }
     }
    
    }
    
}
