import java.util.Scanner;


public class Theatre {
	
	public static class TheatreTicket{
		
		private double price;
		private int row;
		private int seat;
                
                private final int[][] a = new int[51][101];
		
		Scanner sc = new Scanner(System.in);
                
                
                /* Getting Information of Different Blocks of Movie Hall */        
                
                
                public void getBlock()
                {
                    System.out.println("===============================\n");
                    System.out.println("\n1.Silver Block - Rs. 100\n2.Gold Block - Rs. 150\n3.Platinum Block - Rs. 200\n");   
                    System.out.println("===============================\n");
                }
                
                
                /* Choose Block among Different Blocks of Movie Hall */  
                
                
                public double setBlock()
                {
                    System.out.println("===============================\n");
                    System.out.println("\n1. for Silver - Rs. 100\n2. for Gold - Rs. 150\n3. for Platinum - Rs. 200\n");
                    System.out.println("===============================\n");
                    System.out.print("Enter your choice :: ");
                    try
                    {
                        int n = sc.nextInt();
                        switch(n)
                        {
                            case 1:
                                price = 100;
                                break;

                            case 2:
                                price = 150;
                                break;

                            case 3:
                                price = 200;
                                break;

                            default:
                                System.out.println("Please Select only Given Options....\n");
                                setBlock();
                                break;
                        } 
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter only number value.....");
                        sc.next();
                        setBlock();
                    }
                    
                    return price;
                }
		
                
                /* Get Price of Ticket */  
                
                
		public double getPrice()
		{
			return price;
		}
		
                
                /* Set or Check enterd Price of Ticket */
                
                
		public int setPrice(double price)
		{
                        final double ticket = getPrice();
                        int flag = 0;
                        
			if(price<=0)
			{
				System.out.println("\nInvalid Price!!Please input amount greater than 0");
			}
			else if(ticket<=price)
			{
                              flag =1;      
			}
			else
			{
				System.out.print("\nSorry! the Price of ticket is Rs.[ "+ getPrice() +
                                        " ]. Please enter amount greater than or equal to it...\n");
                        }
                        
                        
                        return flag;
		}
		
                
                /* Get status of entered row of Ticket */
                
                public int checkRow()
                {
                    try
                    {
                        System.out.print("Please input Row No. : ");
                        row = sc.nextInt();
                        if(row>0 && row<=50)
                        {
                            return row;	
                        }
                        else
                        {
                            System.out.println("\nInvalid input as row.");
                            checkRow();
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter only Numbers....\n");
                        sc.next();
                        checkRow();
                    }
                    return row;
                }
                
                
                /* Get status of entered row of Ticket */
                
                public int checkSeat()
                {
                    try
                    {
                        System.out.print("Please input Seat No. : ");
                        seat = sc.nextInt();
                        if(seat>0 && seat<101)
                        {
                            return seat;	
                        }
                        else
                        {
                            System.out.println("\nInvalid input as seat no..");
                            checkSeat();
                        } 
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter only Numbers....\n");
                        sc.next();
                        checkSeat();
                    }
                    
                    return seat;
                }
                
                
                /* Set status of Ticket or assign ticket to row and seat no. */
                
                public void setLocation(int row,int seat)
		{
			if(a[row][seat]==0)
			{
                             double ticket = getPrice();
                             System.out.print("\nPlease Pay Rs. [ "+ticket+" ] as amount - \nEnter Amount : ");
                             try
                             {
                                double amount = sc.nextDouble();
                                int flag = setPrice(amount);
                                if(flag==0)
                                {
                                    setLocation(row,seat);
                                }
                                else
                                {
                                    a[row][seat]=1;
                                    double balance = amount - ticket;
                                    System.out.println("Thanks for buying Ticket...\nYour Row No. = [ "+row+" ] & Seat No. = [ "+seat+" ]");
                                       System.out.println("\nYour remaining balance is Rs. [ "+balance
                                       +" ]. Collect them at Counter!");
                                } 
                             }
                             catch(Exception e)
                             {
                                 System.out.println("Please enter Number Value Only.....");
                                 sc.next();
                                 setLocation(row,seat);
                             }
                             
			}
			else
			{
				System.out.println("Sorry! The seat is already booked..Please choose another one..\n");
                                bookTicket();
			}
		}
                
                
                /* Want to Book Another Ticket */
                
                public void bookTicketAgain()
                {
                    try
                    {
                        System.out.println("\nWanna to purchase new Ticket ? ( y / n )");
                        char ch = sc.next().trim().charAt(0);
                        if(ch == 'y' || ch == 'Y')
                        {
                            bookTicket();
                        }
                        else
                        {
                            System.out.println("\nThanks for purchasing Tickets....Have a Good Day!");
                            System.exit(0);
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please Enter only character value....\n");
                        sc.next();
                        bookTicketAgain();
                    }
                }
                
                
                /* Book Ticket Function */
                
                public void bookTicket()
                {
                    System.out.println("\nPlease First Select Block Section :: ");
                    price = setBlock();
                    System.out.println("Please Select Row and Seat No as follows : ");
                    row = checkRow();
                    seat = checkSeat();
                    setLocation(row,seat);
                    bookTicketAgain();
                }
        }

        
        /* Main Function of the Program */
        
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
                    TheatreTicket t = new TheatreTicket();
                    System.out.println("1. to Check Ticket Price\n2. to Book Ticket\n3. to exit");
		
			System.out.println("\nEnter your Choice :: ");
                        try
                        {
                            int n = sc.nextInt();
                            switch(n)
                            {
                                    case 1:
                                        t.getBlock();
                                        break;

                                    case 2:
                                        t.bookTicket();
                                        break;

                                    case 3:

                                            System.exit(0);
                                            break;
                                    
                                    default:
                                        System.out.println("Please Select among only given option...\n");
                            } 
                        }
                        catch(Exception e)
                        {
                            System.out.println("Please enter only numbers....\n");
                            sc.next();
                        }
			
		}
	}

}
