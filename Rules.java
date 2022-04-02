import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Rules extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JButton b1;
    Rules()
    {
        super("Instructions");
        l1=new JLabel("INSTRUCTIONS");
        l1.setFont(new Font("Viner Hand ITC", Font.ITALIC, 70));
        l1.setForeground(Color.blue);
        add(l1);
        l2=new JLabel("");
        l2.setText(
        "<html>"+
	"1.There are 10 MCQs ."+"<br><br>"+
	"2.None of the given questions are compulsory."+"<br><br>"+
	"3. There is +1 for every correct answer."+"<br><br>"+
	"4. There is no negative marking ."+"<br><br>"+
	"5.  Good luck!!! ."+"<br><br>"+
        "<html>"
        );
        add(l2);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setForeground(Color.red);
        b1=new JButton("START =>");
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        add(b1);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        setLocation(300,100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        {
        if(e.getSource()==b1)
        {
           this.setVisible(false);
           new OnlineTest();
        }
    }
    }   
}


