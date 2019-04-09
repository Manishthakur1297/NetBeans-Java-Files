import java.*;
import java.io.DataInputStream;
import java.io.IOException;

public class even {
	public int ee() throws IOException {
	
		DataInputStream s=new DataInputStream(System.in);
		//System.out.println("enter a no.");
		try{
			n1=Integer.parseInt(s.readLine());
			n2=Integer.parseInt(s.readLine());
			int i;
			if(n2>n1)
			 {a=n1;b=n2;}
			else
			{a=n2;b=n1;}
			for(i=a;i<=b;i++){
				if(i%2==0){
					System.out.println(i);
					
					}
				}
			return 0;
		}
		catch(Exception M)
		{
			return 1;
		}
		
		
		
		
		/*for(n=0;n<4;n++)
		if(!(arr[n]%2==0))
			return 1;
		if(n==4)
			return 0;*/
	}
	public int nn() throws IOException{
		return n1;
	}
int n1,n2,a,b;
	public static void main(String[] args) throws IOException{
		//even e1 = new even();
		//System.out.println(e1.ee());
	}
	
}
