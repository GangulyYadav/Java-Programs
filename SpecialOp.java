//Java program to use instanceOf Operator
public class SpecialOp{
	public static void main(String args[]){
		String str ="Ganguly";
		boolean result;
		
		// check if str is an instance of the String class
		result = str instanceof String;
		System.out.println("Is str an object of String?\n" +  result);
	}
}