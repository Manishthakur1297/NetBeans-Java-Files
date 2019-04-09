import java.util.*;
import java.io.*;
 
public class Explorer {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("explorer");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}