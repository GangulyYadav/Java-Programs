// Java Program to calculate the sum of numbers occuring in multiplication table of 8
// cwh practice set 5 question 9
// By Ganguly Yadav
// 14th July 2021

public class MultiTable{
	public static void main(String[] args){
		int total=0;
		int n=8;
		for(int i=1;i<=10;i++){
			if(n*i%8==0){
				total += n*i;
			}
		}
		System.out.println("Sum of numbers occuring in table of 8 is : "+total);
	}
}