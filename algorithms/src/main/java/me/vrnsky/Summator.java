package me.vrnsky;

public class Summator {

    public int iterativeSum(int n) {
        int sum = 0;
        for (int index = 0; index <= n; index++) {
            sum += index;
        }
        return sum;
    }

    public int recursiveSum(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + recursiveSum(n - 1);
        }
    }
}
