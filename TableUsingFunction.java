// Java program to print multiplication table using method
// CWH practice set 6 question 1
// By Ganguly Yadav
// 25th July 2021

import java.util.Scanner;



public class TableUsingFunction {
    static void table(int n){
        for(int i=0;i<10;i++)
            System.out.println(n+" X "+i+" = "+n*i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print table:");
        int n = sc.nextInt();
        table(n);
    }
}
