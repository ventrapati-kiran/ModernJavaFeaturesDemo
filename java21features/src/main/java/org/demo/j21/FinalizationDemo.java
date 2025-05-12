package org.demo.j21;

import java.lang.ref.Cleaner;
/**
 * Java 21 deprecates finalization. Use try-with-resources or Cleaner instead.
 */
public class FinalizationDemo {
    private static final Cleaner cleaner = Cleaner.create();

    static class Resource implements AutoCloseable {
        private final Cleaner.Cleanable cleanable;

        Resource() {
            this.cleanable = cleaner.register(this, () -> System.out.println("Resource cleaned up!"));
        }

        @Override
        public void close() {
            cleanable.clean();
        }
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("Using resource...");
        }
    }
}