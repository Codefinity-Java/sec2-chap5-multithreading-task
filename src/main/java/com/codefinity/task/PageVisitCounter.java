package com.codefinity.task;

public interface PageVisitCounter {

   void incrementVisit(String pageUrl);

   int getVisitCount(String pageUrl);

}
