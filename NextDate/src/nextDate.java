import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class nextDate {

	static Scanner sc  = new Scanner(System.in);
	private static int month;
	private static int day;
	private static int year;
	
	private static boolean leap;
        
        public static int nextMonth;
        public static int nextDay;
        public static int nextYear;
	
	public static ArrayList oddM = new ArrayList(Arrays.asList(1,3,5,7,8,10,12));
	public static ArrayList evenM = new ArrayList(Arrays.asList(4,6,9,11));
	public static ArrayList  feb = new ArrayList(Arrays.asList(2));
	
	public static int checkMonth()
	{
		System.out.print("Enter Month : ");
		try
		{
			int m = sc.nextInt();
			if(m>=1 && m<=12)
			{
				month = m;
			}
			else
			{
				System.out.println("Invalid Month Entered....\n");
				checkMonth();
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Month Entered....\n");
			sc.next();
			checkMonth();
		}
		
		return month;
	}
	
	public static int checkDay()
	{
		System.out.print("Enter Day of Month : ");
		try
		{
			int d = sc.nextInt();
			
			if(d>=1 && d<=31)
			{
				if(evenM.contains(month))
				{
					if(d==31)
					{
						System.out.println("Invalid Day Entered for Month....\n");
						checkDay();
					}
					else
					{
						day = d;
                                                if(day ==30 )
                                                {
                                                    nextDay = 1;
                                                    nextMonth = month+1;
                                                    nextYear = year;
                                                }
                                                else
                                                {
                                                    nextDay = day+1;
                                                    nextMonth = month;
                                                    nextYear = year;
                                                }
					}
					
				}
				else if(feb.contains(month))
				{
					if(d <= 28)
					{
                                            day = d;
                                            if(leap == true)
                                            {
                                                nextDay = day+1;
                                                nextMonth = month;
                                                nextYear = year;
                                            }
                                            else
                                            {
                                                nextDay = 1;
                                                nextMonth = month+1;
                                                nextYear = year;
                                            }
						
					}
					else if(d==29 && leap == true)
					{
						day = d;
                                                nextDay = 1;
                                                nextMonth = month+1;
                                                nextYear = year;
					}
					else
					{
						System.out.println("Invalid Day Entered for Month....\n");
						checkDay();
					}
				}
				else
				{
						day = d;
                                                if(d==31)
                                                {
                                                    nextDay = 1;
                                                    if(month == 12)
                                                    {
                                                        nextMonth = 1;
                                                        nextYear = year+1;
                                                    }
                                                    else
                                                    {
                                                        nextMonth = month+1;
                                                        nextYear = year;
                                                    }
                                                    
                                                }
                                                else
                                                {
                                                    nextDay = day+1;
                                                    nextMonth = month;
                                                    nextYear = year;
                                                }
				}
				
			}
			else
			{
				System.out.println("Invalid Day Entered....\n");
				checkDay();
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Day Entered....\n");
			sc.next();
			checkDay();
		}
		
		return day;
	}
	
	private static boolean checkLeap(int y) 
	{
		
		boolean isLeapYear = false;
		   if (y % 4 == 0) 
		   {
		      if (y % 100 == 0) 
		      {
		         if (y % 400 == 0) 
		         {
		            isLeapYear = true;
		         }
		      } 
		      else
		    	  isLeapYear = true;
		   }
		   return isLeapYear;
	}

	public static int checkYear()
	{
		System.out.print("Enter Year : ");
		try
		{
			int y = sc.nextInt();
			if(y>=1900 && y<=2025)
			{
				year = y;
				leap = checkLeap(y);
			}
			else
			{
				System.out.println("Invalid Day Entered....\n");
				checkYear();
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Day Entered....\n");
			sc.next();
			checkYear();
		}
		
		return year;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day,month,year;
		
		System.out.println("Enter Date to check : \n");
		
		year = checkYear();
		
		month = checkMonth();
		
		day = checkDay();
		
		System.out.println("\nThe Entered Date is : " + day + "\\" + month + "\\" + year + "" );
                
		System.out.println("\nThe Next Date is : " + nextDay + "\\" + nextMonth + "\\" + nextYear + "" );
	}

}
