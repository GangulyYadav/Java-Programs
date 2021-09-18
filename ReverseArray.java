// Java program to reverse an array
// cwh practice set 6 question 5
// By Ganguly Yadav 
// 18th-July-2021

import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter:");
        int elements = sc.nextInt(); 
        int[] arr = new int[elements];
        int l = arr.length;
        int temp;
        
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }

        int n = Math.floorDiv(arr.length,2);
        
        for (int i=0;i<n;i++){
            //Swapping two elements a[i] abd a[l-1-i] 
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp; 
        }
        
        System.out.println("The reversed array is:");
        for(int element:arr){
            System.out.print(element+" ");
        }
        
    }    
}