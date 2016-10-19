/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcl
 */
import java.util.Scanner;
public class RailFence1 {
    public static void main(String args[])
    {
        System.out.println("Enter ur text");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur key");
        Scanner k = new Scanner(System.in);
        String text=in.nextLine();
        int key=k.nextInt();
       // char [] c =new char[text.length()];
        String c="";
        for (int i = 0; i <text.length(); i++)
        {
            if(i%key==0)            //even
            {
                c+=text.charAt(i);
               // System.out.print(c);
            }
           
        }
       for (int i = 0; i <text.length(); i++)
        {
            if(i%key!=0)            //odd
            {
                c+=text.charAt(i);
               // System.out.print(c);
            }
           
        }
       
       // for (int i = 0; i < text.length(); i++) {
            System.out.print(c);   //cipher text
            
       // }
    }
}
