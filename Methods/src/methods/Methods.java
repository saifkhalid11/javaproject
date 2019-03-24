/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    Scanner keyboard= new Scanner(System.in);
//        HW(); //CALLING THE METHOD WE CREATED
//    
//    }
//    public static void HW(){
//        System.out.println("Hello World");
//    }
    
//    public static void main(String[] args) {
//    Scanner keyboard= new Scanner(System.in);
//        // TODO code application logic here
//        System.out.println("Print a string");
//        String str=keyboard.nextLine;
//        HW(str); //This helps the main program to be in controlof the program
//    
//    }
//    public static void HW(String n){
//        System.out.println(n);
//    }
//    
public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = keyboard.nextLine();
        System.out.println("Enter your last name");
        String last=keyboard.nextLine();
        HW(first,last); //This helps the main program to be in controlof the program
    
    }
    public static void HW(String n, String m){
        System.out.println(n+ " "+ m);
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//       sumOfSquares(3,4);
//    }
//    public static int sumOfSquares(int a, int b){
//        int sum =a*a +b*b;
//        return sum;
//    }
}
