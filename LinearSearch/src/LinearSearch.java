import java.util.Scanner;

public class LinearSearch {

    //----------------Function to Sort Array-------------------
    
    static int[] sorted(int arr[])
    {
        int l,max,temp;
        l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }  
        }
        return arr;        
    }
    
    //------------function to search key in array-------------
    
    static void search(int arr[],int key)
    {
        int i,l,flag=0,position=0;
        l=arr.length;
        for(i=0;i<l;i++)
        {
            if(arr[i]==key)
            {
                position=i+1;
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Sorry,Key doesn't exist in the array");
        }
        else
        {
            System.out.println(key+ " found at position " + position);
        }
        
    }
    
    //-----------------------Main Menu------------------------------
    
    public static void main(String[] args) {
        
        int i,n,b[],key,c;
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        
        //---------Enter values to array-------------
        
        for(i=0;i<n;i++)
        {
           System.out.print(i+1 +" Element : "); 
           a[i]=sc.nextInt();
        }
        //-----------------Sort the array--------------------
        
        b=sorted(a);
        
        System.out.println("\nSorted Array :-->");
        
        
        //-----------------------Display the Sorted Array-----------
        
        for(i=0;i<n;i++)
        {
           System.out.println(i+1 +" Element : "+a[i]);
        }
        
        //---------------Enter search key u want to find-----------
        
        System.out.print("\nEnter the number u want to search: ");
        
        key=sc.nextInt();
        
        search(b,key);
        
        
        
    }
    
}