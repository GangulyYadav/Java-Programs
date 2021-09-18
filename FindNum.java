// Java program to find whether the integer is present in array or not
// cwh practice set 6 question 2
// By Ganguly Yadav
// 14th-July-2021

import java.util.Scanner;

public class FindNum{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter number to check whether the number is present in array or not:");
		int n = sc.nextInt();
		
		int[] arr = {10,20,30,40,50};
		boolean flag = false;
		int i=0;
		while(i < arr.length){
			if(n==arr[i]){
				flag = true;
				break;
			}
			i++;
		}
		
		if(flag==true)
			System.out.println(n+" is present in array at "+i+" location");
		else
			System.out.println(n+" is not present in array!!");		
	}
}