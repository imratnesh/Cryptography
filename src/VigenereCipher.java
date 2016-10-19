/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hcl
 */
import java.util.Scanner;
public class VigenereCipher 
{
    public static void main(String args[])
    {
        String key= new String();           //for key using encryption
        String plain = new String();
        String cipher =new String();
        
        plain="abcdefghijklmnopqrstuvwxyz";
               
       Scanner in =new Scanner(System.in);
       
       System.out.println("Enter ur plain text");
           
       String text = in.nextLine();
       System.out.println("Enter ur key");
           
       key = in.nextLine();
       //key = "dece"; // d =>3,e=>4
       
       char[] c;
       c =new char[text.length()];
       for (int i=0;i<text.length();i++)
       {
           char k =key.charAt(i);                   //char at 0,1...
           int p  =plain.indexOf(k);                //index in plain
           int t=p+plain.indexOf(text.charAt(i));  //finding index of text + shifting with key
           if(t-p!=-1&& t<26)                       
           { 
               c[i]=plain.charAt(t);
           
           System.out.print(c[i]);
           }
           else if(t>=26)
                   {
                     c[i]=plain.charAt(t-26);
                     System.out.print(c[i]);
                   }
           else 
               System.out.print(" ");
           
       }
    }
}
