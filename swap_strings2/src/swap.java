import java.io.*;
public class swap{
        public static void main(String args[]) throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            System.out.println("\nNumbers Before Swapping:");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            //Swap
            x = y-x+(y=x);
            System.out.println("\nNumbers After Swapping:");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
}