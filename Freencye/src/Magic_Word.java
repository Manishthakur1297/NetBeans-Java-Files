import java.util.Scanner;
import static java.lang.Math.abs;

public class Magic_Word {
    
    public static String createString(int stringLength,String strCharacter){
        
        StringBuilder sbString = 
                new StringBuilder(stringLength);
        
        for(int i=0; i < stringLength; i++){
            sbString.append(strCharacter.charAt(i));
        }
        
        return sbString.toString();
    }
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int q=0;q<t;q++)
         {
         int n = sc.nextInt();
         //sc.nextLine();
         
         String str5 = sc.next();
         String str = createString(n,str5);
         String str1="";
        int arr[] = {67,71,73,79,83,89,97,101,103,107,109,113};
        int len = str.length();
        int arr1[] = new int[len];
        int j=0;
        
        
        for(int i=0;i<len;i++)
        {
            arr1[i]=str.charAt(i);
        }
      
        for(int i=0;i<arr1.length;i++)
        {
            int min=arr[0];
            for(int k=1;k<arr.length;k++)
            {
              
                int x=abs(arr1[i]-min);
                int y=abs(arr1[i]-arr[k]);
                if(x>y)
                {
                    min=arr[k];
                }
               
            }
            str1+=(char)min;
        }
        
        
        System.out.println(str1);

         }
         
    }
}
