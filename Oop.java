//Java Program to demonstrate an application with two classes
// By Ganguly Yadav
// 12th-July-2021
import java.util.Scanner;

class Teacher{		
	public void amIAudible(){
		System.out.println("Teacher : Am I Audible?"); 
	}
	
	public void startLecture(boolean ans){
		if(ans == true)
			System.out.println("So we can start our lecture now.");
		else
			System.out.println("There might be some network issues!");
	}	
			
}

class Student{       // remaining class should not be public 
	public boolean answer(char x){
		if(x == 'y'){
			System.out.println("Student : Yes mam, You are audible.");
			return true;
		}
		else{
			System.out.println("Student(Message in chat) :No mam, You are not audible!");
			return false;
		}
	}	
}

public class Oop{	//there should be only one public class in one java program
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Teacher mam = new Teacher();
		Student me = new Student();
		mam.amIAudible();
		char ansr = sc.next().charAt(0);
		boolean yes = me.answer(ansr);
		mam.startLecture(yes);					
	}
}