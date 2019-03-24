/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import javax.swing.JOptionPane;

/**
 *
 * @author muhammadrehman
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salary;
        int employees;
        double hours;
        String input;
        
        input= JOptionPane.showInputDialog("What is the salary?");
        
        salary= Double.parseDouble(input);
        input= JOptionPane.showInputDialog("How many hours worked this week?");
        hours= Double.parseDouble(input);
       
        input= JOptionPane.showInputDialog("How many employees?");
        employees= Integer.parseInt(input);
        
        JOptionPane.showMessageDialog(null, "Total Salary this week: "+ salary * employees *hours);
        System.exit(0);
        
    }
    
}
