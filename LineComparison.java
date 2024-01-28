package com.pratice;

public class LineComparison {

    public static void main(String[] args) {
        // Creating two lines
        Line line1 = new Line(1.0, 2.0, 4.0, 6.0);
        Line line2 = new Line(2.0, 3.0, 5.0, 7.0);

        // Comparing lines using the compareTo method
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("The lines are equal.");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }
    }
}

class Line implements Comparable<Line> {

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Override the compareTo method to compare two lines
    @Override
    public int compareTo(Line otherLine) {
        double length1 = calculateLineLength(this);
        double length2 = calculateLineLength(otherLine);

        return Double.compare(length1, length2);
    }

    // Function to calculate the length of a line
    private double calculateLineLength(Line line) {
        return Math.sqrt(Math.pow(line.x2 - line.x1, 2) + Math.pow(line.y2 - line.y1, 2));
    }
}