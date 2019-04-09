
package bruteforce;

import java.util.Scanner;

/**
 *
 * @author Mj 2
 */
public class BruteForce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "abc";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter length of characters : ");
        int n = sc.nextInt();
        
        
        
        for(int i=0;i<str.length();i++)
        {
            StringBuilder sb = new StringBuilder();
                int p = 0;
                while(p<n)
                {
                 sb.append(str.charAt(0));  
                 p++;
                }
            
            String new2 = str.charAt(i)+"";
            
            sb.replace(0,1,new2);              
                
                 //System.out.println(sb);
              // for(int j=0;j<=str.length();j++)
              // {
                int c = 0;
                for(int k=n;k>=1;k--)
                {
                    if(k==1)
                    {
                        String new3 = str.charAt(c)+"";

                        sb.replace(k,k+1,new3);
                    }
                    else
                    {
                     
                        String new3 = str.charAt(c)+"";

                        sb.replace(k-1,k,new3);
                    }
                        for(int l=0;l<=str.length();l++)
                        { 
                            //System.out.println("Len of str : "+l);
                            if(l==str.length() && k>=0)
                            {
                                //System.out.println("Len of str inside : "+l);
                                String new1 = str.charAt(0)+"";

                                sb.replace(n-1,n,new1);

                            }
                            else
                            {
                                try
                                {
                                    String new1 = str.charAt(l)+"";

                                    sb.replace(n-1,n,new1);
                                    System.out.println(sb);
                                }
                                catch(Exception e)
                                {
                                    System.out.println("Exception caught....");
                                }

                            }

                        }

                        c++;
                    
                  
                }
              
        }
    }
   
}
