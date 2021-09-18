// Java program to demostate multithreading
// By Ganguly Yadav
// 12th-August-2021

class GoodMorning extends Thread {
    public void run(){
	int i=1;
         while(i<10){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
               System.out.println(e);
            }
            System.out.println("Good Morning");
	    i++;
      	 }
    }
}

class Welcome extends Thread {
    public void run(){
	int i=1;
         while(i<10){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
               System.out.println(e);
            }
            System.out.println("Welcome");
	    i++;
      	 }
    }
}
public class Threadex {
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();
        g.start();
        w.start();

    }    
}
