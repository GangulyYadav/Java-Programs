// Java program to demonstrate inheritance in java 
// By Ganguly Yadav
// 19th-July-2021

import java.util.Scanner;
class CellPhone { // Parent class,Super class or Base class
    String number;

    public void call(String number) {
        System.out.println("Calling ... " + number+" using cell phone.");
    }

    public void takePicture() {
        System.out.println("Taking a picture.. using cell phone.");
    }

}

class SmartPhone extends CellPhone { // Sub class or child or derived class
    public void videoCall(String number) {
        System.out.println("Video Calling ... " + number+" using smart phone");
    }

    public void selfi() {
        System.out.println("Taking a Selfi.. using smart phone");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CellPhone nokia = new CellPhone(); // Base class objects
        SmartPhone samsung = new SmartPhone(); // Derived class objects

        System.out.println("Dail the number:");
        String number = sc.nextLine();
        System.out.println("What do you want to do?");
        System.out.println("Select from below: \n\t 1.Make a Call \n\t 2.Make a video call \n\t 3.Take a picture \n \t 4.Take a Selfi");

        int choice = sc.nextInt();
        if(choice==1) {
            nokia.call(number); // Base class method
        }
        else if(choice==2) {
            samsung.videoCall(number); // Derived class method
        }
        else if(choice==3){
            nokia.takePicture();
        }
        else if(choice==4){
            samsung.selfi();
        }
        else{
            System.out.println("Select valid feature!!");
        }

    }
}
