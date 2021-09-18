//program to solve an equation
import java.util.Scanner;
public class eq{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of V,U,A,S:");
		float v = sc.nextFloat();
		float u = sc.nextFloat();
		float a = sc.nextFloat();
		float s = sc.nextFloat();

		float ans = (v*v - u*u)/(2*a*s);
		System.out.println(ans);
	}
}