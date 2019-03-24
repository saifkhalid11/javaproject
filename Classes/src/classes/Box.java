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
public class Box extends Rectangle {//Froom here //Goto super
    //data fields OR instanteation variables
    private double height;
        Box(){
        super();//Calling Rectangle from the Rectangle class by saying Box extends Rectangle
        height = 1;
    }
    Box (double ell, double w, double h){
        super(ell, w);
        height = h;    
}
    public void setHeight(double h){
        height = h;
    }    
public double getHeight(){
        return height;
    }
    public double volume(){
        return length*width*height;
    }
    public double area(){
        return 2*(length*width + width*height + height*length);
    }    
public double perimeter(){
        return 4*(length + width + height);
    }


    public boolean equals(Box b){
    return (b.length == length && b.width==width && b.height == height);
}

    public String toString(){
        return "This box object has length " + length + " and width " + width + " and height " + height + " and volume " + volume() + " and surface area " + area() +" and edge length " + perimeter() + ".";
    }

    
}
