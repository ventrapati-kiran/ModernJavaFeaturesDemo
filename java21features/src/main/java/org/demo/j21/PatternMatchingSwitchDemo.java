package org.demo.j21;

/**
 * Pattern Matching for Switch
Enhancements to pattern matching in switch statements.
 */
public class PatternMatchingSwitchDemo {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21!";
        String result = switch (obj) {
            case String s -> "String: " + s.toUpperCase();
            case Integer i -> "Integer: " + (i * 2);
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}