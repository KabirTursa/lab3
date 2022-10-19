package org.example;

public class Math2 {
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int pow(int base, int exp) {
        int result = base;
        if (exp > 0) {
            for (int i = 0; i < exp - 1; i++) {
                result *= base;
            }
            return result;
        } else {
            return 1;
        }
    }
}
