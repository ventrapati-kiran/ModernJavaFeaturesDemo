package org.demo.j21;
/**
 * Record patterns allow destructuring records in switch and if statements.
 */
public class RecordPatternDemo {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(3, 4);
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point coordinates: x=" + x + ", y=" + y);
        }
    }
}