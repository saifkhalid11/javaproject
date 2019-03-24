/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author muhammadrehman
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int sum = 0;
        for (int i = 1; i <=100; i++){//i++ can also be written as i=i+1. the curly braces let the console show the answer specifically
            sum = sum +i;
        System.out.println(sum);
        }
        */
        int i = 1;
        i++;
        System.out.println(++i); // if you don't put the ++/-- before i it will not updates 2 to 3
        System.out.println(i+=3); //

    }
    
}
