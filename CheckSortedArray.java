// Java program to find whether the array is sorted or not
// CWH Practice set 6 question 8
// By Ganguly Yadav
// 24th July 2021

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int n = sc.nextInt();
        boolean sorted = true;
        System.out.println("Enter the elements:");
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
        }
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted!!");
        }

        if (!sorted) {
            System.out.println("The array sorted array is ");
            for (int j = 0; j < n; j++) {
                 System.out.print(arr[j] + " ");
            }
        }

    }
}
