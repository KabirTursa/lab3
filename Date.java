package org.example;
/**
 * Write a description of class Date here.
 *
 * @author Meng
 * @version 9/30/2018
 */
public class Date
{
    //instance variables: "has a"
    private int month;
    private int day;
    private int year;

    //constructors
    public Date(int month, int day, int year) {
        setDay(day);
        setYear(year);
        setMonth(month);
    }

    public Date() {
        month = 1;
        day = 1;
        year = 1;
    }

    //copy constuctor
    public Date(Date d) {
        this.month = d.month;
        this.day = d.day;
        this.year = d.year;
    }


    //getters and setters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1) {
            System.out.println("Month not set, invalid value. Use an integer between 1 and 12");
        } else {
            this.month = month;
        }
    }

    public void setDay(int day) {
        if (day > 31 || day < 1) {
            System.out.println("Day not set, invalid value. Use an integer between 1 and 31");
        } else {
            this.day = day;
        }
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Year not set, invalid valuje. Use a positive integer");
        } else {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args){
        Date d = new Date();
        d.setDate(10, 21, 2018);
        d.report();
    }

    //setter
    public void setDate(int m, int d, int y){//what should you check?
        if (m > 12 || m < 1) {
            System.out.println("Month not set, invalid value. Please use an integer between 1 and 12");
        } else {
            this.month = m;
        }
        if (d > 31 || d < 1) {
            System.out.println("Day not set, invalid value. Please use an integer between 1 and 31");
        } else {
            this.day = d;
        }
        if (y < 0) {
            System.out.println("Year not set, invalid value. Please use a positive integer");
        } else {
            this.year = y;
        }
    }
    
    //prints out date
    public void report(){
        System.out.printf("%d/%d/%d",month, day, year);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (!(other instanceof Date))
            return false;
        Date that = (Date) other;
        return (this.month == that.getMonth() && this.year == that.getYear() && this.day == that.getDay());
    }
}
