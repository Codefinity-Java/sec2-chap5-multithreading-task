<h1>Multithreaded Site Visit Accounting System</h1>

  <h2>Task Overview</h2>
    <p>This project involves creating a program to keep track of the number of visits to different pages on a website. The program is designed to function correctly in a multithreaded environment, where multiple threads may simultaneously increment visit counters for different pages.</p>

  <h2>Description</h2>
    <p>The main objective is to implement a system that accurately counts page visits in a concurrent environment.</p>

  <h3>Requirements</h3>
  <ul>
      <li>Use <code>ConcurrentHashMap</code> to store data about page visits.</li>
      <li>Implement a method to increment the visit counter for a given page: <code>incrementVisit()</code>.</li>
      <li>Implement a method to return the current visit count for a given page: <code>getVisitCount()</code>.</li>
      <li>Create multiple threads to increment visit counts simultaneously. This is set up in the <code>Main</code> class; you need to understand what's going on there.</li>
  </ul>

  <h3>Hints</h3>
  <ul>
      <li>Use <code>ConcurrentHashMap</code> for storing the data, where the key is the URL of the page and the value is the visit count.</li>
      <li>Utilize the <code>compute</code> or <code>merge</code> methods to atomically update the counters in <code>ConcurrentHashMap</code>.</li>
  </ul>

  <p class="important">IMPORTANT: Do not change anything except the <code>incrementVisit()</code> and <code>getVisitCount()</code> methods.</p>

