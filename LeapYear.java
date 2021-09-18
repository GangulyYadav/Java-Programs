//Java program to find whether a year is leap year or not
//By Ganguly Yadav
//10th july 2021
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year to check whether it is leap year or not: ");
		int year = sc.nextInt();
		if(year%4==0){
			System.out.println("It's a leap year!");
		}
		else{
			System.out.println("It's not a leap year");
		}
	}
}