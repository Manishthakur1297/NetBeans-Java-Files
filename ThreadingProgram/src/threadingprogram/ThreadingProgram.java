
package threadingprogram;

import java.util.logging.Level;
import java.util.logging.Logger;


class Count extends Thread
{
    static String str = "";
   Count()
   {
     start();
   }
   public void run()
   {
     try
     {
        for (int i=65 ;i<=69;i++)
        {
           System.out.println("Printing the count " + i);
           str += (char)i;
           System.out.println("Printing the count " + str);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     
   }
}
class ThreadingProgram
{
    static String s;
   public static void main(String args[])
   {
       
      Count cnt = new Count();
      try
      {
          cnt.join();
          s = "cnt";
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      
      if(Count.str.equals("ABCDE"))
      {
          
          Count c = new Count();
       try {
           System.out.println("c = " + s);
           c.join();
       } catch (InterruptedException ex) {
           Logger.getLogger(ThreadingProgram.class.getName()).log(Level.SEVERE, null, ex);
       }
          
      }
   }
}