package review3;
import java.util.Scanner;
//import java.io.*;
/**
 *
 * @author muhammadrehman
 */
public class Review3 {

    public static void main(String[] args) /*throws FileNotFoundException*/{
        Scanner s = new Scanner (System.in);
//        int num1, num2, sum=0;
//        System.out.println("Enter a number");
//        num1=s.nextInt();
//        System.out.println("Enter a greater number than the previous");
//        num2=s.nextInt();
//        for (int i = num1+1; i<=num2-1;i++ ){
//            if (i%2==0){
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);
    
//    PrintWriter p =new PrintWriter("squar.txt");
//    for (int i=1; i<=1000;i++)
//        p.println(i*i);
//    
//    p.close();





//        PrintWriter p =new PrintWriter("double.txt");
//        p.println(2.2);
//        p.println(5.2);
//        p.println(2.6);
//        p.close();
//        
//        double sum=0;
//        File f = new File("double.txt");
//        Scanner q = new Scanner (f);
//        if (f.exists()){
//            
//            while(q.hasNextDouble()){
//            sum=sum+q.nextDouble();
//            
//        }
//            System.out.println(sum);
//        }
//        
//        else{
//            System.out.println("DNE");
//        }
        String a=s.nextLine();
        System.out.println("Enter a name");
        while (a.charAt(0)!='!'){
            
            System.out.println("Enter a name"); 
            a = s.nextLine();
            
        }
        
        
    }
    
}
