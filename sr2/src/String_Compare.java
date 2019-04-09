import java.util.Scanner;

public class String_Compare {

    public static void main(String[] args) {
        
        int i;
        String temp="";
        
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int sub_len = sc.nextInt();
        int len = str.length();
        
        int l =len-sub_len+1;
        String array[] = new String[l];
        
        for(i=0;i<l;i++)
            {
            
            array[i]=str.substring(i,i+sub_len);         
        }
       
        int n = array.length;

        for(int p=0;p<n-1;p++)
        {
        for(int u=p+1;u<n;u++)
            {
            if(array[u].compareTo(array[p])<0)
                {
                temp=array[p];
                array[p]=array[u];
                array[u]=temp;
            }

        }
        }
        System.out.println(array[0]);
        System.out.println(array[n-1]); 
     
    }
}