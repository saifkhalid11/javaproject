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
public class Contractor extends Employee{
    private int jobsPerYear;
    Contractor (String n, String p,double s, int jpy){
        super (n,p,s);
        jobsPerYear= jpy;
    }
    public double annualcompensation(){
    return salary*jobsPerYear;
}
}
