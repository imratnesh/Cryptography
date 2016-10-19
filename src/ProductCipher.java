/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcl
 */
import java.util.Scanner;
public class ProductCipher {
    public static void main(String args[])
    {
        int k=0xff;             //255 t hexno. 
        String text; 
        System.out.println("Enter ur text");
        Scanner in= new Scanner(System.in);
        
        text=in.nextLine();
        byte [] m =new byte[text.length()];
        for (int i = 0; i <text.length(); i++)
        {
            
           int temp=(int)text.charAt(i);    //one char 
           
           m[i]= (byte)(temp ^ k) ;         //xor
          // System.out.println(m[i]); 
            //m[i]= Integer.toBinaryString(temp);
           // m[i] =
          System.out.print((char)m[i]);         
        }
            
    }
    
}
