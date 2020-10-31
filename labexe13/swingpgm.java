/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexe13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;

class pallete implements AdjustmentListener  
{ 
    JFrame f;
    JScrollBar s,s1,s2;
    
pallete()
{  
f= new JFrame("Scrollbar Example");

s=new JScrollBar(JScrollBar.VERTICAL, 128, 225, 0, 255); 
s1=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255); 
s2=new JScrollBar(JScrollBar.VERTICAL, 128, 225, 0, 255); 
s.setBounds(100,100, 30,100);  
s1.setBounds(140,100, 30,100);
s2.setBounds(180,100, 30,100);
s.addAdjustmentListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);

f.add(s);  
f.add(s1); 
f.add(s2); 
f.setSize(500,500);  
f.setLayout(null);  
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public void adjustmentValueChanged(AdjustmentEvent ae)
{
    
    int red= s.getValue();
    int green = s1.getValue();
    int blue =s2.getValue();
    f.getContentPane().setBackground(new Color(red,green,blue));
}
public static void main(String args[])  
{  
new pallete();  
}
}  