// By Ganguly Yadav
// Implementing multiple inheritance using interface
// We can't use multiple inheritance 
// So it can be achieved by using interface
//20th-July-2021

import java.util.Scanner;
// In interface all the methods are abstract 
// We can only declare the methods in interface
interface Camera{
    void takePicture();
    void takeSelfi();
}

interface Call{
    void voiceCall(String number);
    void videoCall(String number);
}

interface Message{
    void textMsg(String number,String msg);
}

class SmartPhone implements Camera,Call,Message{  // Implementing multiple interface, cant extend multiple classes
    
    public void takePicture() {
        System.out.println("Taking a picture..");
    }
    
    public void takeSelfi() {
        System.out.println("Taking a Selfi..");
    }

    public void voiceCall(String number) {
        System.out.println("Calling ... " + number);
    }
    
    public void videoCall(String number) {
        System.out.println("Video Calling ... " + number);
    }

    public void textMsg(String number,String msg){
        System.out.println("Sending "+msg+" to "+number);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.println("What do you want to do?");
        System.out.println("Select from below: \n 1. Make a Call \n 2. Make a video call \n 3. Take a picture \n 4. Take a Selfi \n 5. Text Message");
        
        SmartPhone iPhone = new SmartPhone();
        
        int choice = sc.nextInt();
        sc.nextLine();  
	/*That is because after reading int there left a new line character which was consumed by your sc.nextLine and it did not wait for your next input. You need to consume it(by using sc.nextLine();) before reading a String.*/
        
        if(choice==1) {
            System.out.println("Dial the number:");
            String number = sc.nextLine();
            iPhone.voiceCall(number); // Base class method
        }
        else if(choice==2) {
            System.out.println("Dial the number:");
            String number = sc.nextLine();
            iPhone.videoCall(number); // Derived class method
        }
        else if(choice==3){
            iPhone.takePicture();
        }
        else if(choice==4){
            iPhone.takeSelfi();
        }
        else if(choice==5){
            System.out.println("Dial the number:");
            String number = sc.nextLine();
            System.out.println("Type the message: ");
            String msg = sc.nextLine();
            iPhone.textMsg(number,msg);
        }
        else{
            System.out.println("Select valid feature!!");
        }
    }
}
