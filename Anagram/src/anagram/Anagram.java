package anagram;

import java.util.Scanner;


public class Anagram {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First String : ");
        String str1 = sc.next();
        StringBuilder str3 = new StringBuilder(str1.toLowerCase());
        System.out.println("Enter Second String : ");
        String str2 = sc.next();
        StringBuilder str4 = new StringBuilder(str2.toLowerCase());
        System.out.println(str3 +"  "+ str4);
        
        if(str3.length()!=str4.length())
        {
            System.out.println("Not Anagrams");
        }
        else
        {
            int len = str3.length();
            int i = 0;
            while(i<len)
            {
                int j = 0;
                int flag = 0;
                while(j<str3.length())
                {
                    
                    if(str3.charAt(i)==str4.charAt(j))
                    {
                        
                        str4.replace(j, j+1, " ");
                        flag = 1;
                        break;
                    }
                    j++;
                }
                if(flag==1)
                {
                 i++;   
                }
                else
                {
                    break;
                }
                
            }
            if(i==len)
            {
                System.out.println("Anagrams");
            }
            else
            {
                System.out.println("Not Anagrams");
            }
            
        }
        
        
    }
    
}
