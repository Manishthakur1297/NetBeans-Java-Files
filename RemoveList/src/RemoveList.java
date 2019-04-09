import java.util.ArrayList;
import java.util.Scanner;


public class RemoveList {
	
	public static class List{
		
		private static ArrayList list = new ArrayList() ;
		public static Scanner sc = new Scanner(System.in);
		
		public ArrayList createList()
		{
			//ArrayList list = new ArrayList();
			System.out.print("\nHow many items u want to add : ");
                        try
                        {
                            int n = sc.nextInt();
                            if(n<=0)
                            {
                                System.out.println("\nPlease Input Positive Integer Only.....!!");
                                createList();
                            }
                            else
                            {
                                int i = 0;
                                System.out.println("");
                                while(i<n)
                                {
                                        System.out.print("Enter ["+(i+1)+"] item : ");
                                        //int item = sc.nextInt();
                                        list.add(sc.next());
                                        i++;
                                }
                            }
                            
                        }
                        catch(Exception e)
                        {
                            System.out.println("\nPlease Input Integer Only.....!!");
                            sc.next();
                            createList();
                        }
			
			return list;	
		}
		
		
		public ArrayList addItem(ArrayList list)
		{
			System.out.print("\nEnter item to add : ");
			//int item = sc.nextInt();
			list.add(sc.next());
			return list;
		}
		
		
		public ArrayList removeItem(ArrayList list)
		{
                    if(list.size() == 0)
                    {
                        System.out.println("\nSorry, List is empty...!! Please first create new list..");
                    }
                    else
                    {
                        System.out.print("\nEnter item to remove : ");
                        try
                        {
                                String item = sc.next();
				if(list.contains(item))
				{
					int index = list.indexOf(item);
					list.remove(index);
				}
				else
				{
					System.out.println("\nSorry,Item Not Found in List...!!");
				}
                        }
                        catch(Exception e)
                        {
                            System.out.println("\nPlease Input Alphanumeric Only.....!!");
                        }
                    }
			
                        
			return list;
		}
		
		
		
		public static ArrayList removeList(ArrayList list1)
		{
                    
                        ArrayList list2 = new ArrayList() ;
                        System.out.print("\nEnter no. of elements u want to remove : ");
                        try
                        {
                            int no = sc.nextInt();
                            if(no<=0)
                            {
                                System.out.println("\nPlease Input Positive Integer Only.....!!");
                                removeList(list1);
                            }
                            else
                            {
                                int i=0;
                                //list2.clear();
                                while(i<no)
                                {
                                    System.out.println("Enter ["+(i+1)+"] item to remove : ");
                                    //String item = sc.next();
                                    list2.add(sc.next());
                                    i++;
                                }

                                list1.removeAll(list2);
                                System.out.println("\nAfter Removing items, List is : \n");
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Please Input Integer only....!!");
                            sc.next();
                            removeList(list1);
                        }
                    
		    return list1;
		}
                
                public void display(ArrayList list)
                {
                    if(list.size()==0)
                    {
                        System.out.println("\nThe List is Empty..!!!");
                    }
                    else
                    {
                        int j=0;
                        while(j<list.size())
                        {
                            System.out.print(" "+list.get(j)+"\t");
                            j++;
                        }
                        System.out.println("");
                    }
                    
                }
		
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		ArrayList list = new ArrayList() ;
		
		while(true)
		{
			List l = new List();
			System.out.println("\n1. to Create New List\n2. to Add Item from List\n3.Remove common elements\n4.Remove single element\n5. to Display\n6. to exit\n");
			System.out.print("Enter your Choice : ");
                        try
                        {
                            int n = sc.nextInt();
                            switch(n)
                            {
                                    case 1:
                                            list = l.createList();
                                            break;

                                    case 2:
                                            list = l.addItem(list);
                                            break;

                                    case 3:
                                            if(list.size() == 0)
                                            {
                                                System.out.println("\nSorry, List is empty...!! Please first create new list..");
                                            }
                                            else
                                            {
                                                list = l.removeList(list);
                                                l.display(list);
                                            }
                                            break;

                                    case 4:
                                            l.removeItem(list);
                                            break;

                                    case 5:
                                            l.display(list);
                                            break;
                                    
                                    case 6:
                                            System.exit(0);
                                    
                                    default:
                                            System.out.println("\nPlease Select only given option..");
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("\nPlease Enter Input Integer Only.....!!");
                            sc.next();
                        }
			
			
		}
		

	}

}
