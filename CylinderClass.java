// Java program to create a class cylinder and set hight and radius using getter and setter
// CWH practice set 9 question 1
// By Ganguly Yadav
// 26th July 2021

import java.util.Scanner;

class Cylinder{
    private float height,radius;
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public float area(){
        return 3.14f*radius*radius*height/2;
    }
    public float volume(){
        return 3.14f*radius*radius*height;
    }
}
public class CylinderClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c1 = new Cylinder();
        System.out.println("Enter height and radius of cylinder: ");
        float h = sc.nextFloat();
        float r = sc.nextFloat();
        c1.setHeight(h);
        c1.setRadius(r);
        System.out.println("The height is set to :"+c1.getHeight()+"\nThe radius is set to :"+c1.getRadius());
        System.out.println("The area of Cylinder is:"+c1.area()+"\nThe volume of Cylinder is :"+c1.volume());
    }
}
