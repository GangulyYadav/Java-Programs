public class TypeCasting{
	public static void main(String[] args){
		//Assigning value of small data type to the large data type
		//This is called implicit or widening type casting
		int x = 4;
		double y = x;
		System.out.println(y);
		
		//Assinging value of large data type to small data type is called explicit casting or narrowing casting
		double myDouble = 3.147292;
		int myInt = (int)myDouble;
		System.out.println(myDouble);
		System.out.println(myInt);
	
	}
}