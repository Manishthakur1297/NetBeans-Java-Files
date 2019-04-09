import java.util.Scanner;

public class BubbleSort {
    
//------------------Enter data Function---------------------------------
    
   static int [] enter_data()
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements u want to sort :");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements--->");
        
        for(i=0;i<n;i++)
        {
            System.out.print((i+1)+" Element : ");
            a[i]=sc.nextInt();
        }
        return a;
    }

    //--------------------Bubble Sort Function-----------------------------
    
    static int [] bubblesort(int a[])
    {
        int i,j,temp,len;
        len=a.length;
        
        for(i=0;i<len;i++)
        {
            for(j=0;j<len-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        return a;
    }
    
    //-----------------Print array---------------------------------------
    
    static void printarray(int arr[])
    {
        int i,len;
        len=arr.length;
         System.out.println("\nAfter Sorting Elements are : ");
         for(i=0;i<len;i++)
        {
            System.out.println((i+1)+" Element : "+arr[i]);
        }
    }
    
    
    //-----------------------Main Function-------------------------------
    
    public static void main(String[] args) {
        
        int a[],b[];
        
        a=enter_data();
        
        b=bubblesort(a);
        
        printarray(b);
        
    }
    
}
