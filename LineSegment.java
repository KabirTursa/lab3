package org.example;

/* ANSWERS TO QUESTIONS
A privacy leak is when the client has access to the original copy of your object.
They should only ever have access to a copy of the object, but since Java passes the reference to
objects instead of the copy of the object, a user can gain access to that reference, which points
to the memory address of the original object.

I don't think my getters and setters have privacy leaks. This is because when we return the object
in the getters, the overridden toString() method in Point2D is called. All this does is return a string
of the point's coordinates on a coordinate plane. (3, 3) for example.

A privacy leak could occur anywhere you are dealing with objects instead of primitives. Since Java
passes the reference to an object instead of a copy of it like it does with primitives, someone
could gain access to that reference to a spot in memory and do whatever they want with it.
 */
public class LineSegment {

    private Point2D startPoint;
    private Point2D endPoint;

    //constructors
    public LineSegment() {
        startPoint = new Point2D(0, 0);
        endPoint = new Point2D(0, 0);
    }

    public LineSegment(Point2D start, Point2D end) {
        if (start == null || end == null) {
            System.out.println("Points are null, object not created");
        } else {
            startPoint = new Point2D(start.getX(), start.getY());
            endPoint = new Point2D(end.getX(), end.getY());
        }
    }

    public LineSegment(LineSegment other) {
        startPoint = new Point2D(other.startPoint.getX(), other.startPoint.getY());
        endPoint = new Point2D(other.endPoint.getX(), other.endPoint.getY());
    }

    //getters and setters
    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line start" + startPoint.toString() + " and end" + endPoint.toString();
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof LineSegment)) {
            return false;
        }
        LineSegment that = (LineSegment) other;
        return (startPoint.equals(((LineSegment) other).startPoint) && endPoint.equals(((LineSegment) other).endPoint));
    }

    public double distance() {
        int x2 = startPoint.getX();
        int x1 = endPoint.getX();
        int y2 = startPoint.getY();
        int y1 = endPoint.getY();
        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
