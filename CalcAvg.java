// Java program to calculate average of marks using for each loop
// cwh practice set 6 question 3
// By Ganguly Yadav
// 14th-July-2021

//import java.util.Scanner;

public class CalcAvg{
	public static void main(String[] args){
		//Scanner sc = new  Scanner(System.in);
		float[] arr = {90.5f,86.5f,93,80,82.5f};
		float total=0,avg=0;

		for(float item:arr){
			total +=item;
		}
		avg=total/5;
		
		System.out.println("The average of students physics marks is: "+avg);
	}
}