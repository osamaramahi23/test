
import javax.swing.*;
import java.awt.*;



public class micro extends JFrame {
    
    JButton l1;
    JButton b1[];
    String b[]={"1","2","3","4","5","6","7","8","9","0","start","stop"};
    JTextField t1;
    JPanel p1;
    JPanel p2;
    
    
    
    public micro(){
      
        setTitle("the font view");
        setLayout(new BorderLayout());
        p1=new JPanel();
        p1.setLayout(new GridLayout(4,3));
        
        p2=new JPanel();
        p2.setLayout(new BorderLayout());
        
        b1=new JButton[12];
        for (int i = 0; i < b1.length; i++) {
       
            b1[i]=new JButton(b[i]);
            p1.add(b1[i]);
        }
        t1=new JTextField("time to be ");
        p2.add(p1,BorderLayout.CENTER);
        p2.add(t1,BorderLayout.NORTH);
        
        l1=new JButton("food to be here");
        add(p2,BorderLayout.EAST);
        add(l1,BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,400);
        
    }
    
    
    
}
