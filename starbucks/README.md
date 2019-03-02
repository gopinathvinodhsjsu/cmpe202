# Starbucks Mobile App (Text UI) Project


## Grader Test Results

Grader results are posted in the following files:

* tests.html
* bugs.html
* codesmells.txt

## Running Local Tests

If you have Gradle 4.9 installed locally, you can run the following Makefile rules to get local results.  Please note that the JUnit tests will be only the ones locally available and not the full set of tests the Grader uses.

<pre>
test:
    gradle test

spotbugs:
    gradle spotbugsMain

codesmells:
    gradle smartsmells
</pre>

