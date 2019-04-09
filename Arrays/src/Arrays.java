import java.util.Scanner;

public class Arrays {
    
 private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        
        System.out.println("Enter The Size Of Array U Want : \r");
        int n =scanner.nextInt();
        int[] myintegers = getintegers(n);
        int[] print = printarray(myintegers);        
    }
    
    public static int[] getintegers(int n)
    {
        int [] array = new int[n];
        System.out.println("Enter " + n + " values to the array : \r" );
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        return array;
    }
    
    public static int[] printarray(int[] array)
    {
        System.out.println("Entered Arrays values : \r");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
            
        }
  return array;
    }
}
    

        
        
