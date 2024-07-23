import com.codefinity.Main;
import com.codefinity.task.PageVisitCounterImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class PageVisitCounterTest {
    private PageVisitCounterImpl counter;

    @Before
    public void setUp() {
        counter = new PageVisitCounterImpl();
    }

    @Test
    public void testIncrementVisit_singleThread() {
        counter.incrementVisit("http://example.com/page1");
        counter.incrementVisit("http://example.com/page1");
        assertEquals(2, counter.getVisitCount("http://example.com/page1"));
    }

    @Test
    public void testIncrementVisit_multiplePages() {
        counter.incrementVisit("http://example.com/page1");
        counter.incrementVisit("http://example.com/page2");
        assertEquals(1, counter.getVisitCount("http://example.com/page1"));
        assertEquals(1, counter.getVisitCount("http://example.com/page2"));
    }

    @Test
    public void testGetVisitCount_noVisits() {
        assertEquals(0, counter.getVisitCount("http://example.com/page1"));
    }

    @Test
    public void testConcurrentIncrementVisit() throws InterruptedException {
        Thread[] threads = new Thread[10];
        Main.startAllThread(threads, counter);
        Main.waitThread(threads);

        // Check the visit counts after all threads have finished
        for (int i = 0; i < 10; i++) {
            String pageUrl = "http://example.com/page" + i;
            assertEquals(100, counter.getVisitCount(pageUrl));
        }
    }
}
