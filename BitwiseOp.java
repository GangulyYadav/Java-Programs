//Java program to use bitwise operators
public class BitwiseOp{
	public static void main(String args[]){
		int num1= 14,num2=26,result;

		//Bitwise AND & operator
		result = num1 & num2;
		System.out.println(result);
		
		//Bitwise OR | operator
		result = num1 | num2;
		System.out.println(result);

		//Bitwise XOR ^ operator
		result = num1 & num2;
		System.out.println(result);

		//Bitwise Coplement ~ operator
		result = ~num1;
		System.out.println(result);

		//Bitwise Left Shift << operator
		result = num1 << 2;
		System.out.println(result);

		//Bitwise Right Shift >> operator
		result = num1 >> 2;
		System.out.println(result);

		//Bitwise Unsigned Right Shift >>> operator
		result = num1 >>> 2;
		System.out.println(result);
	}
}