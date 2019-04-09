import java.util.Scanner;
public class uadratik
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Vlera e a: ");
        double a=sc.nextDouble();
        System.out.print("Vlera e b: ");
        double b=sc.nextDouble();
        System.out.print("Vlera e c: ");
        double c=sc.nextDouble();
         
        if(a==0&&b!=0)                                   
        {
        System.out.println("Ekuacioni eshte linear dhe x= "+(-c/b));
        System.exit(0);
        }
        if(a==0&&b==0&&c!=0)
        {
            System.out.println("Ekuacioni nuk ka zgjidhje");
            System.exit(0);
        }
        if(a==0&&b==0&&c==0)
        {
            System.out.print("Sistemi eshte i pacaktuar");
            System.exit(0);
        }
        double d=Math.pow(b,2)-4*a*c;
         
        if(d<0)
        {
            d=Math.abs(d);
            double x1=(-b+Math.sqrt(d))/2*a;
            double x2=(-b-Math.sqrt(d))/2*a;
            System.out.println("x1="+x1+"i , x2="+x2+"i");
        }
        else{
        double x1=(-b+Math.sqrt(d))/2*a;
        double x2=(-b-Math.sqrt(d))/2*a;
        System.out.println("x1="+x1+" ,x2="+x2);
    }
    }
     
}