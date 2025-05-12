package org.demo.j21;

/**
 * Pattern Matching for Switch
 * Enhancements to pattern matching in switch statements.
 * 
 * Use Case:
 * Simplifies switch statements with type checks and casts.
 * 
 * How to Use:
 * Use `case` with a type pattern in a switch statement.
 */
public class PatternMatchingSwitchDemo {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21!";

        // Pattern matching in switch
        String result = switch (obj) {
            case String s -> "String: " + s.toUpperCase();
            case Integer i -> "Integer: " + (i * 2);
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}