package org.demo.j21;

/**
 * Virtual Threads (Preview)
Virtual threads simplify concurrency by providing lightweight threads.
 */
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.startVirtualThread(() -> System.out.println("Running in a virtual thread!"));
        Thread.sleep(100); // Allow time for the virtual thread to complete
    }
}