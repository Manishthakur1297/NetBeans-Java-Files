import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
 
class calculator1 implements ActionListener
{
    private static final int NULL = 0;
	//Declaring Objects
    Frame f=new Frame();
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label("Result");
    
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    
    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    
    Button b5=new Button("n^n");
    Button b6=new Button("Cancel");
    Button b7=new Button("sin(n)");
    Button b8=new Button("cos(n)");
    Button b9=new Button("tan(n)");
    Button b10=new Button("sqrt");
    Button b11=new Button("log");
    Button b12=new Button("exp");
    Button b13=new Button("!");
    Button b14=new Button("RESET");
    
    
    
    
    calculator1()
    {
        //Giving Coordinates
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);
        b5.setBounds(290,250,50,20);
        b6.setBounds(290,280,50,20);
        b7.setBounds(50,280,50,20);
        b8.setBounds(110,280,50,20);
        b9.setBounds(170,280,50,20);
        b10.setBounds(230,280,50,20);
        b11.setBounds(50,310,50,20);
        b12.setBounds(110,310,50,20);
        b13.setBounds(170,310,50,20);
        b14.setBounds(170,310,50,20);
        //Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.addWindowListener(new WindowAdapter(){
        	public void windowClosing( WindowEvent we){
        		System.exit(0);
        	}
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b6)
        {

  			  
  				  t1.setText("");
  				  t2.setText("");
  				  t3.setText("");
  				  
  			  
        }
        int n1=Integer.parseInt(t1.getText());
        
		if(e.getSource()==b7){
			
		
        	t3.setText(String.valueOf(Math.sin(Math.toRadians( n1))));
  
        }
		if(e.getSource()==b8){
        	t3.setText(String.valueOf(Math.cos(Math.toRadians( n1))));
        }
		if(e.getSource()==b9){
        	t3.setText(String.valueOf(Math.tan(Math.toRadians( n1))));
        }
		if(e.getSource()==b10){
        	t3.setText(String.valueOf(Math.sqrt(n1)));
        }
        
		if(e.getSource()==b11){
        	t3.setText(String.valueOf(Math.log(n1)));
        }
		if(e.getSource()==b12){
        	t3.setText(String.valueOf(Math.exp(n1)));
        	
        }
		  if(e.getSource()==b13)
	      {
	          int fact=1;
			if(n1==0||n1==1)
	          { 
	              fact=1;
	          t3.setText(String.valueOf(fact));
	          }
	          else
	          {
	          for(int i=1;i<=n1;i++)
	        	  fact=fact*i;
	         
	            
	          }
			t3.setText(String.valueOf(fact));
        	
			
    }
		  int n2=Integer.parseInt(t2.getText());
	        
	        if(e.getSource()==b1)
	        {
	            t3.setText(String.valueOf(n1+n2));
	        }
	            
	        if(e.getSource()==b2)
	        {
	            t3.setText(String.valueOf(n1-n2));
	        }
	        
	        if(e.getSource()==b3)
	        {
	            t3.setText(String.valueOf(n1*n2));
	        }
	        
	        if(e.getSource()==b4)
	        {
	        	if(n2==0)
	        	{
	        		JOptionPane.showMessageDialog(null, "Please Enter Valid input");
	        	}
	        	else 
	        		
	            t3.setText(String.valueOf(n1/n2));
	        }
	        
	        
	        if(e.getSource()==b5){
	        	t3.setText(String.valueOf(Math.pow(n1, n2)));
	        }
	       
		  
	        }
		 
    
    
    

	private char[] fact(int n1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String...s)
    {
        new calculator1();
    }
}
