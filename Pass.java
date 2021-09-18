//Java program to find out whether a student is pass or fail. It is requires 
//total 40% and at least 33% in each subject to pass. Assume 3 subjects and 
//take marks as an input from the user.
//By Ganguly Yadav
//10th July 2021
import java.util.Scanner;
public class Pass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of three subjects(Between 0-100): ");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		float total=m1+m2+m3;
		float percentage=total*100/300;
		
		if(m1>=33 && m2>=33 && m3>=33 && percentage>=40)
		{
			System.out.println("You are passed with " + percentage + "%");
		}			
		else
		{
			System.out.println("You are failed!!");
		}
	}
}
 