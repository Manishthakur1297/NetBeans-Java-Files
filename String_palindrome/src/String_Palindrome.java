import java.util.*;
import java.lang.*;
 
public class String_Palindrome
{  
    public static void main(String args[])
    {
        String str;
        String reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String which u want to check : ");
        
        str = sc.nextLine();
        
        int len=str.length();
        
      
         for(int i=len-1;i>-1;i--)
        {
        reverse=reverse+str.charAt(i);
        }
        System.out.println("After Reversing, String is: " + reverse);
 
        if(str.equals(reverse))
        {
        System.out.println("Input String is Palindrome");
        }else{
                 System.out.println("Input String is not a Palindrome");
        }
    }
}