package org.demo.j21;

/**
 * String templates allow embedding expressions directly into strings.
 */
public class StringTemplateDemo {
    public static void main(String[] args) {
        int age = 25;
        String name = "John";
        String message = STR."Hello, \{name}! You are \{age} years old.";
        System.out.println(message);
    }
}