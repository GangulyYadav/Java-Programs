/* calculate income tax paid by an employee to the goverment as per the slabs 
mentioned below

Income slab		tax
2.5l - 5l		5%
5l -  10l		20%
above 10l 		30%

below 2.5l no tax */

import java.util.Scanner;
public class Tax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income: ");
		int income = sc.nextInt();
		int tax = 0;
		if(income>1000000){
			tax = income*30/100;
			System.out.println("Your tax is :" + tax);	
		}
		else if(income>500000){
			tax = income*20/100;
			System.out.println("Your tax is :" + tax);	
		}
		else if(income>250000){
			tax = income*5/100;
			System.out.println("Your tax is :" + tax);	
		}
		else{
			System.out.println("You are tax free!!");
		}
	}
}