package org.demo.j21;

/**
 * Record Patterns
 * Record patterns allow destructuring records in switch and if statements.
 * 
 * Use Case:
 * Useful for pattern matching and extracting data from records.
 * 
 * How to Use:
 * Use `instanceof` with a record pattern to destructure a record.
 */
public class RecordPatternDemo {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(3, 4);

        // Pattern matching with record
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point coordinates: x=" + x + ", y=" + y);
        }
    }
}