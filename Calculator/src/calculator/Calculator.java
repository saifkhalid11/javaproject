/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Calculator {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        float num1;
	float num2;
        String symbol; 
	System.out.print("Please enter the first number: ");
	num1 = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("Please enter the symbol: ");
        symbol = keyboard.nextLine();
        
    //    if ("sqrt".equals(symbol)||"sin".equals(symbol)||"cos".equals(symbol)||"tan".equals(symbol))
            if ("sqrt".equals(symbol))
                System.out.println("The square root is: "+ (float)Math.sqrt(num1)+ ". " );
            else if ("sin".equals(symbol))
                System.out.println("The sine is: "+ (float)Math.sin(num1)+ ". " );
            else if ("cos".equals(symbol))
                System.out.println("The cosine is: "+ (float)Math.cos(num1)+ ". " );
            else if ("tan".equals(symbol))
                System.out.println("The tangent is: "+ (float)Math.tan(num1)+ ". " );
            else{
                System.out.print("Please enter the second number: ");
                num2 = keyboard.nextFloat();
                if ("+".equals(symbol))
                    System.out.println("The sum is: "+ (num1+num2)+ ". " );
                else if ("-".equals(symbol))
                    System.out.println("The difference is: "+ (num1-num2)+ ". " );
                else if ("*".equals(symbol))
                    System.out.println("The product is: "+ (num1*num2)+ ". " );
                else if ("/".equals(symbol))
                    System.out.println("The quotient is: "+ (num1/num2)+ ". " );
                else if ("^".equals(symbol))
                    System.out.println("The power is: "+ (float)Math.pow(num1 ,num2)+ ". " );
                else if ("%".equals(symbol))
                    System.out.println("The percentage is: "+ ((num2/num1)*100)+ "%. " );

                else
                    System.out.println("ERROR");

            }
                            
	
		
    }
    
}
