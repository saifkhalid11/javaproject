package classestri;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
        side1=1;
        side2=1;
        side3=1;
    }
    public Triangle(double s1, double s2, double s3 ){
        side1=s1;
        side2=s2;
        side3=s3;
    }   
    public boolean isTriangle(){
        if(side1+side2>side3 & side2+side3>side1 & side3+side1>side2)
            return true;
        else
            return false;
    }
    public void setSide1(double s){side1 = s;}
    public void setSide2(double s){side2 = s;}
    public void setSide3(double s){side3 = s;}
    public double getSide1(){return side1;}
    public double getSide2(){return side2;}
    public double getSide3(){return side3;}
    public double perimeter(){return side1 + side2 + side3;}
    public double area(){
        double s = (side1 + side2 + side3)/2; //semiperimeter
        return Math.sqrt(s*(s-side1)*(s- side2)*(s-side3));//the square root
    }
    public String toString(){
        String s = "This string has sides " + side1 + ", " + side2 + ", and " + side3;
        s = s + " with perimeter " + perimeter() + " and area " + area() + ".";
        return s;
    }
}
