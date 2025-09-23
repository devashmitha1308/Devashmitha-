class Assignment_Recursion3 {
    int treasurySum(int n) {
        if (n == 0) return 0;
        return n + treasurySum(n - 1);
    }
}

