import java.util.Scanner;
public class Arr{
  public static void main(String[] args){
	// Array declaration with size
	int[] num = new int[5];
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter five numbers for array:");
	// for loop storing input
	for(int a=0;a<5;a++)
		num[a] = inp.nextInt();

	//Printing elements
	for(int a : num)
		System.out.println(a);
  }
}