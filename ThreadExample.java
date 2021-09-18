// Java program to print good morning and welcome parallely using Thread 
// Also put a thread in sleep for 200 miliseconds
// Also set priorities
// Also get state of thread
// Also get referance
// CWH practice set 13 question 1 and 2 and 3 and 4 and 5
// By Ganguly Yadav
// 12th-August-2021

class GoodMorning extends Thread {
    public void run(){
        // while(true){
        //     try{
        //         Thread.sleep(200);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        //     System.out.println("Good Morning");
        // }
    }
}

class Welcome extends Thread {
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        Welcome w = new Welcome();
        g.setPriority(6);   // By default the priority is 5 which is called normal priority
        w.setPriority(9);   // There are three priorities MIN_PRIORITY 1 MAX_PRIORITY 10 NOM_PRIORITY 5
        g.start();
        // w.start();
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        System.out.println(g.getState());
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());

    }    
}
