
package classes;

public class Rectangle {
    /*

    //data fields
    private double length;
    private double width;
    //methods
    Rectangle(){
        length=1;
        width=1;
    }
    
    Rectangle(double ell, double w){
        length = ell;
        width = w;
    }
    
    public void setLength(double ell){
        length = ell;
    }
    public void setWidth(double w){
        width = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2*length + 2*width;
    }             
public String toString(){
String s;
s = "Rectangle has lenght "+ length + " and width" + width + " and area " + area() + " and perimeter "+perimeter()+".";
return s;
}
public boolean equals (Rectangle r){
    if (length == r.length && width == r.width)
        return true;
    return false;
}
}
*/
//data fields
    protected double length;
    protected double width;//you can say private but when using protected it lets you use the exact name in any class which inherited it.
    //methods
    Rectangle(){
        length=1;
        width=1;
    }        
Rectangle(double ell, double w){
        length = ell;
        width = w;
    }
        public void setLength(double ell){
        length = ell;
    }
    public void setWidth(double w){
        width = w;
    }        
public double getLength(){
        return length;
    }
        public double getWidth(){
        return width;
    }        public double area(){
       return length * width;
    }    public double perimeter(){
        return 2*length + 2*width;    
}                 
    public boolean equals (Rectangle r){
    if (length == r.length && width == r.width)
        return true;
    return false;
    }
public String toString(){
        String s = "";
        s = s + "For a rectange with length " + length;
        s = s + " and width " + width;
        s = s + ", the area is " + this.area();
        s = s + ", and the perimeter is  " + this.perimeter() + ".";
        return s;
        
    }
}

