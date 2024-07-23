package com.codefinity.task;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PageVisitCounterImpl implements PageVisitCounter{
    private final ConcurrentMap<String, Integer> visitCounts = new ConcurrentHashMap<>();

    // Method to increment the visit count
    public void incrementVisit(String pageUrl) {
        //TODO: increment visit
    }

    // Method to get the current visit count
    public int getVisitCount(String pageUrl) {
        //TODO: get increment
        return 0;
    }

}
