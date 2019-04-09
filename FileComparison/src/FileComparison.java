import java.io.*;

public class FileComparison {

    public static void main(String[] args)throws IOException {
        
       int i=0,j=0;
       FileInputStream f1;
       FileInputStream f2;
       
       /**************************************************
        *                                                *
        * File1.txt -------  Compare Files               *
        *                                                *
        * File2.txt -------  Compare Files               *
        *                                                *
        * Both contains similar content.........         *
        *                                                *
        *************************************************/
       
       
       String s1="C:\\Users\\acer\\Documents\\File1.txt";
       String s2="C:\\Users\\acer\\Documents\\File2.txt";
       
       
       try{
            f1 = new FileInputStream(s1);
           }
        catch(FileNotFoundException ex)
             {
                 System.out.println("Sorry, "+s1+" File Not Found at this location");
                 return;
             }
       try{
            f2 = new FileInputStream(s2);
           }
        catch(FileNotFoundException ex)
             {
                 System.out.println("Sorry, "+s2+" File Not Found at this location");
                 return;
             }
       
       try{
           do{
               i=f1.read();
               j=f2.read();
               if(i!=j)
                   break;
           }while(i!=-1&&j!=-1);
           
           }
       catch(IOException ex)
       {
           System.out.println("File Error.........");
       }
       
       if(i!=j)
       {
           System.out.println("Files contains different content.");
       }
       else
       {
           System.out.println("Files contains same content.");
       }
    }
    
}
