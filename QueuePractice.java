// Program to implement Queue
// 27th July 2021

import java.util.Scanner;

class Queue {
    Scanner sc = new Scanner(System.in);
    int[] queue = new int[10];
    int length = 0;

    void print() {
        if (queue.length == 0) {
            System.out.println("The array is empty!");
        } else {
            for (int i = 0; i < length; i++)
                System.out.print(queue[i]+" ");
        }
        System.out.println();
        
    }

    void insert(int count) {
        for (int i = 0; i < count; i++) {
            queue[i] = sc.nextInt();
            length++;
        }
    }

    void delete() {
        if (queue.length == 0) {
            System.out.println("The array is empty!");
        } else {
            for (int i = 0; i < length; i++) {
                queue[i] = queue[i + 1];
            }
            length--;
        }


    }
}

public class QueuePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        boolean exit = true;
        while(exit == true){
        System.out.println("What do you want to do?");
        System.out.println("1. Insertion in Queue \n2. Deletion in Queue \n3. Print Queue \n4. Exit ");
        int choice = sc.nextInt();
        int count = 0;
        switch (choice) {
            case 1:
                char again;
                again = 'y';
                while (again == 'y') {
                    System.out.println("How may elements you want to enter:");
                    count = sc.nextInt();
                    System.out.println("Enter " + count + " elements:");
                    q.insert(count);
                    System.out.println("Do you want to insert again?(y/n):");
                    again = sc.next().charAt(0);
                }
                System.out.println("After insertion the Queue is:");
                q.print();
                break;

            case 2:
                again = 'y';
                while (again == 'y') {
                    q.delete();
                    System.out.println("Do you want to delete again?(y/n):");
                    again = sc.next().charAt(0);
                }
                System.out.println("After deletion the Queue is:");
                q.print();
                break;

            case 3:
                q.print();
                break;

            case 4:
                System.out.println("Exit successfully!");
                exit = false;
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}
}
