# AWS Java Logging

Sample java project used in the ISAAC Developer Blog posts.

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

> java -jar ./aws-java-logging.jar --spring.profiles.active=prod
