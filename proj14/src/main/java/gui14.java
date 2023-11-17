/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
public class gui14 extends JFrame implements ActionListener {
    
    JButton b1,b2;
    JTextField t1;
    JTextArea ta;
    JPanel p1;
    Border bor;
    
    public gui14(){
        setTitle("event handling");
        p1=new JPanel(new GridLayout(1,2));
        b1=new JButton("show on text area");
        b2=new JButton("show on massage box");
        p1.add(b1);
        p1.add(b2);
        t1=new JTextField();
        ta=new JTextArea();
 
        bor=new LineBorder(Color.blue, 4);
          ta.setBorder(bor);
        
        add(t1,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){

     if(e.getSource()==b1)
     ta.setText(t1.getText());
     
     else if
     (e.getSource()==b2)
     JOptionPane.showMessageDialog(null, t1.getText());
    
            
        
             
        
    
    
    
    
    
}
}