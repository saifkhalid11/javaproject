/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisprogect;
import javax.swing.*; 
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class GuisProgect extends JFrame { 
    private JPanel p; 
    private JLabel ell; 
    private JButton b; 
    private JTextField tF; 
    final int WINDOW_WIDTH = 350; 
    final int WINDOW_HEIGHT = 250; 
    
public GuisProgect() {

  
       

        setTitle("Panel Project"); 
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        p=new JPanel(); 
        
        ell=new JLabel("Enter kilometers here:"); 
        
        b= new JButton("Push Me!"); 
        
        tF = new JTextField(10); 
        
        p.add(ell); 
        p.add(tF); 
        p.add(b); 
        
        add(p); 
        
        setVisible(true); 
    } 
} 