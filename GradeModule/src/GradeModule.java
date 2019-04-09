
import java.util.Scanner;


public class GradeModule {
    
     static Scanner sc = new Scanner(System.in);
    
    private static int physics,chemistry,math,english,computer,average;
    
     private static int total = 0;

    public static void physicsMarks() 
    {
        System.out.print("Enter Marks of Physics : ");
        try
        {
            int marks = sc.nextInt();
            if(marks<0 || marks >100)
            {
                System.out.println("Invalid Marks Entered...Please Enter Again...");
                physicsMarks();                
            }
            else
            {
                physics = marks;
                total = total + physics;
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Enter integer only...");
            sc.next();
            physicsMarks();
        }
    }
    
    public static void chemistryMarks()
    {
        System.out.print("Enter Marks of Cheistry : ");
        try
        {
            int marks = sc.nextInt();
            if(marks<0 || marks >100)
            {
                System.out.println("Invalid Marks Entered...Please Enter Again...");
                chemistryMarks();                
            }
            else
            {
                chemistry = marks;
                total = total + chemistry;
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Enter integer only...");
            sc.next();
            chemistryMarks();
        }
    }
    
    public static void mathMarks()
    {
        System.out.print("Enter Marks of Maths : ");
        try
        {
            int marks = sc.nextInt();
            if(marks<0 || marks >100)
            {
                System.out.println("Invalid Marks Entered...Please Enter Again...");
                mathMarks();                
            }
            else
            {
                math = marks;
                total = total + math;
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Enter integer only...");
            sc.next();
            mathMarks();
        }
    }
    
    public static void englishMarks()
    {
        System.out.print("Enter Marks of English : ");
        try
        {
            int marks = sc.nextInt();
            if(marks<0 || marks >100)
            {
                System.out.println("Invalid Marks Entered...Please Enter Again...");
                englishMarks();                
            }
            else
            {
                english = marks;
                
                total = total + english;
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Enter integer only...");
            sc.next();
            englishMarks();
        }
    }

    public static void computerMarks() 
    {
        System.out.print("Enter Marks of Computer : ");
        try
        {
            int marks = sc.nextInt();
            if(marks<0 || marks >100)
            {
                System.out.println("Invalid Marks Entered...Please Enter Again...");
                computerMarks();                
            }
            else
            {
                computer = marks;
                total = total + computer;
            }
        }
        catch(Exception e)
        {
            System.out.println("Please Enter integer only...");
            sc.next();
            computerMarks();
        }
    }
    
    public static void grade()
    {
        average = total/5;
        if(average>=0 && average<=39)
        {
            System.out.println("Fail...");
        }
        else if(average>=40 && average<=49)
        {
            System.out.println("Third Division...");
        }
        else if(average>=50 && average<=59)
        {
            System.out.println("Second Division...");
        }
        else if(average>=60 && average<=74)
        {
            System.out.println("First Division...");
        }
        else
        {
            System.out.println("Distinction....");
        }
  
    }

   
    
    
    public static void main(String[] args) {
        
        physicsMarks();
        chemistryMarks();
        mathMarks();
        englishMarks();
        computerMarks();
        
        grade();
    }
    
}
