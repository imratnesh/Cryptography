import java.util.Scanner;
import javax.swing.*;
class CaeserCipher
{
    public static void main (String args[])
    {
       String plain="abcdefghijklmnopqrstuvwxyz";
       Scanner in =new Scanner(System.in);
      
       //String text=in.nextLine();
       String text = JOptionPane.showInputDialog(null, "enter ur text");
       char[] c;
       c =new char[text.length()];
       /*for(int i=0;i<26;i++)
       {
           if(i<23)
       System.out.println(plain.charAt(i)+" = "+plain.charAt(i+3));
           else
               System.out.println( plain.charAt(i)+ " = " +plain.charAt(i-23));
       
       }*/
       //System.out.print("Cipher text = ");
       // System.out.print(text.length());
      for (int i=0;i<text.length();i++)
       
      {
                   
          int k = plain.indexOf(text.charAt(i)); //taking character from enter text finding its index no. in plain
          int t=k+3;                             //rotating by 3
          if(k!=-1 && t<26)                      //k=-1 for index other than 0to25 index for a-w
          {
           c[i]= plain.charAt(t);
          System.out.print(c[i]);
          }
          else if(t>=26)                        //index for x-z
                  {
                      c[i]= plain.charAt(t-26);
                      System.out.print(c[i]);
                  }
          else                                  //for space 
          {
              System.out.print(" ");
          }
              
      }
      String cipher=String.copyValueOf(c);      //char array to string
      JOptionPane.showMessageDialog(null,"Cipher text = " +cipher );
    }
}