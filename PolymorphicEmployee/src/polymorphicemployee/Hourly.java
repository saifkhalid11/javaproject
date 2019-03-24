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
public class Hourly extends Employee{
    private int hoursPerYear;
    Hourly(String n, String p,double s, int hpy){
        super(n,p,s);
        hoursPerYear = hpy;
    }
    public double annualcompensation(){
    return salary*hoursPerYear;
}
}
