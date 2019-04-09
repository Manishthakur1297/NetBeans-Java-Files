import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
 
class Calculator implements ActionListener
{
    //Declaring Objects
    Frame f=new Frame();
    Label l1=new Label("First ");
    Label l2=new Label("Second");
    Label l3=new Label("Result");
    
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    
//    Button b1=new Button("1");
//    Button b2=new Button("2");
//    Button b3=new Button("3");
//    Button b4=new Button("4");
//    Button b5=new Button("5");
//    Button b6=new Button("6");
//    Button b7=new Button("7");
//    Button b8=new Button("8");
//    Button b9=new Button("9");
//    Button b0=new Button("0");
    
    Button add=new Button("+");
    Button sub=new Button("-");
    Button mul=new Button("*");
    Button div=new Button("/");
    Button reset=new Button("AC");
    Button sqrt=new Button("sqrt");
    Button pow=new Button("x^n");
    Button rem=new Button("%");
    Button exit=new Button("Exit");
    
    Button sin = new Button("sin");
    Button cos = new Button("cos");
    Button tan = new Button("tan");
    
    Button square = new Button("x^2");
    Button log = new Button("log10");
    Button ln = new Button("ln e");
    Button fact=new Button("!");
    
    Calculator()
    {
        //Giving Coordinates
        l1.setBounds(20,50,50,20);
        l2.setBounds(20,80,50,20);
        l3.setBounds(20,110,50,20);
        
        t1.setBounds(70,50,130,20);
        t2.setBounds(70,80,130,20);
        t3.setBounds(70,110,130,20);
        
//        b7.setBounds(50,200,50,20);
//        b8.setBounds(110,200,50,20);
//        b9.setBounds(170,200,50,20);
//        b4.setBounds(50,230,50,20);
//        b5.setBounds(110,230,50,20);
//        b6.setBounds(170,230,50,20);
//        b1.setBounds(50,260,50,20);
//        b2.setBounds(110,260,50,20);
//        b3.setBounds(170,260,50,20);
//        b0.setBounds(110,290,100,20);
        
        add.setBounds(20,170,40,30);
        sub.setBounds(60,170,40,30);
        mul.setBounds(100,170,40,30);
        div.setBounds(140,170,40,30);
        sqrt.setBounds(20,200,40,30);
        pow.setBounds(60,200,40,30);
        square.setBounds(100,200,40,30);
        rem.setBounds(140,200,40,30);
        
        sin.setBounds(20,230,40,30);
        cos.setBounds(60,230,40,30);
        tan.setBounds(100,230,40,30);
        reset.setBounds(140,230,40,30);
        
        log.setBounds(20,260,40,30);
        ln.setBounds(60,260,40,30);
        fact.setBounds(100,260,40,30);
        exit.setBounds(140,260,40,30);
        
           
        
        //Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
//        f.add(b1);
//        f.add(b2);
//        f.add(b3);
//        f.add(b4);
//        f.add(b5);
//        f.add(b6);
//        f.add(b7);
//        f.add(b8);
//        f.add(b9);
//        f.add(b0);
        
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(sqrt);
        f.add(pow);
        f.add(rem);
        f.add(exit);
        f.add(reset);
       
       f.add(sin);
       f.add(cos);
       f.add(tan);
       f.add(square);
       f.add(log);
       f.add(ln); 
       f.add(fact);
       
       f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent we) {
               System.exit(0);
        	   
            }
        });
       
        add.addActionListener(this);
        sub.addActionListener(this);
        
        mul.addActionListener(this);
        div.addActionListener(this);
        sqrt.addActionListener(this);
        pow.addActionListener(this);
        rem.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        square.addActionListener(this);
        log.addActionListener(this);
        ln.addActionListener(this);
        fact.addActionListener(this);
        
        
        t1.addActionListener(this);
        t2.addActionListener(this);
        
        f.setLayout(null);
        f.setTitle("Calculator");
        f.setVisible(true);
        f.add(new Button("Close"));
        f.setSize(220,320);
        t3.setEnabled(false);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==exit || e.getSource()==exit && t1.getText()==t2.getText())
        {
        	System.exit(1);
        }
        
        else if(e.getSource()==reset)
        {
        	 t1.setText("");
        	 t2.setText("");
        	 t3.setText("");
        }
        else if(t1.getText().isEmpty() && t2.getText().isEmpty() )
        {
            //f.setTitle("Please Input First and Second Number!!");
           // setWarningMsg("Please Input First and Second Number!!");
            JOptionPane.showMessageDialog(f,
            "Please Input First and Second Number First!!");
            
        }
        else if(t2.getText().isEmpty() && !t1.getText().isEmpty())
        {
        	try
        	{
        		int n1=Integer.parseInt(t1.getText());
                
                if(e.getSource()== log)
                {
                    t3.setText(String.valueOf(Math.log10(n1)));
                }

                else if(e.getSource()== ln)
                {
                    t3.setText(String.valueOf(Math.log(n1)));
                } 
                else if(e.getSource()== fact)
                {
                	int n2 = fact(n1);
                    t3.setText(String.valueOf(n2));
                } 
                else if(e.getSource()==sqrt)
                {
                	if(n1<0)
                	{
                		n1=(-n1);
                		t3.setText(String.valueOf(Math.sqrt(n1))+" i");
                	}
                	else
                	{
                		t3.setText(String.valueOf(Math.sqrt(n1)));
                	}
                    
                }
                else if(e.getSource()== sin)
                {
                    t3.setText(String.valueOf(Math.sin(Math.toRadians(n1))));
                }

                else if(e.getSource()== cos)
                {
                	if(n1==90)
                	{
                		double n5= Math.cos(Math.toRadians(n1));
                        t3.setText(String.valueOf(Math.round(n5)));
                	}
                	else
                	{
                		t3.setText(String.valueOf(Math.cos(Math.toRadians(n1))));
                	}
                	
                }

                else if(e.getSource()== tan)
                {
                    t3.setText(String.valueOf(Math.tan(Math.toRadians(n1))));
                }
                else
                {
                	 JOptionPane.showMessageDialog(f,"Please Input Second Number First!!");
                 
                }
        	}
        	catch(Exception e1)
        	{
        		JOptionPane.showMessageDialog(f,"Please input integer only!!!");
        	}
            
                                 
        }
        
        else if(!t2.getText().isEmpty() && t1.getText().isEmpty())
        {
        	try
        	{
        		int n1=Integer.parseInt(t2.getText());
                
                if(e.getSource()== log)
                {
                    t3.setText(String.valueOf(Math.log10(n1)));
                }
                else if(e.getSource()== fact)
                {
                	int n2 = fact(n1);
                    t3.setText(String.valueOf(n2));
                } 

                else if(e.getSource()== ln)
                {
                    t3.setText(String.valueOf(Math.log(n1)));
                } 
                
                else if(e.getSource()==sqrt)
                {
                	if(n1<0)
                	{
                		n1=(-n1);
                		t3.setText(String.valueOf(Math.sqrt(n1))+" i");
                	}
                	else
                	{
                		t3.setText(String.valueOf(Math.sqrt(n1)));
                	}
                    
                }
                else if(e.getSource()== sin)
                {
                    t3.setText(String.valueOf(Math.sin(Math.toRadians(n1))));
                }

                else if(e.getSource()== cos)
                {
                    t3.setText(String.valueOf(Math.cos(Math.toRadians(n1))));
                }

                else if(e.getSource()== tan)
                {
                    t3.setText(String.valueOf(Math.tan(Math.toRadians(n1))));
                }
                else
                {
                	 JOptionPane.showMessageDialog(f,"Please Input First Number First!!");
                 
                }
        	}
        	catch(Exception e3)
        	{
        		JOptionPane.showMessageDialog(f,"Please input integer only!!!");
        	}
            
                                 
        }
        else
        {
        	try
        	{
        		int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());


                if(e.getSource()==add)
                {

                    t3.setText(String.valueOf(n1+n2));
                }

                if(e.getSource()==sub)
                {
                    t3.setText(String.valueOf(n1-n2));
                }

                if(e.getSource()==mul)
                {
                    t3.setText(String.valueOf(n1*n2));
                }
                if(e.getSource()== fact)
                {
                	int n3 = fact(n1);
                    t3.setText(String.valueOf(n3));
                } 

                if(e.getSource()==div)
                {
                	if(n2==0)
                	{
                		 JOptionPane.showMessageDialog(f,"Please Enter Valid Second Number ("
                				 +n2+") is not valid number");            		
                	}
                	else
                	{
                		t3.setText(String.valueOf(n1/n2));
                	}
                    
                }

                else if(e.getSource()==sqrt)
                {
                	if(n1<0)
                	{
                		n1=(-n1);
                		t3.setText(String.valueOf(Math.sqrt(n1))+" i");
                	}
                	else
                	{
                		t3.setText(String.valueOf(Math.sqrt(n1)));
                	}
                    
                }

                if(e.getSource()==pow)
                {
                    t3.setText(String.valueOf(Math.pow(n1, n2)));
                }

                if(e.getSource()==rem)
                {
                	if(n2==0)
                	{
                		 JOptionPane.showMessageDialog(f,"Please Enter Valid Second Number ("
                				 +n2+") is not valid number");            		
                	}
                	else
                	{
                		t3.setText(String.valueOf(n1%n2));
                	}
                }

                if(e.getSource()== sin)
                {
                    t3.setText(String.valueOf(Math.sin(Math.toRadians(n1))));
                }

                if(e.getSource()== cos)
                {
                    t3.setText(String.valueOf(Math.cos(Math.toRadians(n1))));
                }

                if(e.getSource()== tan)
                {
                    t3.setText(String.valueOf(Math.tan(Math.toRadians(n1))));
                }

                if(e.getSource()== square)
                {
                    t3.setText(String.valueOf(Math.pow(n1, 2)));
                }

                if(e.getSource()== log)
                {
                    t3.setText(String.valueOf(Math.log10(n1)));
                }

                if(e.getSource()== ln)
                {
                    t3.setText(String.valueOf(Math.log(n1)));
                }
        	}
        	catch(Exception e4)
        	{
        		JOptionPane.showMessageDialog(f,"Please input integer only!!!");
        	}
             
        }
                   
    }
    
    public static int fact(int n1)
    {
    	int fact = 1;
    	if(n1==1 || n1==0)
    	{
    		fact = 1;
    	}
    	else
    	{
    		int i=1;
    		while(n1>0)
    		{
    			fact = fact*i;
    			n1--;
    			i++;
    		}
    	}
    	return fact;
    }
    
    public static void main(String...s)
    {
        new Calculator();
    }
    
    
    
}
