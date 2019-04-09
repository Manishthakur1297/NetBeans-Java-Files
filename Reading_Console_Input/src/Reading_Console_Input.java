import java.io.*;

public class Reading_Console_Input {

    public static void main(String[] args)throws IOException {
        
        int n,b;
        
        
        //------------Read()------------------------------------
        
        
        byte data[] = new byte[10];
        int a[] = new int[10];
        
        System.out.println("Enter 10 characters only: ");
        System.in.read(data);
        System.out.println("You have Entered : ");
        for(int i=0;i<data.length;i++)
        {
            a[i]=(int)data[i];
            System.out.println((int)data[i] +" " +(char)data[i]);
        }
        
        //-------------Write()---------------------------------
        
        for(int i=0;i<data.length;i++)
        {
            
            System.out.write(a[i]);
            System.out.write('\n');
        }     
        
        
    }
}
