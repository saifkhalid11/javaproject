/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtext;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class ReadingText {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        File f = new File("");
        if(f.exists()){
            Scanner s = new Scanner(f);
            for(int i=1; i<=10; i++){
                System.out.print("The square is ");
    //            String lineString = s.nextLine();
    //            System.out.println(lineString);
                System.out.println(s.nextLine());
            }
            s.close();
        }
        else{
            System.out.println("No such file exists!");
            System.exit(0);
        }              
    }
}
//Note1: This refers to a text file in a folder on the computer with the indicated name and the indicated path. The file has a vertical list of square //numbers. 
//Note 2: Netbeans coolness: Get the path of the file in Windows by right-clicking on it, clicking "Properties" on the bottom of the
//pop-up menu and copying the path indicated on the properties window which pops up. Then paste it into the appropriate part of the program. 
//Netbeans will convert the front-slashes to the double back-slashes which work in Java.