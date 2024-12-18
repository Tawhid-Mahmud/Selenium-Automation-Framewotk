# Selenium Automation Test Framework

This repository contains a Selenium Automation Test Framework for web automation using Maven and IntelliJ IDEA. It follows the Behavior-Driven Development (BDD) framework with feature files, step definitions, and a TestRunner class.

## Prerequisites

Before you begin, ensure you have the following installed:

1. **Java Development Kit (JDK 11 or higher)**
   - Verify installation:
     ```bash
     java -version
     ```
   - Set up `JAVA_HOME`:
     ```bash
     JAVA_HOME="Path\to\Java\jdk11"
     ```

2. **Apache Maven**
   - Verify installation:
     ```bash
     mvn -version
     ```

3. **IntelliJ IDEA (Community or Ultimate Edition)**

---

## Project Setup in IntelliJ IDEA

### Import the Project
1. Clone the repository:
   ```bash
   git clone <repository-url>
## Project Structure
Feature Files:
Store all feature files in the src/test/resources/features folder. These files describe test cases in simple English.

Step Definitions:
Step definitions are written in Java under src/test/java/steps. They map feature file steps to Java methods.

Test Runner:
The TestRunner class is in src/test/java/runner. It contains the configuration to execute the tests. 

## How to Run the Tests
Using IntelliJ IDEA
Navigate to the TestRunner class in the Project Explorer.
Right-click on the class and select Run 'TestRunner.main()'.
Using Command Line
Open the terminal in IntelliJ or navigate to the project folder in your terminal.
Run:
"mvn clean test"
