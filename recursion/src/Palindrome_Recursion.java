import java.util.Scanner;

public class Palindrome_Recursion
{
   
    public static boolean isPal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            return true; 
        
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPal(s.substring(1, s.length()-1));
        
       return false;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String for check String Palindrome : ");
        String string = sc.nextLine();
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}