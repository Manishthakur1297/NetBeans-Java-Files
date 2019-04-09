package stringtokens;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = 0;
        int count = 0;
        String [] arrOfStr = null ;
        while(i<s.length())
        {
            char c = s.charAt(i);
            if(c==' ' || c==',' || c=='!' || c=='?' || c=='.' || c=='_' || c=='\'' || c=='@')
            {
               
                arrOfStr = s.split(c+"");
                count++;
                
            }
            
            i++;
        }
        
        int len = arrOfStr.length;
        System.out.println(len);
        
        for (String a : arrOfStr)
            System.out.println(a);
    }
    
}
