// Java program to create square class with methods area and perimeter and initialize side methods
// CWH practice set 8 question 3
// By Ganguly Yadav
// 26th July 2021
import java.util.Scanner;

class Square{
    float side;
    public void setSide(float side) {
        this.side = side;
    }
    public float area(float side){
        return side*side;
    }
    public float perimeter(float side){
        return 4*side;
    }
}
public class SquareClass {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the side of square to find out area and perimeter: ");
       float s = sc.nextFloat();
       Square sq = new Square();
       sq.setSide(s);
       System.out.println(sq.area(s));
       System.out.println(sq.area(s));
   } 
}
