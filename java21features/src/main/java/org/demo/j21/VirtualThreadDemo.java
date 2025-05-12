package org.demo.j21;

/**
 * Virtual Threads (Preview)
 * Virtual threads simplify concurrency by providing lightweight threads.
 * 
 * Use Case:
 * Ideal for applications requiring high concurrency, such as web servers or data processing pipelines.
 * 
 * How to Use:
 * Use `Thread.startVirtualThread` to create and start a virtual thread.
 */
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // Start a virtual thread
        Thread.startVirtualThread(() -> System.out.println("Running in a virtual thread!"));

        // Allow time for the virtual thread to complete
        Thread.sleep(100);
    }
