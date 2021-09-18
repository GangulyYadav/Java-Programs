import java.util.ArrayList;
import java.util.Scanner;
// Java program to create an arraylist and store 10 student name in it and print it using for each loop
// CWH practice set 15 question 1
public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        // students.add("Ganguly");
        // students.add("Krushna");
        // students.add("Kundan");
        // students.add("Ashutosh");
        // students.add("Jayesh");
        // students.add("Parth");
        // students.add("Vaibhav");
        Scanner sc = new Scanner(System.in);
        String name;
        char again = 'y';
        System.out.println("Enter student name: ");
        while(again=='y'){
            name = sc.nextLine();
            students.add(name);
            System.out.println("Do you want to enter again(Y/N)? ");
            again = sc.next().charAt(0);
            sc.nextLine();   // To catch buffer
        }

        for (String string : students) {
            System.out.println(string);
        }
    }
}
