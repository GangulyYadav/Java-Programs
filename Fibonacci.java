//Java program to find the nth term of fibonacci series
// CWH practice set 7 question 5
// By Ganguly Yadav 
//  25th July 2021

import java.util.Scanner;

public class Fibonacci {
    static int fibonacciTerm(int n){
        if(n<=1)
            return n;
        else{
            return ((n-2)+(n-1));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which term of fibonacci series you want: ");
        int n = sc.nextInt();
        System.out.println("The "+n+"th term is "+fibonacciTerm(n));
    }    
}
