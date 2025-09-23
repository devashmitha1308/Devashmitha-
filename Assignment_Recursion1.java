class Assignment_Recursion1 {
    void printBeats(int n) {
        if (n == 0) return;   // base case

        printBeats(n - 1);    // recursion call pehle (1 se n-1 print karega)
        System.out.print(n + " "); // phir n print karo
    }
}
