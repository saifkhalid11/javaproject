/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condionalstatement;

import java.util.Scanner;
//put this line if you use a keyboard

/**
 *
 * @author muhammadrehman
 */
public class CondionalStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in); 
        //keyboard you can but anything  but this value that comes after scanner is used anything that we 
        //put using a keyboard so that is why I used keyboard
        int number;
        System.out.println("Enter a whole number?");
        number = keyboard.nextInt();
        
        if (number%2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
        
    }
    
}
