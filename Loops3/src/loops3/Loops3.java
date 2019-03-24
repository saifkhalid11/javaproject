/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops3;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Loops3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner keyboard= new Scanner(System.in);
//    for (int i=0;i<=7;i++){
//        // TODO code application logic here
//    }
//      int i=0;
//      while (i<=7){
//          // TODO code application logic here
//          i++;        
//      }
          
//    String input ="x";
//    while (!input.equals("")){
//        System.out.println("Enter text.Enter blank to stop");
//        input= keyboard.nextLine();
//        System.out.println(input.toUpperCase());
//    }
//    
    
        double input, total = 0;
        int number=2;
        
        Scanner k = new Scanner(System.in);
        System.out.println("Please enter a number. Enter -1 to stop:" );
        input = k.nextDouble();
        while(input!= -1){
            number++;
            total = total + input;
            System.out.println("Please enter a number. Enter -1 to stop:" );
            input = k.nextDouble();
        }
        System.out.println("The total is:" + total + ".");
        System.out.println("The average is:" + total/number + ".");



    
    }
    
}
