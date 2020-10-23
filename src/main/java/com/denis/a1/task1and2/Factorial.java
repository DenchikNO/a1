package com.denis.a1.task1and2;

public class Factorial {

    public double countFormula(int n) {
        return (1 / getFactorial(n)) * (sumFactorial(n));
    }

    public double getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public double sumFactorial(int n) {
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }

}