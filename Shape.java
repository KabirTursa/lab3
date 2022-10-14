package org.example;

import java.awt.*;

/* Class invariants
x must be positive
y must be positive
x must be an integer
y must be an integer

 */
public class Shape {
    private int x;
    private int y;
    private Color c;

    //constructors
    public Shape() {
    }

    public Shape(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public Shape(Shape other) {
        this.x = other.x;
        this.y = other.y;
        this.c = other.c;
    }

    //methods
    public String toString() {
        return "x: " + x + " y: " + y + " Color: " + c;
    }

    public double getArea() {
        return -1;
    }

    public void draw(Graphics g) {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
