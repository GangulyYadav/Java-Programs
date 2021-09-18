// Java Program to demonstrate the Constructor Overloading
// By Ganguly Yadav
// 13th-July-2021

class Greet{
	String msg = "Hello, ";
	Greet(){
		System.out.println(this.msg +"There!");	
	}

	Greet(String name){
		System.out.println(this.msg + name);
	}
}

public class ConstructorOverloading{
	public static void main(String[] args){
		Greet g = new Greet();
		Greet g1 = new Greet("CodeBuddies_");
	}
}