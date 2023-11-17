/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import javax.swing.*;
import java.awt.*;


public class Images extends JFrame {
    
    JLabel l1,l2,l3,l4;
    String s[]={"set titled border","set line border"};
    JComboBox com1;
    JRadioButton r1,r2,r3;
    JButton b1,b2,b3,b4;
    JPanel p1,p2,p3,p4;
    ImageIcon img;
    
    
    public Images(){
        
        setTitle("Images");
        
        l1=new JLabel ("image alnum");
        l2=new JLabel("border style");
        com1=new JComboBox(s);
        p1=new JPanel(new BorderLayout());
        p1.add(l1,BorderLayout.WEST);
        p2=new JPanel(new FlowLayout());
        p2.add(l2);
        p2.add(com1);
        p1.add(p2,BorderLayout.SOUTH);
        
        r1=new  JRadioButton("left");
        r2=new  JRadioButton("center");
        r3=new  JRadioButton("right");
        ButtonGroup g1=new ButtonGroup();
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);
        
        p3=new JPanel(new  GridLayout(3, 1));
        p3.add(r1);
        p3.add(r2);
        p3.add(r3);
        
        l3=new JLabel();
        
        
        
        b1=new JButton("load image");
        b2=new JButton("change font");
        b3=new JButton("exit");
        b4=new JButton("clearSelection");
        
        
        p4=new JPanel(new GridLayout(1,4));
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        p4.add(b4);
        
        
        b1.setBackground(Color.pink);
        b2.setBackground(Color.PINK);
        b3.setBackground(Color.PINK);
        b4.setBackground(Color.PINK);
        p1.setBackground(Color.pink);
        p2.setBackground(Color.pink);
        r1.setBackground(Color.pink);
        r2.setBackground(Color.pink);
        r3.setBackground(Color.pink);
        l3.setOpaque(true);
        l3.setBackground(Color.yellow);
        add(p1,BorderLayout.NORTH);
        add(p3,BorderLayout.WEST);
        add(p4,BorderLayout.SOUTH);
        add(l3,BorderLayout.CENTER);
        add(l4,BorderLayout.EAST);
         img=new ImageIcon("flower.png");
        l4=new JLabel(img);
        
        
        
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        
        
        
        
    }
    
    
    
    
    
}
*/