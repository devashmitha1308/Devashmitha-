public class Recursion2 {
    public static int Sum(int n){
        if(n == 0) return 0;
        return (int)Math.pow(2,n) + Sum(n-1);

    }
    public static void main(String[]args){
        int n = 5;
        System.out.println(Sum(n));
    }
}
