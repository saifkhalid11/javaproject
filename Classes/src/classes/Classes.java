/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author muhammadrehman
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Rectangle r1;
        r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(5, 6);
//        r1.setLength(12);
//        r1.setWidth(4);
        System.out.println(r3); 
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1);
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r2);
        
        if (r1==r2)
            System.out.println("They are the same");
        else
            System.out.println("They are not the same");
        if (r1.equals(r2))
            System.out.println("They are the same");
        else
            System.out.println("They are not the same");
    }
    
}
*/
Rectangle r1;
        r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(5, 6);
        r1.setLength(12);
        r1.setWidth(4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        Box b1 = new Box();
        Box b2 = new Box(3, 4, 5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b2.area());
        System.out.println(b2.perimeter());
    }
}