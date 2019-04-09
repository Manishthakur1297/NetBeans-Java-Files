import java.util.Scanner;

public class Factorial {

    static int fact(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        int n,r,C,P,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values of n and r to find nCr and nPr below-->");
        System.out.print("Enter value for n :");
        n=sc.nextInt();
        System.out.print("Enter value for r :");
        r=sc.nextInt();
        C= fact(n)/(fact(n-r)*fact(r));
        P= fact(n)/(fact(n-r));
        System.out.println("Permutation i.e nPr = " + P);
        System.out.println("Combination i.e nCr =  " + C);
        
    }
    
}
