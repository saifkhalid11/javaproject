/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation2;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class StringManipulation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner put = new Scanner(System.in);
        int word1 = put.nextInt();
        put.nextLine(); 
        String word2 = put.nextLine();  
        String word3 = put.nextLine();
        
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        
    }
    
}
