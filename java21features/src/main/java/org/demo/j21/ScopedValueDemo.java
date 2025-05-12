package org.demo.j21;

import java.lang.ScopedValue;

/**
 * Scoped Values (Preview)
 * Scoped values provide a way to share immutable data across threads.
 * 
 * Use Case:
 * Useful for thread-local data that needs to be shared across multiple threads.
 * 
 * How to Use:
 * Use `ScopedValue.newInstance` to create a scoped value and `ScopedValue.where` to set its value.
 */
public class ScopedValueDemo {
    private static final ScopedValue<String> USERNAME = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USERNAME, "Alice").run(() -> {
            System.out.println("Current user: " + USERNAME.get());
        });
    }
}