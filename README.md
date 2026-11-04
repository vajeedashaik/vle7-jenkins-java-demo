# VLE-7 Jenkins Java Demo

A small Java 21 Maven application used to demonstrate Jenkins CI automation.

## Prerequisites

- JDK 21
- Apache Maven 3.8+

## Run locally

```bash
mvn clean test package
java -jar target/jenkins-java-demo-1.0.0.jar
```

## Jenkins pipeline

The root-level `Jenkinsfile` checks out the repository, compiles the application, runs JUnit tests, packages the JAR, publishes test results, and archives the artifact.

The Jenkins controller must have a JDK tool named `Java21` configured, and Maven must be installed and available on the agent's PATH.
