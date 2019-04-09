import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountPairs {

    static int countPairs(int n) {
        
        int i=0;
        int b;
        int count = 0;
        while(i<n)
        {
            int a = sum(i);
            for(int j=i+1;j<=n;j++)
            {
                b = sum(j);
                if(a<b)
                {
                    count++;
                }
            }
            i++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(n);
        int result = countPairs(n);
        System.out.println(result);
        in.close();
    }

//    private static int sum(int i) 
//    {
//        int sum1 = 0;
//        String s = String.valueOf(i);
//        int len  = s.length();
//        for(int j=0;j<len;j++)
//        {
//            int a = Character.getNumericValue(s.charAt(j));
//            //System.out.println("a   "+a);
//            sum1 = sum1+a;
//        }
//        //System.out.println("Sum  "+sum1);
//        if(sum1>9)
//        {
//            sum1 = sum(sum1);
//        }
//        //System.out.println("Sum final  "+sum1);
//        return sum1;
//    }
    
    public static int sum(int m)
    {
        int n, sum1 = 0;
        while(m > 0)
        {
            n = m % 10;
            sum1 = sum1 + n;
            m = m / 10;
        }
        if(sum1>9)
        {
            sum1 = sum(sum1);
        }
        return sum1;
    }
    
}
