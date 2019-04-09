
import java.util.Scanner;



public class GameGalia {
    
    static void expectedAmount(int[] a) 
    {
        int fac;
        int len = a.length;
        fac = fact(len);
        int sum2 = 0;
        for(int i=0;i<fac;i++)
        {
            int l=0,r=0,c=0;
            int min ;
            int sum = 0;
            int sum1 = 0;
            for(int j=0;j<len;j++)
            {
                min = a[j];
                for(int k=0;k<len;k++)
                {
                    if(min>a[j])
                    {
                        //r=1;
                        sum=a[j];
                    }
                    else
                    {
                        //l=1;
                        sum1 = a[j];
                    }
                }
                
            }
            sum2 = sum2 + sum +sum1;
            System.out.println("Sum Sum1 Sum2 : " +sum+" "+sum1+" "+ sum2);
        }
        
        int amnt = sum2/fac;
        System.out.println(sum2+"/"+fac);
    }

    static int fact(int a)
    {
        int fac = 1;
        while(a>0)
        {
            fac = a * fac;
            a--;
        }
        return fac;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++)
            {
                a[a_i] = in.nextInt();
            }
            expectedAmount(a);
        }
        in.close();
    }
}
