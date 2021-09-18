//Java program to find avg using varags
// CWH practice set 7 question 6
// By Ganguly Yadav 
//  25th July 2021  finally done at 26th July
import java.util.Scanner;
public class AvgVarags {

    static float avg(int count,float ...arr){
        float sum=0;
        for(float a:arr){
            sum +=a;
        }
        System.out.println(count);
        System.out.println(sum);
        float average = sum/(float)count;

        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter:");
        int count=sc.nextInt();
        System.out.println("Enter numbers to find the average:   To exit press x ");
        float[] arr=new float[10];
        int i=0;
        while(i<count){
            arr[i] = sc.nextFloat();
            i++;
        }
        System.out.println("The average of all the numbers is :"+avg(count,arr));

    }
}
