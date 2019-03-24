/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
//// 1
//        int a,b,c=0;
//        System.out.println("Please enter a number?");
//        a=s.nextInt();
//        System.out.println("Please enter a number?");
//        b=s.nextInt();
//        for(int i = a; i <= b; i++)
//            c= c+i;
//            System.out.println(c);
//    

////2
//    int sum=0,inputs=0,count=0;
//    while (inputs != -1){
//        //System.out.println("Enter a non negative number.Press -1 to exit");
//        
//        if (inputs >=0){
//            sum=sum+inputs;
//            count++;   
//        }        
//        System.out.println("Enter a non negative number.Press -1 to exit");
//        inputs=s.nextInt();
//        System.out.println(sum);
//    }
//


////3
//  int total=0, bb=0,count=0;
//    while (bb!=-1);
//    if(bb>=0)
//        total=total+bb;
//        count++;
//    System.out.println("Enter the next number. Enter -1 to stop.");
//    bb=s.nextInt();
//        DecimalFormat f = new DecimalFormat("#,###.00");
//        double input = 0, sum = 0;
//        int counter=0;
//        while(input != -1){
//            System.out.println("Please enter the money.Press -1 to exit.");
//            input = s.nextDouble();
//            counter++;
//            sum = sum + input;
//    }
//        sum++;
//        counter--;
//        System.out.println("The average of the values is $" + sum/counter + ".");
//        System.out.printf("The average of the values is $%3.2f.\n", sum/counter);
//        System.out.println("The average of the values is $" + f.format(sum/counter));



////?
//int x,y,z,input;
//System.out.println("Enter how many times would you like to run the program");
//input=s.nextInt();
//for (int i ; i<=input;i++){
//    System.out.println("Enter a number");
//    x=s.nextInt();
//    }
// 

//C4
//import java.io.*;
//    public static void main(String[] args) throws FileNotFoundException 
//{
//        PrintWriter p = new PrintWriter("squares.txt");
//        for(int i = 1; i <= 500; i++)
//            p.println(i*i);
//        p.close();
//    }
// }


////5
// int number1, number2, numberOfData, product;
//        int sum = 0;
//        System.out.println("How many pieces of data will you be entering?");
//        numberOfData = s.nextInt();
//        for(int i = 1; i <=numberOfData; i++){
//            System.out.println("Enter first number!");
//            number1 = s.nextInt();
//            System.out.println("Enter second number!");
//            number2 = s.nextInt(); 
//            product = number1 * number2;
//            sum = sum + product;
//        }
//        System.out.println("The sum of the products is " + sum + ".");


////6
int num1=0,  num2=0, prod;
int total = 0;
while (num1 != -1 ){
    System.out.println("Enter first number! Enter -1 to stop.");
    num1 = s.nextInt();
    System.out.println("Enter second number! Enter -1 to stop.");
    num2 = s.nextInt(); 
    prod = num1*num2;
    total = total+prod;
}
System.out.println("The sum of the products is " + (total- num1*num2) + ".");




//D
//for(int i = 2; i<7; i++)
// 	System.out.println(i);
//
//int i=2;
//while(i<7){
//System.out.println(i);
//i++;
//}

    
    
    }
    
    
    
}
