# geb-groovy-automation
Automation testing using Geb

Steps to run the poc:
1. Start the application as a server.
2. run 'mvn test'


What is Geb?


Geb is a developer focused tool for automating the interaction between web browsers and web content. 
It uses the dynamic language features of Groovy to provide a powerful content definition DSL (for modelling content for reuse) 
and key concepts from jQuery to provide a powerful content inspection and traversal API (for finding and interacting with content).


What is a SPOC?


Spock is a testing and specification framework for Java and Groovy applications. 
What makes it stand out from the crowd is its beautiful and highly expressive specification language. 
Thanks to its JUnit runner, Spock is compatible with most IDEs, build tools, and continuous integration servers. 
Spock is inspired from JUnit, jMock, RSpec, Groovy, Scala, Vulcans, and other fascinating life forms. 


Geb vs Selenium:
Geb has a smaller learning curve and easy to understand groovy based automation than Selenium.

What is Groovy?
Groovy is an object-oriented programming language for the Java platform.
It is a dynamic language with features similar to those of Python, Ruby, Perl, and Smalltalk. 
It is aimed at improving developer productivity thanks to a concise, familiar and easy to learn syntax.
It integrates smoothly with any Java program, and immediately delivers to your application powerful features, including scripting capabilities,
Domain-Specific Language authoring, runtime and compile-time meta-programming and functional programming. 

Refer Book of Geb : http://www.gebish.org/manual/current/

Pom configurations: https://blog.jdriven.com/2015/04/geb-gems-running-geb-spock-tests-maven/

Steps to configure Geb with maven based application application in eclipse: 

1) Add following dependencies in your pom:
	Groovy, JUnit, Spock core, Geb-spock and Selenium IE driver.

2) Configure the GMaven plugin in your pom to compile all the groovy files.

3) Configure the maven surefire plugin to pick the *Spec.groovy as test files.

4) Install groovy plugin into your eclipse: Groovy/Grails Tool Suite (GTSS) 

5) In eclipse, configure the maven project as a groovy project. (remove groovy libraries from classpath if server is not starting. 
	Keep the DSL groovy libraries though).

6) Make sure that path of groovy files (/test/groovy) is correctly configured in Java build path, and in the Groovy Compiler settings.
The output folder for /test/groovy should be gebpoc/target/test-classe as in the screenshot (java build path.jpg)

7) The sceurity settings should be same on IE for all options in Tools -> Security.

8) Launch the test suite: mvn test


