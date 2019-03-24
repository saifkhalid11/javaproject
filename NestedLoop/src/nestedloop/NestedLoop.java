/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop;

/**
 *
 * @author muhammadrehman
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//         System.out.println("****"); 
//        System.out.println("****"); 
//        System.out.println("****"); 
//        System.out.println("****"); 
//        System.out.println("****"); 
//    
//        System.out.println("+++++++++++++++++++++++"); 
//        
//        for(int n = 1; n<=5; n++){ 
//            System.out.println("****"); 
//        } 
//        
//       System.out.println("+++++++++++++++++++++++"); 
//        
//        for(int n = 1; n<=5; n++){ 
//            for(int m = 1; m <=4; m++){ 
//                System.out.print("*");} 
//            System.out.print("\n");} 
//       System.out.println("+++++++++++++++++++++++"); 
//        
//        for(int n = 1; n<=5; n++){ 
//            for(int m = 1; m <=n; m++){ 
//                System.out.print("*");} 
//            System.out.print("\n");}            
//        
//        for(int n = 1; n<=5; n++){ 
//            for(int m = 1; m <=n; m++){ 
//                System.out.print("*");} 
//            System.out.print("\n");}    

        int height = 40;
        for(int i=1; i<=height; i++){
            for(int j=1; j<=height-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i - 1; j++){
                System.out.print("*");
            }           
            System.out.print("\n");
        }
        for(int i=1; i<=height-1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(height - i) - 1; j++){
                System.out.print("*");
            } 
            System.out.print("\n");
        }

    }
    
}
