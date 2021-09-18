// Java Program to do sum of first n even numbers
// CWH Practice Set problem 2
// By Ganguly Yadav
// 13th-July-2021

import java.util.Scanner;

public class SumOfEvenNum{
	
	public static int sum(int n){
		int i=0;
		int total=0;
		while(i<n){
			if(i%2 == 0){
				total += i; 
			}
			i++;
		}
		return total;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last number to get the sum of first even number: ");
		int number = sc.nextInt();
		System.out.println("The sum of first "+ number+" even number is " +sum(number));
	}
}