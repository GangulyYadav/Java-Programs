// Program to calculate CGPA using three subjects marks
import java.util.Scanner;
public class cgpa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of three subject:");
		int a,b,c,sum=0,avg=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		avg = sum/3;
		System.out.println("CGPA:");
		System.out.println(avg);
	}
}