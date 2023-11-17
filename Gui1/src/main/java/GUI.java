
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.*;


public class GUI extends JFrame{
    
JLabel l1,l2,l3;
JTextField t1,t2,t3,t4;
JRadioButton r1,r2,r3,r4;
JComboBox co1;
JButton b1,b2,b3;
JPanel p1,p2,p3,p4,p5;
String s[]={"cash","credit"};
    public GUI(){
        
        setTitle("E-Restaurant");
        p1=new JPanel(new GridLayout(2,2));
        t1=new JTextField();
        t2=new JTextField();
        r1=new JRadioButton("Burger meal");
        r2=new JRadioButton("Pizza");
       // p2.setFont(new Font("arial",Font.BOLD,15));
        ButtonGroup bg1= new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        
        p1.add(t1);
        p1.add(r1);
        p1.add(t2);
        p1.add(r2);
        
        p1.setBorder(new TitledBorder("Meals/please enter quaantity"));
        
                
        p2=new JPanel (new GridLayout(2,2));
         t3=new JTextField();
        t4=new JTextField();
         r3=new JRadioButton("Juice");
        r4=new JRadioButton("Cola");
        
        ButtonGroup bg2= new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);
        
        
        p2.add(t3);
        p2.add(r3);
        p2.add(t4);
        p2.add(r4);
        p2.setBorder(new TitledBorder("2-Drinks/please enter quantity"));
        
        
        p3=new JPanel(new GridLayout(1,2));
        p3.add(p1);
        p3.add(p2);
        
        l1=new JLabel("Fast Food Restaurant");
        l1.setFont(new Font("arial",Font.BOLD,30));
        p5=new JPanel(new FlowLayout());
        p5.add(l1);
        p4=new JPanel(new FlowLayout());
        l2=new JLabel("Payment Method");
        co1=new JComboBox(s);
        b1=new JButton("Total");
        l3=new JLabel("bill");
        b2=new JButton("exit");
        b3=new JButton("Reset");
        p4.add(l2);
        p4.add(co1);
        p4.add(b1);
        p4.add(l3);
        p4.add(b2);
        p4.add(b3);
        
        add(p5,BorderLayout.NORTH);
        add(p3,BorderLayout.CENTER);
        add(p4,BorderLayout.SOUTH);
        
        
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,200);
        setLocationRelativeTo(null);
        
   
   
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==b1)
                    t1.setText("1");
                
            }
        }
        
        
        );
        
        
        
        
    }
    
   
    
    
    
            
    
    
    
    
}
