import java.util.Scanner;

class CellPhone {           //Parent class/Super class/Base class
    String number;
    public void calling(String number){
        System.out.println("Calling... "+number);
    }

    public void takePicture(){
        System.out.println("Taking a picture..");
    }
}

class SmartPhone extends CellPhone{     //Sub class or child or derived class
    
    public void calling(String number){
        System.out.println("Video Calling ... "+number);
    }
    public void selfi(){
        System.out.println("Taking a Selfi..");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CellPhone nokia = new CellPhone();
        SmartPhone rog = new SmartPhone();

        System.out.println("Enter the number:");
        String number = sc.nextLine();

        nokia.calling(number);
        nokia.takePicture();
        rog.calling(number);
        rog.selfi();
        
    }
}
