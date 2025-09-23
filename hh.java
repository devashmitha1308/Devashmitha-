class Assignment_Recursion2 {
    void printEcho(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        printEcho(n - 1);
    }
}
