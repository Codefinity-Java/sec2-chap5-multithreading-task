package com.codefinity;

import com.codefinity.task.PageVisitCounter;
import com.codefinity.task.PageVisitCounterImpl;

public class Main {
    public static void main(String[] args) {
        PageVisitCounter counter = new PageVisitCounterImpl();

        // Create and start multiple threads to simulate page visits
        Thread[] threads = new Thread[10];
        startAllThread(threads, counter);

        // Wait for all threads to finish
        waitThread(threads);

        // Print the result of page visit counts
        printResult(counter);
    }

    //start multiple threads to simulate page visits
    public static void startAllThread(Thread[] threads, PageVisitCounter counter) {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                // Each thread simulates 100 page visits
                for (int j = 0; j < 100; j++) {
                    String pageUrl = "http://example.com/page" + (j % 10);
                    counter.incrementVisit(pageUrl);
                }
            });
            threads[i].start();
        }
    }

    // Method to wait for all threads to complete execution
    public static void waitThread(Thread[] threads) {
        for (Thread thread : threads) {
            try {
                thread.join(); // Waits for the thread to die
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the exception
            }
        }
    }

    // Method to print the result of page visit counts
    public static void printResult(PageVisitCounter counter) {
        for (int i = 0; i < 10; i++) {
            String pageUrl = "http://example.com/page" + i;
            System.out.println(pageUrl + " visited " + counter.getVisitCount(pageUrl) + " times.");
        }
    }
}