package org.demo.j17;


/**
 * Java 17 Switch Expression Demo
 * Switch https://unifiedportal-mem.epfindia.gov.in/memberinterface/expressions allow returning values directly from a switch block.
 * They also support multiple labels and the `yield` keyword for returning values.
 */
public class SwitchExpressionDemo {

    public static void main(String[] args) {
        System.out.println("Day 1 is: " + getDayType(1));
        System.out.println("Day 5 is: " + getDayType(5));
        System.out.println("Day 7 is: " + getDayType(7));
        System.out.println("Day 8 is: " + getDayType(8));
    }

    public static String getDayType(int day) {
        return switch (day) {
            case 1, 7 -> "Weekend"; // Multiple labels
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> {
                // Use yield to return a value from a block
                yield "Invalid day";
            }
        };
    }
}
