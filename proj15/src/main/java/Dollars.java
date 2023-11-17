/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dollars extends JFrame{
    
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b1;
    JPanel p1,p2,p3;
    
    public Dollars(){
        
        p1=new JPanel (new GridLayout(3,1));
        
          p1.add(l1);
          p1.add(l2);
        
        
        p2=new JPanel(new BorderLayout());
         p2.add(b1,BorderLayout.EAST);
        
        
        p3=new JPanel(new GridLayout(3,1));
        p3.add(t1);
        p3.add(t2);
        p3.add(p2);
        
        
        t1=new JTextField();
        t2=new JTextField();
        l1=new JLabel("US Dolars");
        l2=new JLabel("canadian Dollars");
       
        b1=new JButton("convert");
       
         
      
        
      
        add(p1,BorderLayout.WEST);
        add(p3,BorderLayout.CENTER);
               
        inn1 i1=new inn1();
        b1.addActionListener(i1);
        
        
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,500);
        setLocationRelativeTo(null);
        
        
        
    }
    
    public class inn1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String s=t1.getText();
            double d=Double.parseDouble(s);
            double res=d*1.5;
            t2.setText(res+"");
            
            
        }
        
        
        
    }
    
    
    
    
    
    
}
