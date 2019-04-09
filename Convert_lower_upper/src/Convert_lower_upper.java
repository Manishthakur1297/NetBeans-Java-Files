import java.util.Scanner;

public class Convert_lower_upper {

    
    public static void main(String[] args) {
        
        String str = new String();
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter any String :: ");
        str = sc.nextLine();
        String str1 = "";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.toLowerCase().charAt(i))
            {
               str1+= str.toUpperCase().charAt(i);
            }
            else
            {
                str1+= str.toLowerCase().charAt(i);
            }    
        }
        
        System.out.println(str1);
        
    }
    
}
