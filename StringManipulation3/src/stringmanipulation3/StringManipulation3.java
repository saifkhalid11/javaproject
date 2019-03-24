/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation3;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class StringManipulation3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner put = new Scanner(System.in);
        String word1 = put.nextLine();  
        String word2 = put.nextLine();
        // if we want to compare two words we use word1.equals(word2);
        if (word1.equals(word2))
            System.out.println("The words are the same");
        else
            System.out.println("The words are not the same");
        if (word1.compareTo(word2)>0)// word1 is alphabetically after word2 in dictionary
            System.out.println(word1+" is after "+word2);
        else
            System.out.println(word1+" is before "+word2);
    }
    
}
