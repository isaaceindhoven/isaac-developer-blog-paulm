# AWS Elastic Beanstalk App

Sample java project used in the ISAAC Developer Blog posts. The application consists of two 
runnable jars:
- Star Trek API (startrek-api.jar)
- Star Wars API (starwars-api.jar)

## Requirements

To compile and run this application you will need:

- JDK 1.8+

## Building the application

Launch the Maven build on the checked out sources of this application:

> mvn package

### Run application

When you're done iterating in developer mode, you can run the application as a
conventional jar file.

First compile it:

> mvn package

Then run it:

Star Trek API:
> java -jar ./startrek-api/target/startrek-api.jar

Star Wars API:
> java -jar ./starwars-api/target/starwars-api.jar
