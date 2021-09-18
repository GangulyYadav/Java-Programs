// Java program to find a minmum element from array
// CWH Practice set 6 question 7
// By Ganguly Yadav
// 24th July 2021

import java.util.Scanner;
public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.println("How many elements you want to enter?");
        int n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        min = arr[0];
        
        for (int i = 0; i < n; i++) {
            if(min>arr[i])
                min = arr[i];
        }

        System.out.println("The minimum number is "+min);

    }
}
