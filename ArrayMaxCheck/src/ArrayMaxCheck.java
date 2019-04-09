
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ArrayMaxCheck {
    
   
    public static int[] inputArr() throws NumberFormatException,IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.println("n = "+n);
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(in.readLine());
        }
        return arr;
    }

    public static int checkMax(int[] arr)
    {
        int n = arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) throws NumberFormatException,IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[] = inputArr();
        
        System.out.println(checkMax(arr));
        
        
    }
    
}
