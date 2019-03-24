/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;
/**
 *
 * @author muhammadrehman
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String firstName;
        String middleName;
        String lastName;
        firstName = JOptionPane.showInputDialog("Write your First name ");
        middleName = JOptionPane.showInputDialog("Write your Middle name ");
        lastName = JOptionPane.showInputDialog("Write your Last name ");
        
        JOptionPane.showMessageDialog(null, "Hello "+firstName+" "+middleName+" "+lastName);
        System.exit(0);
    
    }
    
    
}
