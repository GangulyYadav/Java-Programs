// Java program to find the sum of n natural number using recursive function
// CWH Practice set 7 question 3
// By Ganguly Yadav
// 25th July 2021

import java.util.Scanner;

public class SumOfNaturalNum {
    
    static int Sum(int n) {
       if(n==0)
        return 0;
       else
        return (n+Sum(n-1));        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till which number you have to perform the addition: ");
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
