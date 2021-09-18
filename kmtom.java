//Java program to convert kilometers into miles
import java.util.Scanner;
public class kmtom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double km,miles;
		double conversionFactor = 1.609344;
		System.out.println("Enter Kilometers: ");
		km = sc.nextDouble();
		miles = km/conversionFactor;
		System.out.println("Miles : " + miles);
	}
}