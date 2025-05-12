package org.demo.j21;

/**
 * String Templates (Preview)
 * String templates allow embedding expressions directly into strings.
 * 
 * Use Case:
 * Simplifies string formatting and improves readability.
 * 
 * How to Use:
 * Use the `STR` keyword to create a string template.
 */
public class StringTemplateDemo {
    public static void main(String[] args) {
        int age = 25;
        String name = "John";

        // String template with embedded expressions
        String message = STR."Hello, \{name}! You are \{age} years old.";
        System.out.println(message);
    }
}