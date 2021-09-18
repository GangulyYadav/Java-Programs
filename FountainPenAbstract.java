// Java program to create a Pen abstract class with write and refil abstract methods
// CWH practice set 11 question 2
// By Ganguly Yadav
// 2nd August 2021

abstract class Pen{
    abstract public void write();
    abstract public void refil();
}

class FountainPen extends Pen {
    public void write(){
        System.out.println("Writing...");
    }

    public void refil(){
        System.out.println("Refiling..");
    }

    public void changeNib(){
        System.out.println("Changing nib..");
    }
}

public class FountainPenAbstract {
  

    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        p.write();
        p.refil();
        p.changeNib();
    }
    
}

