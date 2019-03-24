package testfinal;
import java.util.Scanner;
public class TestFinal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        /*
//        // E)	Write a method which
//1)	Takes in two doubles from the main program and returns their average. 
    
    double num1;
    double num2;
    int tot1;
    System.out.println("Enter a whole number? ");
    tot1 = s.nextInt(); 
    EO(tot1);
    System.out.println("Enter a number? ");
    num1 = s.nextDouble();
    System.out.println("Enter another number? ");
    num2 = s.nextDouble();
    Avg(num1,num2);
    
    }

    public static void Avg(Double a,Double b){
    double sum=0;
        sum = (a+b)/2;
        System.out.println(sum);
    
}
    //2)	Takes in an integer and returns "true" if it is even and "false" if it is odd.
    public static void EO(int e){
        if (e%2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
*/
        System.out.println("Enter your first name: ");
        String first = s.nextLine();
        System.out.println("Enter your last name");
        String last=s.nextLine();
        System.out.println("Enter the score. ");
        Double testScore1 =s.nextDouble();
        System.out.println("Enter the score. ");
        Double testScore2=s.nextDouble();
        System.out.println("Enter the score. ");
        Double testScore3=s.nextDouble();
        System.out.println("Enter the score. ");
        Double FinalExam=s.nextDouble();
        Avg(testScore1,testScore2,testScore3,FinalExam);


}
    public static void Avg(Double a,Double b,Double c, Double d){
    double sum=0;
        sum = (a+b+c+d)/4;
        System.out.println(sum);
    }
}




