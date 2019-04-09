import java.util.Arrays;

public class String4 {

public static void main(String[] args) {

java.util.Scanner scn=new java.util.Scanner(System.in);

System.out.println("enter a String:");

String s1=scn.nextLine();

for(int i=0;i<=s1.length()-1;i++)

{

char c=s1.charAt(i);

if((c>=65&&c<=90)||(c>=97&&c<=122))

{

System.out.println("string is alpha numeric");

break;

}

else

{

System.out.println("string only numeric");

break;

}

}

}

}