import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class delete_Words
{
   public static void main(String args[]) throws IOException
   {
       String str1, str2;
       Scanner scan = new Scanner(System.in);
       
       Process process = new ProcessBuilder("C:\\Program Files (x86)\\Cyberoam\\Cyberoam General Authentication Client\\CyberoamClient.exe","151344","wcm").start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;

        System.out.printf("Output of running %s is:", Arrays.toString(args));

        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
   }
}