// Java program to find the maximum number from the array
// CWH practice set 6 question 6
// By Ganguly Yadav
// 23rd July 2021

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter:");
        int n = sc.nextInt();
        System.out.println("Enter all the elements of array:");
        int[] arr = new int[20];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        
        int max = 0;        // Assume only positive value in array
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum number is "+max);
    }
}
