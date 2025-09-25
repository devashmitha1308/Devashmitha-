public class SumOfSquares {
    public static int Sumofsquares(int n){
        if(n == 0) return 0;
        return (n*n) + Sumofsquares(n-1);

    }
    public static void main(String[]args){
        System.out.println(Sumofsquares(4));

    }
}
