// Java program to create CellPhone class with methods printing ringing and vibrating methods
// CWH practice set 8 question 2
// By Ganguly Yadav
// 26th July 2021
class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
}
public class Cell {
    public static void main(String[] args) {
        CellPhone mobile = new CellPhone();
        mobile.ringing();
        mobile.vibrating();
    }    
}
