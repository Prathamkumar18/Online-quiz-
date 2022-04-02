import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Login extends JFrame implements ActionListener
{   
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JButton b1,b2;
    JTextField tf1,tf2;
    Login()
    {
        super("Login page");
        l1=new JLabel("Name:");
        l1.setBounds(10,10,50,30); 
        l2=new JLabel("Password:");
        l2.setBounds(10,50,50,30);
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        b1=new JButton("Login");
        b2=new JButton("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p1=new JPanel();
        p1.add(l1);
        p1.add(tf1);
        p2=new JPanel();
        p2.add(l2);
        p2.add(tf2);
        p3=new JPanel();
        p3.add(b1);
        p3.add(b2);
        add(p1);
        add(p2);
        add(p3);
        setLocation(400,250); 
        setLayout(new FlowLayout()); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            String username=tf1.getText();
            String pass=tf2.getText();
            if(username.equals("java") && pass.equals("java@123"))
            {
               JOptionPane.showMessageDialog(null,"logged in succesfully :)"); 
               this.setVisible(false);
               new Rules();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"invalid input");
            }
        }
             
        else
        {
            System.exit(0);
            
        }
  
    }

class Log
{
    public static void main(String args[])
    {
        Login lo=new Login();
        lo.setSize(300,200);
        lo.setVisible(true);
    }
}
}

