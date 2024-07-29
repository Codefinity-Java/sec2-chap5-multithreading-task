<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>
    <h1>BlockingQueue Implementation Task</h1>
    <p>Welcome to the BlockingQueue Implementation Task! This exercise will help you understand how <code>BlockingQueue</code> works and deepen your understanding of Java concurrency.</p>

  <h2>Task Overview</h2>
    <p>You will need to implement some methods in the <code>BlockingQueueImpl</code> class. This implementation will allow you to practice and solidify your knowledge of blocking queues.</p>

  <h3 class="important">IMPORTANT</h3>
    <ul class="important">
        <li><strong>Queue and limit fields do not need to be changed!</strong></li>
        <li>Focus on implementing only the two methods: <code>put()</code> and <code>take()</code>.</li>
        <li>Do not modify any other parts of the <code>BlockingQueueImpl</code> class.</li>
    </ul>

  <h2>Implementation Details</h2>

  <h3>Methods to Implement</h3>
    <div class="code-block">
        <p><strong>1. <code>put()</code></strong></p>
        <ul>
            <li>This method adds items to the queue.</li>
            <li><span class="important">If the queue limit is exceeded, the method should pause until space becomes available.</span></li>
            <li><span class="important">If the queue was previously full and is now not, it should notify all waiting threads.</span></li>
        </ul>

  <p><strong>2. <code>take()</code></strong></p>
        <ul>
            <li>This method removes and returns an item from the queue.</li>
            <li><span class="important">If the queue is empty, the method should pause until an item is available.</span></li>
            <li><span class="important">If the queue was previously empty and is now not, it should notify all waiting threads.</span></li>
        </ul>
    </div>

  <h3>Testing Your Implementation</h3>
    <p>In the <code>Main</code> class, you will test your <code>BlockingQueueImpl</code>:</p>
    <ul>
        <li><span class="important">Attempt to add more items than the queue's limit.</span></li>
        <li>The queue should wait before adding the next item if it is full.</li>
        <li>The next item should only be added once the queue has space available.</li>
    </ul>

  <h2>How to Approach the Task</h2>
    <ol>
        <li><strong>Understanding <code>BlockingQueueImpl</code>:</strong> Start by reviewing the <code>BlockingQueueImpl</code> class to understand its structure and what is already provided.</li>
        <li><strong>Implement <code>put()</code> and <code>take()</code>:</strong> Focus on these two methods, ensuring they handle thread pausing and resuming correctly using Java concurrency mechanisms.</li>
        <li><strong>Test Your Implementation:</strong> Use the <code>Main</code> class to test that your <code>BlockingQueueImpl</code> behaves as expected under different conditions.</li>
    </ol>

  <h2>Important Reminders</h2>
    <ul>
        <li><span class="important">Do not change anything in <code>BlockingQueueImpl</code> except for the methods <code>put()</code> and <code>take()</code>.</span></li>
        <li><span class="important">Ensure your implementation handles concurrency properly to avoid deadlocks and race conditions.</span></li>
        <li>Use synchronization techniques to manage thread access to the queue.</li>
    </ul>
</body>
</html>
