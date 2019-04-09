import java.util.Scanner;

public class Seating_arrangement {

    public static void main(String[] args) {
        
        int t,n,a,b,c;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of test cases : ");
        t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            a=0;
            b=0;
            c=0;
            System.out.print("Enter Seat Number :: ");
            n = sc.nextInt();
            a = n/6;
            b = n%6;
            if(b==0)
            {
                if(a%2==0)
                {
                    c=6*(a-1)-(6-b)+1;
                    System.out.println("Seat Number opposite to "+n+" = "+c+" and WS type.");
                }
                else
                {
                    c=6*(a+1)-(6-b)+1;
                    System.out.println("Seat Number opposite to "+n+" = "+c+" and WS type.");
                }
            }
            
            else
            {
                if(a%2==0)
                {
                    c = 6*(a+1)+(6-b)+1;
                    System.out.println("Seat Number opposite to "+n+" = "+c);
                  
                }
                else
                {
                    c=6*(a-1)+(6-b)+1;
                    System.out.println("Seat Number opposite to "+n+" = "+c);
                    
                }
                if(b%3==1 && b<3)
                    {
                        System.out.println("WS");
                    }
                    else if(b%3==1 && b>3 || b%3==0)
                    {
                       System.out.println("AS"); 
                    }
                    else
                    {
                        System.out.println("MS"); 
                    }
            }
            
        }
        
    }
    
}
