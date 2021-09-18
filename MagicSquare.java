//Java Program to check whether the matrix is magic square or not
//By Ganguly Yadav
//6th July 2021
import java.util.Scanner;
public class MagicSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~~~~Magic Square Checker~~~~~~");
		System.out.println("Enter the size of matrix:");
		int size = sc.nextInt();					//taking the matrix size
		System.out.println("Enter the "+size+"x"+size+" matrix:");
		int matrix[][] = new int[size][size];
		for(int i=0;i<size;i++){					//taking input of matrix
			for(int j=0;j<size;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int dia=0, row=0, col=0;
		for(int i=0;i<size;i++){			//Making the sum of diagonal elements
			dia = dia+matrix[i][i];
		}

		int found=0;
		for(int i=0;i<size;i++){			//Making the sum of row elements
			row = 0;
			for(int j=0;j<size;j++){
				row = row+matrix[i][j];
			}
			if(dia==row)				//Checking whether the sum of row and diagonal elements is same or not
				found = 1;
			else{
				found = 0;
				break;
			}
		}	
		if(found==1)
		{
			for(int i=0;i<size;i++){		//Making the sum of column elements
				col=0;
				for(int j=0;j<size;j++){
					col = col+matrix[i][j];
				}
				if(dia==col)			//Checking whether the sum of column and diagonal elements is same or not
					found = 1;
				else{
					found = 0;
					break;
				}
			}
			
		}
		
		if(found==1)
			System.out.println("The Matrix is Magic Square:)");			
		else
			System.out.println("The Matrix is not Magic Square!");		
	}
}