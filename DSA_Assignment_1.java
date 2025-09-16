import java.util.Scanner;
public class DSA_Assignment_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][]arr = new int[N][M];
        int[]arr1 = new int[N];

        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i = 0;i<N;i++){
            int sum = 0;
            for(int j = 0;j<M;j++){
                sum += arr[i][j];
            }
            arr1[i]=sum;
        }
        int index = 0;
        int max = arr1[0];
        for(int i = 1;i<N;i++){
            if(arr1[i]>max){
                max = arr1[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
