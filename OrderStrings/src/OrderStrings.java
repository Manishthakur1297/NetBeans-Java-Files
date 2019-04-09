
import java.util.Scanner;



public class OrderStrings {

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[]str = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }
        int order = sc.nextInt();
        Boolean reversal = sc.nextBoolean();
        String way = sc.next();
        
        check(n,str,order,reversal,way);
    }

    private static void check(int n, String[] str, int order, Boolean reversal, String way) 
    {
        String[] str1 = null,str2 =null;
        for(int i=0;i<n;i++)
        {
            str1 = str[i].split(" ");
           
        }
         int len = str1.length;
         int no = len/n;
         
         for(int i=order-1;i<len;i=i+no)
         {
             if(order==0)
             {
                 break;
             }
             else
             {
                 str2[i] = str1[i]; 
             }
         }
         for(int k=0;k<n-1;k++)
         {
            for(int i=0;i<n-1;i++)
            {
                if(way=="lexicographic")
                {
                    int l1 = str2[i].length();
                    int l2 = str2[i+1].length();
                    if(l2<l1)
                    {
                           for(int j=0;j<l2;j++)
                            {
                                if(str2[i].charAt(j)==str2[i+1].charAt(j))
                                {

                                }
                                else if(str2[i].charAt(j)>str2[i+1].charAt(j))
                                {
                                    String temp = str2[i];
                                    str2[i] = str2[i+1];
                                    str2[i+1] = temp;
                                }
                            } 
                        
                    }
                    else
                    {
                        for(int j=0;j<l1;j++)
                        {
                            if(str2[i].charAt(j)==str2[i+1].charAt(j))
                            {

                            }
                            else if(str2[i].charAt(j)>str2[i+1].charAt(j))
                            {
                                String temp = str2[i];
                                str2[i] = str2[i+1];
                                str2[i+1] = temp;
                            }
                        }
                    }
                }
                else
                {
                            if(str2[i].compareTo(str2[i+1])>0)
                            {
                                String temp = str2[i];
                                str2[i] = str2[i+1];
                                str2[i+1] = temp;
                            }
                }
            }
         }
         
         for(int i=0;i<n;i++)
         {
             System.out.println(" " + str2[i] + " ");
         }
       
    }
    
}
