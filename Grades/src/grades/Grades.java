/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in); 
        Double number;
        System.out.println("Enter a number?");
        number = keyboard.nextDouble();
        if (number >= 90 && number <= 100)
            System.out.println("A");
        else if (number >= 80 && number < 90)
            System.out.println("B");
        else if (number >= 70 && number < 80)
            System.out.println("C");
        else if (number >= 60 && number < 70)
            System.out.println("D");
        else if (number >=0 && number < 60)
            System.out.println("D");
        else
            System.out.println("Enter a number between 0 and 100");
          
    }
    
}
