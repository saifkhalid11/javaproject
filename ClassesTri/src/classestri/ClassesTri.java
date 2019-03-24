package classestri;
public class ClassesTri {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        if(t1.isTriangle())
            System.out.println(t1. getSide1() + " " + t1.getSide1() + " " + t1.getSide2());
        else 
            System.out.println("It is not a triangle.");
        Triangle t2 = new Triangle(1, 2, 10);
        if(t2.isTriangle())
            System.out.println(t1. getSide1() + " " + t1.getSide1() + " " + t1.getSide2());
        else 
            System.out.println("It is not a triangle.");     
        System.out.println(t1);  
        
    }
    
}
