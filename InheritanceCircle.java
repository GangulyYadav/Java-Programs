// Java program to create circle class and inherit a cylinder class from it
// CWH practice set 10 question 1,3

class Circle{
    public double radius=0;
    Circle(double radius){
        this.radius=radius;
        System.out.println("Circle Parameterized constructor");
    }
    
    double area(){
        return Math.PI*this.radius*this.radius;
    }

    double circumference(){
        return 2*Math.PI*this.radius;
    }
}

class Cylinder extends Circle{
    double hieght = 0;
    Cylinder(double hieght,double radius){
        super(radius);
        this.hieght = hieght;        
        System.out.println("Cylinder Constructor");
    }
    double surfacearea(){
        return (circumference()*this.hieght+2*area());
    }

    double volume(){
        return area()*this.hieght;
    }
}
public class InheritanceCircle {
    public static void main(String[] args) {
        // Circle c = new Circle(9);
        Cylinder cy = new Cylinder(12,9);
        System.out.println(cy.area()); 
        System.out.println(cy.circumference()); 
        System.out.println(cy.volume()); 
        System.out.println(cy.surfacearea()); 

    }
}
