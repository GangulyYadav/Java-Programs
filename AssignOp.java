// Java program to use Assignment operators
public class AssignOp{
	public static void main(String args[]){
		System.out.println("~~~~~~~Assignmetn Operators~~~~~~~");
		int n = 10;
		int var;
		
		var = n;
		System.out.println("Var using = : " + var);
		
		var += n;
		System.out.println("Var using += : " + var);

		var -= n;
		System.out.println("Var using -= : " + var);

		var *= n;
		System.out.println("Var using *= : " + var);

		var /= n;
		System.out.println("Var using /= : " + var);

		var %= n;
		System.out.println("Var using %= : " + var);
	}
}	