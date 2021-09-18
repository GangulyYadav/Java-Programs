// Java program to create an array of 5 floats and calculate their sum
// cwh practice set 6 question 1
// By Ganguly Yadav

import java.util.Scanner;

public class FloatArrSum{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter 5 numbers to get the sum: ");
		float[] arr = new float[5];
		float sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextFloat();
			sum += arr[i];
		}
		System.out.println("The sum of numbers is: "+sum);
	}
}