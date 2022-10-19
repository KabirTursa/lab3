package org.example;

public class Fraction {

    public final int NUMERATOR;
    public final int DENOMINATOR;

    public Fraction(int n, int d) {
        NUMERATOR = n;
        DENOMINATOR = d;
    }

    public Fraction(Fraction other) {
        NUMERATOR = other.NUMERATOR;
        DENOMINATOR = other.DENOMINATOR;
    }

    @Override
    public String toString() {
        return NUMERATOR + "/" + DENOMINATOR;
    }

    public Fraction add(Fraction other) {
        int a = NUMERATOR;
        int b = DENOMINATOR;
        int c = other.NUMERATOR;
        int d = other.DENOMINATOR;

        int top = (a * d + c * b);
        int bottom = b * d;

        return (new Fraction(top, bottom));
    }

    public boolean equals(Object other) {
        if (other != null && !(other instanceof Fraction)) return false;

        Fraction that = (Fraction) other;
        return (NUMERATOR == ((Fraction) other).NUMERATOR && DENOMINATOR == ((Fraction) other).DENOMINATOR);
    }

    public int getNum() {
        return NUMERATOR;
    }

    public int getDenom() {
        return DENOMINATOR;
    }
}
