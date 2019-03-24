/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author muhammadrehman
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
1) Write a program which takes in two integers and produces their quotient. 
Here is a sample of their output: 
If you input 135 and 12, the output should read:
135 divided by 12 is 11 remainder 3.
*/
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    int rem;
    System.out.println("Please enter a number.");
    num1= keyboard.nextInt();
    System.out.println("Please enter another number.");
    num2= keyboard.nextInt();
    keyboard.nextLine();
    num3= (num1/num2);
    rem= (num1%num2); 
    System.out.println("The Quotient is "+ num3 +" and the remainder is "+ rem);
    
/*
2) Write a program which prints:

*
* *
* * *
* * * *
* * * * *

*/

    String i = "*";
    for (int n = 1; n<=5; n++){
        if (n==1)
            System.out.println(i);
        else if (n == 2)
            System.out.println(i+i);
        else if (n == 3)
            System.out.println(i+i+i);
        else if (n == 4)
            System.out.println(i+i+i+i);
        else if (n == 5)
            System.out.println(i+i+i+i+i);
    }
    keyboard.nextLine();

/*
3) Write a program which takes in five ages and calculates their average.
*/
    int age1;
    int age2;
    int age3;
    int age4;
    int age5;
    int total;
    System.out.println("Please enter an age.");
    age1= keyboard.nextInt();
    System.out.println("Please enter an age.");
    age2= keyboard.nextInt();
    System.out.println("Please enter an age.");
    age3= keyboard.nextInt();
    System.out.println("Please enter an age.");
    age4= keyboard.nextInt();
    System.out.println("Please enter an age.");
    age5= keyboard.nextInt();
    keyboard.nextLine();
    total=(age1+age2+age3+age4+age5)/5;
    System.out.println("The average age is"+total+".");
    
/*
4) Write a program which takes in a first name, a last name, and a middle name and
prints the first name, the abreviated middle name, and the last name. In other 
words, if it takes in Barak Hussein Obama, it returns Barak H. Obama. 
(Hint: use the method .charAt())
*/
    String FirstName;
    String MiddleName;
    String LastName;
    String abbreviated;
    System.out.println("Please print your first name?");
    FirstName= keyboard.nextLine();
    System.out.println("Please print your middle name?");
    MiddleName= keyboard.nextLine();
    System.out.println("Please print your last name?");
    LastName= keyboard.nextLine();
    System.out.println("Would you like your middle name abbreviated? Y/N");
    abbreviated= keyboard.nextLine(); 
    if ("Y".equals(abbreviated))
        System.out.println(FirstName+ " "+ MiddleName.charAt(0)+" "+LastName);
    else
        System.out.println(FirstName+ " "+ MiddleName+" "+LastName);
    keyboard.nextLine();
    
    
/*
5) MadLibs. Write a program which takes asks the user to enter a name, a color, a 
number, and another number and then outputs a MadLib using this information. 
(See http://www.madlibs.com/)
male name
teacher
exclamation
number
plural objects
store name
body part
silly word
holiday
movie title 
verb end in “ing”
amount of distance
country
animal
famous movie quote
body part
children song
adjective

    */
    String male_name;
    String favourite_teacher;
    String exclamation;
    int number;
    String plural_objects;
    String store_name;
    String body_part;
    String silly_word;
    String holiday;
    String movie_title ;
    String verb ;//end in “ing”
    String distance;
    String country;
    String animal;
    String movie_quote;
    String body_part2;
    String children_song;
    
   
    System.out.println("Enter a male name?");
    male_name =keyboard.nextLine();
    System.out.println("Enter your favourite teachers name?");
    favourite_teacher =keyboard.nextLine();
    System.out.println("Enter an exclamation?");
    exclamation =keyboard.nextLine();
    System.out.println("Enter a number?");
    number =keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter plural objects?");
    plural_objects =keyboard.nextLine();
    System.out.println("Enter a store name?");
    store_name =keyboard.nextLine();
    System.out.println("Enter a body part?");
    body_part =keyboard.nextLine();
    System.out.println("Enter a silly word?");
    silly_word =keyboard.nextLine() ;
    System.out.println("Enter a holiday name?");
    holiday =keyboard.nextLine();
    System.out.println("Enter a movie title?");
    movie_title =keyboard.nextLine(); 
    System.out.println("Enter a verb with ing ?");
    verb =keyboard.nextLine(); 
    System.out.println("Enter a distance with their metric lenghts?");
    distance =keyboard.nextLine();
    System.out.println("Enter a country name?");
    country =keyboard.nextLine();
    System.out.println("Enter an animal?");
    animal =keyboard.nextLine();
    System.out.println("Enter a movie quote?");
    movie_quote =keyboard.nextLine();
    System.out.println("Enter a body part?");
    body_part2 =keyboard.nextLine();
    System.out.println("Enter a children song?");
    children_song =keyboard.nextLine();
    
    System.out.println("Hello, I am detective "+male_name+". You are? "+favourite_teacher+"." );
    System.out.println("You are under suspicion of a second degree robbery."+exclamation+".");
    System.out.println("That right "+(number)+(plural_objects)+" were stolen from "+store_name+"." );
    System.out.println("The crime scene has your "+body_part+" written all over it. That is "+silly_word+"." );
    System.out.println("Where were you on the night of "+holiday+ " we watching "+ movie_title+" .");
    System.out.println("Then why did the security camera show you "+(verb)+(distance)+" away from the crime scene. ");
    System.out.println("Alright,alright I am throug with playing games. Where you from? "+country+" Yeah. ");
    System.out.println("Just as I suspected. The best part is that I get to lock up criminals like you and go home to my children and my pet badger and say '"+movie_quote+"'. ");
    System.out.println("Fine I did it I committed the robbery. I did it because I needed the money to buy myself "+body_part2+" implants.");
    System.out.println("I knew it all along and every time I saw the crime I like to sing my favorite song"+children_song+"." );                
    
    }
    
    
}
