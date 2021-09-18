// Java program to add two matrices of size 2 X 3
// cwh practice set 6 question 4
// By Ganguly Yadav
// 14th-July-2021  sorry there is a gap of 2 day now contiue from 17th july

// Step 1 : Take the same number of rows and column from user so you dont have to check condition
// Step 2 : 

import java.util.Scanner;

public class AddMatrices{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many matrices you want to add: ");
	int n = sc.nextInt();
	
	System.out.println("Enter the number of rows and columns : ");
    int row = sc.nextInt();
	int column = sc.nextInt();
	
	int[][] matrix = new int[3][3];	
	int[][] answer = new int[3][3];	
	for(int i=0;i<n;i++){
		System.out.println("Enter the elements of "+ (i+1) +" matrix: ");
		for(int j=0;j<row;j++){
			for(int k=0;k<column;k++){
				matrix[j][k] = sc.nextInt();	
				answer[j][k] += matrix[j][k];
			}
		}
	}

	System.out.println("The sum is: ");		
		for(int j=0;j<row;j++){
			for(int k=0;k<column;k++){
				
				System.out.print(answer[j][k]+" ");	
			}
			System.out.println();	
		}			
	}
}