//Q3. Potion Mixing (Two Sum)
//A wizard wants to mix two potions whose strengths add up to target.
//● Input: n=4, arr=[3,2,4,7], target=6
//● Output: Indices (1,2)
//● Constraints: 1 ≤ n ≤ 10^5, -10^9 ≤ arr[i] ≤ 10

//CODE
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of array:");
        int n=5;
        int[] array= {0,1,2,4,5};
        int t=6;

        int num1=0,num2=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==t){
                    num1=array[i];
                    num2=array[j];
                    break;
                }
            }
        }
        System.out.print(num1+","+num2);
        sc.close();
    }
}