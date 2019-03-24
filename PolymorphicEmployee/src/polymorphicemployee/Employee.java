/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphicemployee;

/**
 *
 * @author muhammadrehman
 */
public class Employee {
    protected String name;
    protected String phone;
    protected double salary;
    Employee (String n, String p,double s){
        name = n;
        phone = p;
        salary = s;
        
    }
    public double annualcompensation(){
    return salary;
}
    
}
