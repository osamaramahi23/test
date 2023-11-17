
import javax.swing.*;
import java.awt.*;





public class Grid extends JFrame{
    
    JLabel l1;
    JTextField t1;
    
    JLabel l2;
    JTextField t2;
    
    JLabel l3;
    JTextField t3;
    
    
    public Grid(){
        
        setTitle("grid layout");
        setLayout(new GridLayout(3, 3,20,20));
        
        l1=new JLabel("first name");
        t1=new JTextField();
        
        l2=new JLabel("mi");
        t2=new JTextField();
        
        l3=new JLabel("last name");
        t3=new JTextField();
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
    }
    
    
    
    
}
