# geb-groovy-automation
Automation testing using Geb

What is Geb?

Geb is a developer focused tool for automating the interaction between web browsers and web content. 
It uses the dynamic language features of Groovy to provide a powerful content definition DSL (for modelling content for reuse) 
and key concepts from jQuery to provide a powerful content inspection and traversal API (for finding and interacting with content).

Install groovy plugin into your eclipse: Groovy/Grails Tool Suite (GTSS) for Eclipse

Refer Book of Geb : http://www.gebish.org/manual/current/

Pom configurations: https://blog.jdriven.com/2015/04/geb-gems-running-geb-spock-tests-maven/

To configure Geb into spring boot application: 

1) Add following dependencies in your pom:


2) Configure the GMaven plugin in your pom to compile all the groovy files.

3) Configure the maven surefire plugin to pick the *Spec files as our test cases

4) In eclipse, configure the maven project as groovy project as well

