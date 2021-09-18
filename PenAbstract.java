// Java program to create a Pen abstract class with write and refil abstract methods
// CWH practice set 11 question 1
// By Ganguly Yadav
// 2nd August 2021

abstract class Pen{
    abstract public void write();
    abstract public void refil();
}

public class PenAbstract extends Pen {
    public void write(){
        System.out.println("Writing...");
    }

    public void refil(){
        System.out.println("Refiling..");
    }

    public static void main(String[] args) {
        PenAbstract p = new PenAbstract();
        p.write();
        p.refil();
    }
    
}
