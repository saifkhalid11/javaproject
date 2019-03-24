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
public class PolymorphicEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e = new Hourly ("Joe Blow","555-1212",50.,100);
        Hourly h = new Hourly ("Jane Dow","555-2121",50.,100);
        System.out.println(h.annualcompensation());
        System.out.println(e.annualcompensation());

    }
    
}
