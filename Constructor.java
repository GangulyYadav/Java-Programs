// Java Program to demonstrate the Constructor Overloading
// By Ganguly Yadav
// 13th-July-2021

class Greet{
	String msg = "Hello, ";
	Greet(String name){
		System.out.println(this.msg + name);
	}
}

public class Constructor{
	public static void main(String[] args){
		Greet g1 = new Greet("CodeBuddies_");
	}
}