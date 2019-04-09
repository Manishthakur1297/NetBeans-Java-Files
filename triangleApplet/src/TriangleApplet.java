import java.awt.*;  
import java.awt.event.*;  
import java.applet.*; 
import javax.swing.*;

public class TriangleApplet extends Applet implements ActionListener  
{  
	JFrame f=new JFrame(); 
	
	double a,b,c;
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);
	//JTextField t4 = new JTextField(20);
        
        JLabel l1 = new JLabel("1st Side : ");
        JLabel l2 = new JLabel("2nd Side : ");
        JLabel l3 = new JLabel("3rd Side : ");
        //JLabel l4 = new JLabel("Output : ");
        
    JButton bt = new JButton("CHECK");
    JButton r = new JButton("RESET");
    
    
    TriangleApplet()  
    {    
    	f.setSize(300,300);  
        f.setLayout(null); 
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(t1); 
        f.add(t2);
        f.add(t3);
        //f.add(t4);
        f.add(l1); 
        f.add(l2);
        f.add(l3);
        //f.add(l4);
        f.add(bt);        
        f.add(r);
        
       t1.requestFocus();
       //t4.setEnabled(false);
       
        l1.setBounds(10,20,80,30);
        l2.setBounds(10,60,80,30);
        l3.setBounds(10,100,80,30);
        //l4.setBounds(10,140,80,30);
       
        t1.setBounds(100,20,150,30);
        t2.setBounds(100,60,150,30);
        t3.setBounds(100,100,150,30);
        //t4.setBounds(100,140,150,30);
        
        bt.setBounds(50,160,80,40);
        r.setBounds(150,160,80,40);
        
        bt.addActionListener(this);
        r.addActionListener(this);
        
        f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent we) {
               System.exit(0);
        	   
            }
        });
        
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) 
            {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') || (c=='.') || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
              {
                getToolkit().beep();
                e.consume();
              }
             
            }
          });
        
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) 
            {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') || (c=='.') || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
              {
                getToolkit().beep();
                e.consume();
              }
             
            }
          });
        
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) 
            {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') || (c=='.') || (c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
              {
                getToolkit().beep();
                e.consume();
              }
             
            }
          });
        
    }
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == bt)  
        {  
            
        	String s1=t1.getText().toString();
        	String s2=t2.getText().toString();
        	String s3=t3.getText().toString();
            try
            {
                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);
                c = Double.parseDouble(s3);
                
                if(a>0 && b>0 && c>0)
                {
                    if((a+b>c) && (b+c>a) && (a+c>b))
                    {
                            if(a==b && b==c)
                            {
                                    JOptionPane.showMessageDialog(f,"Equilateral Triangle");
                            }
                            else if(a==b || b==c ||a==c)
                            {
                                    JOptionPane.showMessageDialog(f,"Isosceles Triangle");
                            }
                            else
                            {
                                    JOptionPane.showMessageDialog(f,"Scalene Triangle");
                            }
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(f,"Not a Triangle"); 
                    }
                            
                }
                else
                {

                   JOptionPane.showMessageDialog(f,"Invalid Sides as Input ..Enter sides greater than 0");
                }  
            }
            catch(Exception e1)
            {
                 JOptionPane.showMessageDialog(f,"Please Input all sides First!!");
            }
    	    
        }
        if (e.getSource() == r)  
        {
        	t1.setText("");
        	t2.setText("");
        	t3.setText("");
        }
    }
    
    public static void main(String...s)
    {
        new TriangleApplet();
    }
} 