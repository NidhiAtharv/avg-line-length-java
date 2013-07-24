Staff Software Engineer, QA Automation for Search & Personalization
-----------------------


We anticipate that this problem will take you about 1 hour. We know that this is a significant time committment before a technical phone interview, but we want to talk about your solution as part of the call.

__Goal__: Demonstrate your abilities as an engineer in test by fixing the provided average line length program (avgll)

__NOTE__: You will need access to a UNIX/Linux system to complete this exercise.

__Usage__: 

To find the average line length in characters, use the -c switch:

    $ java -jar build/libs/avg-line-length-java.jar -c <filename>
    50.0

The output is a decimal number that represents the average line length of the file in characters, which means the number of printable unicode characters on all the lines divided by the total number of lines.


To find the average line length in words, use the -w switch:

    $ java -jar build/libs/avg-line-length-java.jar -w <filename>
    10.0
    
The output is a decimal number that represents the average line length of the file in words, which means the number of unicode sequences (delimited by space characters) divided by the total number of lines.

Using the "-" character as a filename causes the program to read from stdin instead of a file.

__Code available here__: 
    
git clone from

    https://github.com/CheggEng/avg-line-length-java
    
There is a provided gradle build file that we encourage you to use. Gradle can be downloaded from http://gradle.org

To set up in Eclipse, try
    
    gradle eclipse

and then choose Import Existing Projects into Workspace... from the File menu in Eclipse.

Other useful commands will be:
    
    gradle jar   (builds jar file)
    gradle test  (runs unit tests)

__Step 1__:

Change directory into the project root folder on the cmd line shell.

Run:

    java -jar build/libs/avg-line-length-java.jar -w src/test/resources/test1.txt
    java -jar build/libs/avg-line-length-java.jar -c src/test/resources/test1.txt


__Step 2__:

You will notice that the program outputs the correct values for the test input test1.txt.

Unfortunately, very limited testing will reveal some problems.

There are actually a lot of different cases that you need to test to get the calculation right. We want to see how you think about figuring out all the cases. 
In addition, the existing code doesn't really have good structure or style, making it fragile.

Put all your test data in src/test/resources and all of your test code (as JUnit) in src/test/java. We've provided a few examples to try.

As you find test inputs that fail, patch the code to handle them. Remember, you "own" the code now, so you should refactor the code to make it testable and readable -- the way you want it to be. Include documentation where helpful.

Save your solution as com.chegg.hw.AvgLineLength

__Step 3__:

Now that your program produces (more) correct results, let's consider performance. What happens when we input a several gigabyte file? Describe the cases that you would like to explore and how you would find out where the bottlenecks are in the program. Also, are there any assumptions you made in step 2 (or we made in the original) that limit what kinds of input that can be used?

Perform at least a basic analysis of the actual program on some large test input 
(describe your methodology in a src/test/resources/speedtest.txt but do not include it in the final submission). 
Make some low-hanging improvements and describe how to make further improvements.

Save the speed-improved version as com.chegg.hw.AvgLineLengthFaster

Create a shell script in the root project folder called ``speedtest.sh`` and have it

1. synthesize large test data in /tmp
2. time both run modes using each AvgLineLength and AvgLineLengthFaster
3. fail if the output of the two differ

__Step 4__:

Submit your project. Run

    gradle clean submitArchive
    
There is now a file named lastname_firstname_avgll.tar.gz in the directory above the project directory. Please rename that with your own lastname and firstname and email it to the recruiter.

Happy Coding!
