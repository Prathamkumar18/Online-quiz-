import java.awt.FlowLayout;
import java.awt.event.*;  
import javax.swing.*;  

class OnlineTest extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton rb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;
    
    int count=0,question=0;  
    int m[]=new int[10];      
    OnlineTest()  
    {  
        super("QUIZ APP"); 
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            rb[i]=new JRadioButton();     
            add(rb[i]);  
            bg.add(rb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Result");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(40,40,550,20);  
        rb[0].setBounds(50,80,1000,20);  
        rb[1].setBounds(50,110,1000,20);  
        rb[2].setBounds(50,140,1000,20);  
        rb[3].setBounds(50,170,1000,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,400);  
    }  
     
    void set()
    {  
        rb[4].setSelected(true);  
        if(question==0)  
        {  
            l.setText("Que1:Which of the following is not a Java features?");  
            rb[0].setText("Inheritance");rb[1].setText("Usage of pointers");rb[2].setText("polymorphism");rb[3].setText("Encapsulation");   
        }  
        if(question==1)  
        {  
            l.setText("Que2: Java was developed by _____?");  
            rb[0].setText("James Gosling");rb[1].setText("Issac Newton");rb[2].setText("MK gandhi");rb[3].setText("B.Gates");  
        }  
        if(question==2)  
        {  
            l.setText("Que3: Which package is directly available to our class without importing it?");  
            rb[0].setText("swing");rb[1].setText("applet");rb[2].setText("net");rb[3].setText("lang");  
        }  
        if(question==3)  
        {  
            l.setText("Que4: Which statement is true about Java?");  
            rb[0].setText("it is a sequence-dependent");rb[1].setText("it is a code dependent");rb[2].setText("it is a platform-dependent");rb[3].setText("it is a platform-independent");  
        }  
        if(question==4)  
        {  
            l.setText("Que5:  Which component is used to compile, debug and execute?");  
            rb[0].setText("JRE");rb[1].setText("JDK");rb[2].setText("JIT");rb[3].setText("JVM");  
        }  
        if(question==5)  
        {  
            l.setText("Que6:  What is the extension of java code files?");  
            rb[0].setText(".java");rb[1].setText(".txt");rb[2].setText(".c");rb[3].setText(".cpp");  
        }  
        if(question==6)  
        {  
            l.setText("Que7: Which of these keywords is used to define interfaces in Java?");  
            rb[0].setText("int");rb[1].setText("intr");rb[2].setText("Interface");  
                        rb[3].setText("interface");  
        }  
        if(question==7)  
        {  
            l.setText("Que8: Which of these class is a superclass of every class in Java?");  
            rb[0].setText("String class");rb[1].setText("Abstract class");rb[2].setText("Arraylist class");  
                        rb[3].setText("Object class");         
        }  
        if(question==8)  
        {  
            l.setText("Que9: Which of these keywords can be used to prevent Method overriding?");  
            rb[0].setText("static");rb[1].setText("final");rb[2].setText("protected");rb[3].setText("constant");  
        }  
        if(question==9)  
        {  
            l.setText("Que10: Which one of the following is not an access modifier?");  
            rb[0].setText("protected");rb[1].setText("public");rb[2].setText("Void");  
                        rb[3].setText("Private");  
        }     
    }  
    boolean check()  
    {  
        if(question==0)  
            return(rb[1].isSelected());  
        if(question==1)  
            return(rb[0].isSelected());  
        if(question==2)  
            return(rb[3].isSelected());  
        if(question==3)  
            return(rb[3].isSelected());  
        if(question==4)  
            return(rb[1].isSelected());  
        if(question==5)  
            return(rb[0].isSelected());  
        if(question==6)  
            return(rb[3].isSelected());  
        if(question==7)  
            return(rb[3].isSelected());  
        if(question==8)  
            return(rb[1].isSelected());  
        if(question==9)  
            return(rb[2].isSelected());  
        return false;  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            
            if(check())  {
            count++;  
            question++;  
            set();  
            }
            else{
             if(rb[0].isSelected()||rb[1].isSelected()||rb[2].isSelected()||rb[3].isSelected()){
                 question++;
             set(); 
            }
            }
            
        }  
        
        if(e.getSource()==b2)  
        {  
            if(check())  
                count=count+1;  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    } 
    
}  
