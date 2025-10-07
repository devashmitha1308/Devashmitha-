//Ques_1:The king's fest
//The King has n plates of food, each with a certain quantity. He wants to know the maximum food plate.
//● Input: n=5, arr=[2,7,1,9,5]
//● Output: 9
//● Constraints: 1 ≤ n ≤ 10^5, -10^9 ≤ arr[i] ≤ 10^9


//CODE

import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();                                //user input for array size declaration
        int[] array= new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();                  //user input for array elements
        }

        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){                          //maximum value element calculation
                max=array[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}