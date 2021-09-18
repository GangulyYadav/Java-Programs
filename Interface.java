// Java program to demonstrate the interface 
// By Ganguly Yadav
// 19th-July-2021

interface Area {    // Interface defined
    final static float pi=3.14f;
    float compute(float x,float y);
} 

// We can achieve the feature of multiple inheritance in java by using interface

class Rectangle implements Area{    // Interface Area is implemented using implements keyword
    public float compute(float x, float y){
        return x*y;
    }
}

class Circle implements Area{   // Interface implemented
    public float compute(float x, float y){
        return pi*x*x;
    }
}

public class Interface {
    public static void main(String[] args) {

        // We can even create an object with the reference of interface
        Area r1 = new Rectangle();
        System.out.println("Area of rectangle = "+r1.compute(10,20));
        Area c1 = new Circle();
        System.out.println("Area of circle = "+c1.compute(10,0));
	    
        // Area a;  // of either we can create an Interface object
        // a = r1;
        // System.out.println("Area of rectangle = "+a.compute(10,20));
        // a = c1;
        // System.out.println("Area of circle = "+a.compute(10,0));
    }
}
