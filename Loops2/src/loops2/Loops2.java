/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops2;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Loops2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        /*int sum = 0;
        int i = 1;
        while( i <=100){
            sum = sum +i;
            System.out.println(sum);
            i++;
        }
*/
//        int num1;
//        int num2;
//        int num3;
//        int num4;
//        int num5;
//        int sum = 0 ;
//        
//        System.out.println("Please enter a number.");
//        num1= keyboard.nextInt();
//        System.out.println("Please enter a number.");
//        num2= keyboard.nextInt();
//        System.out.println("Please enter a number.");
//        num3= keyboard.nextInt();
//        System.out.println("Please enter a number.");
//        num4= keyboard.nextInt();
//        System.out.println("Please enter a number.");
//        num5= keyboard.nextInt();
    
          int input, sum=0, count;
          System.out.println("How many numbers will you be inputting?");
          count= keyboard.nextInt();
          for (int i=1; i<=count; i++){
              System.out.println("Enter an integer: ");
              input= keyboard.nextInt();
              sum= sum +input;
              
        }
          System.out.println(sum);
    }
    
}
