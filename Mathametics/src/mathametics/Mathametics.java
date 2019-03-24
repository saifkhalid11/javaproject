/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathametics;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Mathametics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner keyboard = new Scanner (System.in);
		float num1;
		float num2;
		float num3;
		System.out.print("Please enter the first number: ");
		num1 = keyboard.nextFloat();
		System.out.print("Please enter the second number: ");
		num2 = keyboard.nextFloat();
		
		
		num3 = ((int)Math.pow(num1 ,num2));
		System.out.println("The answer of "+ num1+"^"+num2 +" is= "+  (num3));
		
		float num4;
		
		System.out.print("Please enter the square root you want to be founded: ");
		num4 = keyboard.nextFloat();
		System.out.println("The square root of num4 is= "+ (float)Math.sqrt(num4));
    }
    
}
