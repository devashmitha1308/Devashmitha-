//Q2. The Lost Soldier
//In the battlefield, soldiers are numbered 0…n. One soldier is missing. Find him.
//● Input: n=5, arr=[0,1,2,4,5]
//● Output: 3
//● Constraints: O(n) or O(log n) solution required.

//CODE

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of array:");
        int n=5;
        int[] array= {0,1,2,4,5};
        int sum=n*(n+1)/2;

        int asum=0;
        for(int i=0;i<array.length;i++){
            asum+=array[i];

        }
        if(sum==asum){
            System.out.println("No missing term.");
        }else if(sum>asum){
            System.out.println(sum-asum);
        }
        sc.close();
    }
}