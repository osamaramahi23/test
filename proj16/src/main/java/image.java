/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.*;


public class image extends JFrame {
    
    JLabel l1,l2,l3,l4;
    String s[]={"set titled border","set line border"};
    JComboBox com1;
    JRadioButton r1,r2,r3;
    JButton b1,b2,b3,b4;
    JPanel p1,p2,p3,p4;
   ImageIcon img;
   ImageIcon img1;
   Border b12;
    
    
    public image(){
        
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
        
       // l3=new JLabel();
        
         b12=new LineBorder(Color.blue);
      // l4=new JLabel();
        
        b1=new JButton("load image");
        b2=new JButton("change font");
        b3=new JButton("exit");
        b4=new JButton("clearSelection");
        
        
        p4=new JPanel(new GridLayout(1,4));
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        p4.add(b4);
        
        
        img=new ImageIcon("bee.png");
        l3=new JLabel();
        //l3.setIcon(img);
        
        img1=new ImageIcon("flower.png");
        l4=new JLabel(img1);
        
        
        
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
        
        
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               l3.setHorizontalAlignment(SwingConstants.LEFT);
               
            }
        });
        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l3.setHorizontalAlignment(SwingConstants.CENTER);
                
            }
        }
        
        );
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l3.setHorizontalAlignment(SwingConstants.RIGHT);
            }
        }
        
        );
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1)
                     l3.setIcon(img);
             
                
            }
        });
                b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if(e.getSource()==b2)
                    l1.setFont(new Font("Calibari",Font.BOLD+Font.ITALIC , 16));
                    p2.setFont(new Font("Calibari",Font.BOLD+Font.ITALIC,16));
                
            }
                });
                b3.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if(e.getSource()==b3)
                    System.exit(0);
                
                
                
            }
                });
                b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                g1.clearSelection();
                com1.setSelectedIndex(-1);
                l3.setIcon(null);
                
                
            }
                }
                
                
                
                );
                com1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(com1.getSelectedIndex()==0)
                    l1.setBorder(new TitledBorder("bee"));
                else 
                    l1.setBorder(new LineBorder(Color.BLACK));
                
                
            }
                }
                
                
                
                
                );
                
                
                b1.setToolTipText("load");
                b2.setToolTipText("chane font");
                b3.setToolTipText("exit");
                b4.setToolTipText("clearselection");
                
                
                
                
                
                
        add(p1,BorderLayout.NORTH);
        add(p3,BorderLayout.WEST);
        add(p4,BorderLayout.SOUTH);
        add(l3,BorderLayout.CENTER);
        add(l4,BorderLayout.EAST);
       l3.setBorder(b12);
        
        
        
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        
        
        
        
    }
    
    
    
    
    
}
