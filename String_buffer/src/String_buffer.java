import java.util.Scanner;

public class String_buffer
{
public static void main(String[] args)
{
    
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter string which u want to check : ");
 String str=sc.nextLine(); 
 
StringBuffer s1=new StringBuffer(str);
StringBuffer s2=new StringBuffer(s1);

s1.reverse();

System.out.println("Given String is : "+s2);

System.out.println("Reverse String is : "+s1);

if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
System.out.println(str + " is Palindrome");
else
System.out.println(str + " is Not Palindrome");

}
}




