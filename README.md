Staff Software Eng - Test & Performance
-----------------------


We anticipate that this problem will take you about 1 hour. We know that this is a significant time committment before a technical phone interview, but we want to talk about this experience as part of the call.

__Goal__: Prove yourself by fixing the provided average line length program (avgll)

__Usage__: 

To invoke the program on a file, use the -f option followed by a filename.

    $ avgll -f <filename>
    50.0

The output is a decimal number that represents the average line length of the file, which means the number of unicode characters on all the lines divided by the total number of lines.

__Code available here__: 
    
git clone from

    https://github.com/CheggEng/avg-line-length-java
    
There is a provided gradle build file that we encourage you to use. Gradle can be downloaded from http://gradle.org

To set up in Eclipse, try
    
    gradle eclipse

and then choose Import Existing Projects into Workspace... from the File menu in Eclipse.

Other useful commands will be:
    
    gradle build (runs build)
    gradle test  (runs unit tests)

__Step 1__:

You will notice upon running the program for the first time that it doesn't work at all. :(

Get it running and fix the obvious mistakes you see. 

Save your solution as com.chegg.hw.step1.AvgLineLength

__Step 2__:

There are actually a lot of different cases that you need to test to get the calculation right. We want to see how you think about figuring out all the cases. 

Put all your test data in src/test/resources and all of your test code (as JUnit) in src/test/java. We've provided a few examples to try.

As you find test inputs that fail, patch the code to handle them.

Save your solution as com.chegg.hw.step2.AvgLineLength

__Step 3__:

Your code probably now works, but it's a mess. Oh, well, it was already a mess before you started :P 

In this step, you own the code. 

Refactor the code and make it testable and readable -- the way you want it to be. Make sure it still passes all the cases you have identified in Step 2. 

Save your solution as com.chegg.hw.step3.AvgLineLength

