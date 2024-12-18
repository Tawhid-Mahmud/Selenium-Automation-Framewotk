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

Here's how your updated instructions can be formatted as a README.md file for GitHub:

markdown
Copy code
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
Open IntelliJ IDEA.
Go to File → New → Project from Existing Sources.
Select the pom.xml file in the cloned repository.
Choose Import as Maven Project.
IntelliJ will automatically download all dependencies.
Project Structure
Feature Files:
Store all feature files in the src/test/resources/features folder. These files describe test cases in simple English.

Step Definitions:
Step definitions are written in Java under src/test/java/steps. They map feature file steps to Java methods.

Test Runner:
The TestRunner class is in src/test/java/runner. It contains the configuration to execute the tests. Example:

java
Copy code
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TestRunner {
}
Dependencies
The pom.xml file contains all the necessary dependencies for this framework. Below are the key dependencies:

xml
Copy code
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.5.0</version>
    </dependency>

    <!-- WebDriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.4.0</version>
    </dependency>

    <!-- JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.12.0</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.12.0</version>
    </dependency>
How to Run the Tests
Using IntelliJ IDEA
Navigate to the TestRunner class in the Project Explorer.
Right-click on the class and select Run 'TestRunner.main()'.
Using Command Line
Open the terminal in IntelliJ or navigate to the project folder in your terminal.
Run:
bash
Copy code
mvn clean test
