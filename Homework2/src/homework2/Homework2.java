/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
//import java.io.*;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ //throws IOException{
        // TODO code application logic here
/*        
1) Write a program which takes in a number and determines if it is prime. 
*/
    
    Scanner keyboard= new Scanner(System.in);
//        int i;
//        System.out.println("Which number would you like to determine if it is a prime?");
//        i=keyboard.nextInt();
//        if(i==0||i==1){  
//        System.out.println(i+" is not prime number");      
//        }else
//        {
//            for(int j = 2 ;j>=(int) Math.sqrt(i); )
////           
//                if (/*i/i==1 && i%i ==0 && */i/j==j)
//                    System.out.println(i+ " is prime");
//                      
//                else{
//                    System.out.println(i+ " Is not prime"); 
//                }
//
////    Scanner keyboard= new Scanner(System.in);
////    int i;
////    System.out.println("Which number would you like to determine if it is a prime?");
////    i=keyboard.nextInt();
////
////    if(i==0||i==1){
////    System.out.println("not a prime number");
////    } else{
////   
////        for(int n=2; n<=100; n++)
////        if( n%i ==0)
////        System.out.println(i+ " Is not prime");
////    }
//    
    int n,i;
    int j,flag=0;      
    
    System.out.println("Which number would you like to determine if it is a prime?");
    n=keyboard.nextInt();
    j=(int) Math.sqrt(n);      
    if(n==0||n==1){  
        System.out.println(n+" is not prime number");      
    }else
    {
    for(i=2;i<=j;i++){      
        if(n%i==0){      
            System.out.println(n+" is not prime number");      
        flag=1;      
        break;      
    }      
    }
       if(flag==0)  { System.out.println(n+" is prime number"); }  
    }
    
        keyboard.nextLine();
    
/*2) A magic day is a day in which the product of the numerical value of the month and day equals 
        the last two digits of the year. Thus April 4, 2016, is a magic date because 4 X 4 = 16. 
        (April is the 4th month of the year.) Write a program which takes in the date, month, and year
        and determines if they form a magic day.)
        
*/
    int day, month, year;
    System.out.println("Enter a day: ");
    day=keyboard.nextInt();
    System.out.println("Enter a month: ");
    month=keyboard.nextInt();
    System.out.println("Enter last 2 digits of a year: ");
    year=keyboard.nextInt();
    if (day==month && year== (day*month))
        System.out.println("It is a magic number");
    else
        System.out.println("It is not a magic number");
    keyboard.nextLine();
    
    /*
3) Gizmos are priced according to the table:
quantity       price
1 to 10         $50 each
11 to 50        $40 each
51 to 100      $35 each
over 100        $30 each
Write a program which takes in the quantity of gizmos ordered and prints out the cost of the order according to this table.
*/
    int h;
    System.out.println("Enter a number");
    h=keyboard.nextInt();
    if (h>0 && h<=10)
        System.out.println("Gizmos are $50 each. The total is"+ (50*h));
    else if (h>10 && h<=50)
        System.out.println("Gizmos are $40 each. The total is $ "+ (40*h));
    else if (h>50 && h<=100)
        System.out.println("Gizmos are $35 each. The total is $ "+ (35*h));
    else if (h>=100)
        System.out.println("Gizmos are $30 each. The total is $ "+ (30*h));
    else
        System.out.println("Invalid amount");
    keyboard.nextLine();
/*
4) Write a program which will generate the following shape:
*********
 ********
  *******
   ******
     ****
      ***
       **
        *
and

*********
********
*******
******
****
***
**
*
The user should be able to control the size of the triangles.
*/

int size;
System.out.println("Enter the size of the triangles?");
size= keyboard.nextInt();
for(int c = 1; c<=size; c++){ 
    for(int d = 1; d <=c; d++){ 
        System.out.print("*");} 
    System.out.print("\n");}  
keyboard.nextLine();

System.out.println("Enter the size of the triangles?");
        size= keyboard.nextInt();
        for(int c = 1; c<=size; c++){ 
            for(int d = size; d >=c; d--){ 
                System.out.print("*");} 
            System.out.print("\n");}     
    } 
    keyboard.nextLine();

/*
5) The number pi

can be approximated by 4 minus 4 / 3 plus 4 / 5 minus 4 / 7 plus 4 / 9 minus 
4 / 11 plus 4 / 13 minus midline horizontal ellipsis . Write a table showing the value 
of this approximation for each included term, starting with the first term (4). 
Use DecimalFormat to keep the decimals to exactly 10 decimal places. (
pi  is approximately 3.141592653...)
*/
//int num =4;
//int den ;
//System.out.println("What place pi are you looking for?");
//den = keyboard.nextInt;
//    
//}
//    
//
