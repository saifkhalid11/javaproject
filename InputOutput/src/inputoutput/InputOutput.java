/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {  
 
        // TODO code application logic here
//      PrintWriter userInput = new PrintWriter("HelloWorld.txt");
//      userInput.println("Hello World!");
//      userInput.close();


        PrintWriter pW = new PrintWriter("sequence.txt");
        for(int i=1; i<=10; i++){
            pW.println(i + "\t" + i*i);
        }
        pW.close();
        File f = new File("sequence.txt");
        Scanner s = new Scanner(f);        
//        Scanner s = new Scanner(new File("sequence.txt"));
        for(int i=1; i<=10; i++){
            System.out.print("The first snumber is ");
            String lineString = s.nextLine();
            System.out.println(lineString);
//            System.out.println(s.nextLine());
        }
        s.close();
/*
        Scanner keyboard = new Scanner(System.in);
        PrintWriter pW = new PrintWriter("NameList.txt");
        String first, last;
        for(int i = 1; i<=6; i++){
            System.out.print("Enter first name: ");
            first = keyboard.nextLine();
            System.out.print("Enter last name: ");
            last = keyboard.nextLine();            
            pW.print(first);
            pW.print("\t");
            pW.print(last);
            pW.println("");
        }
        pW.close();
*/
    }
}

    
