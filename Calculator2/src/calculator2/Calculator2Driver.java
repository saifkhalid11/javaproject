package calculator2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Calculator2Driver extends JFrame {
    
    private JPanel p;
    private JLabel w;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton subtract;
    private JButton add;
    private JButton multiply;
    private JButton divide;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JButton sqrt;//
    private JButton root;
    private JButton percent;
    private JButton total;
    private final int Width =500;
    private final int Lenght =500;


    public Calculator2Driver(){
        
        setTitle ("Calculator");
        setSize (Width,Lenght);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        w = new JLabel("Here is a Calculator");
       //* 1234567890-=+/*
       one = new JButton ("1");
       two = new JButton ("2");
       three = new JButton ("3");
       four = new JButton ("4");
       five = new JButton ("5");
       six = new JButton ("6");
       seven = new JButton ("7");
       eight = new JButton ("8");
       nine = new JButton ("9");
       zero = new JButton ("0");
       subtract = new JButton ("-");
       total = new JButton ("=");
       add = new JButton ("+");
       divide = new JButton ("/");
       multiply = new JButton ("*");
       sin = new JButton ("sin");
       cos = new JButton ("cos");
       tan = new JButton ("tan");
       percent = new JButton ("%");
       root = new JButton ("^");
       sqrt = new JButton ("√(");
       
       one.addActionListener(new buttonPress());
       two.addActionListener(new buttonPress());
       three.addActionListener(new buttonPress());
       four.addActionListener(new buttonPress());
       five.addActionListener(new buttonPress());
       six.addActionListener(new buttonPress());
       seven.addActionListener(new buttonPress());
       eight.addActionListener(new buttonPress());
       nine.addActionListener(new buttonPress());
       zero.addActionListener(new buttonPress());
       subtract.addActionListener(new buttonPress());
       add.addActionListener(new buttonPress());
       multiply.addActionListener(new buttonPress());
       divide.addActionListener(new buttonPress());
       total.addActionListener(new buttonPress());
       sin.addActionListener(new buttonPress());
       cos.addActionListener(new buttonPress());
       tan.addActionListener(new buttonPress());
       
       
       p =new JPanel();
       p.add(w);
       p.add(one);
       p.add(two);
       p.add(three);
       p.add(four);
       p.add(five);
       p.add(six);
       p.add(seven);
       p.add(eight);
       p.add(nine);
       p.add(zero);
       p.add(subtract);
       p.add(add);
       p.add(multiply);
       p.add(divide);
       p.add(total);
       p.add(sin);
       p.add(cos);
       p.add(tan);
       add(p);
       setVisible (true);
    }
    private class buttonPress implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            Scanner keyboard = new Scanner (System.in);
        float num1;
	float num2;
        String symbol; 
	System.out.print("Please enter the first number: ");
	num1 = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("Please enter the symbol: ");
        symbol = keyboard.nextLine();
            if ("sqrt".equals(symbol))
                System.out.println("The square root is: "+ (float)Math.sqrt(num1)+ ". " );
            else if ("sin".equals(symbol))
                System.out.println("The sine is: "+ (float)Math.sin(num1)+ ". " );
            else if ("cos".equals(symbol))
                System.out.println("The cosine is: "+ (float)Math.cos(num1)+ ". " );
            else if ("tan".equals(symbol))
                System.out.println("The tangent is: "+ (float)Math.tan(num1)+ ". " );
            else{
                System.out.print("Please enter the second number: ");
                num2 = keyboard.nextFloat();
                if ("+".equals(symbol))
                    System.out.println("The sum is: "+ (num1+num2)+ ". " );
                else if ("-".equals(symbol))
                    System.out.println("The difference is: "+ (num1-num2)+ ". " );
                else if ("*".equals(symbol))
                    System.out.println("The product is: "+ (num1*num2)+ ". " );
                else if ("/".equals(symbol))
                    System.out.println("The quotient is: "+ (num1/num2)+ ". " );
                else if ("^".equals(symbol))
                    System.out.println("The power is: "+ (float)Math.pow(num1 ,num2)+ ". " );
                else if ("%".equals(symbol))
                    System.out.println("The percentage is: "+ ((num2/num1)*100)+ "%. " );

                else
                    System.out.println("ERROR");

            }
        }       
        }
}