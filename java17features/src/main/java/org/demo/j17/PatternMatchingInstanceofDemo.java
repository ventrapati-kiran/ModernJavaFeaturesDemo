package org.demo.j17;

/**
 * Java 17 Pattern Matching for `instanceof` simplifies type checking and casting.
 * It allows you to check the type of an object and cast it in a single step.
 */
public class PatternMatchingInstanceofDemo {

    public static void main(String[] args) {
        Object[] testInputs = {42, "Hello, Java 17!", 3.14, null};

        for (Object input : testInputs) {
            System.out.println("Input: " + input + " -> Result: " + processInput(input));
        }
    }

    public static String processInput(Object input) {
        if (input instanceof Integer i) {
            return "Integer: " + (i * 2);
        } else if (input instanceof String s) {
            return "String: " + s.toUpperCase();
        } else if (input instanceof Double d) {
            return "Double: " + (d / 2);
        } else if (input == null) {
            return "Input is null";
        } else {
            return "Unknown type";
        }
    }
}
