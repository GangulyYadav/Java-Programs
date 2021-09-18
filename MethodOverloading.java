//Java Program to demonstrate concept of method overloading
// By Ganguly Yadav
// 13th July-2021

class Calculate{
	int answer = 0;
	// We cannot declare two methods with different return type and same parameters
	int sum(int a,int b){   // Formal Parameters   
		answer = a + b;
		return answer;
	}
	
	int sum(int a,int b,int c){ 	//Parameters may be of different types and vary in numbers
		answer = a + b + c;
		return answer;
	}
}

public class MethodOverloading{
	public static void main(String[] args){
		System.out.println("Method Overloading Program");
		Calculate cal = new Calculate();
		System.out.println("The sum of 9 and 8 is : "+ cal.sum(9,8));  // Actual Parameters
		System.out.println("The sum of 9,8 and 10 is : "+ cal.sum(9,8,10));						
	}
}