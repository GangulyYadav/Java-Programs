// Java program print a pattern
// CWH Practice set 7 question 2
// By Ganguly Yadav
// 25th July 2021

import java.util.Scanner;

public class Pattern1 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print:");
        int n = sc.nextInt();
        pattern(n);
    }
}
