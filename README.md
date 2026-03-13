StockFlow BDD Cucumber Automation Framework
Project Overview
This project is a UI test automation framework developed to test the StockFlow web application.
The framework is built using Java, Selenium WebDriver, Cucumber (BDD), and JUnit, and follows the Page Object Model (POM) design pattern to maintain clean, scalable, and reusable test code.
The purpose of this framework is to automate important business workflows such as login, product management, shipments,supplies,warehouses,purchase orders,reports and audit, and inventory validation.
Cucumber is used to write test scenarios in Gherkin language, allowing both technical and non-technical team members to easily understand the test cases.

Technologies Used
Java:wq
Selenium WebDriver
Cucumber (BDD)
JUnit
Maven
Page Object Model (POM)

Framework Design
Page Object Model (POM)
Each web page of the application is represented by a separate class inside the pages package.
This helps keep element locators and page actions organized and reusable.
Feature Files
Feature files are written using Gherkin syntax and describe the test scenarios in a readable format:
Given
When
Then
These files are located in:
src/test/resources/features
Step Definitions
Step definition classes connect the Gherkin steps from feature files with Selenium automation code.
Location:
src/test/java/steps
Test Runners
Runner classes execute Cucumber scenarios using JUnit.
Location:
src/test/java/runners
Utilities
Utility classes provide reusable functionality such as:
WebDriver initialization
Base test setup
Reading configuration properties
Location:
src/test/java/utils

Modules Covered
The automation framework currently covers the following modules:
User Login
Products Management
Shipments
Inventory
Warehouses
Supplies
Reports and Audit
Purchase orders

Configuration
Project configurations such as environment settings and browser setup are stored in:
src/test/resources/configurations.properties


How to Run Tests
Clone the repository
Open the project in IntelliJ IDEA
Install Maven dependencies
Run tests from one of the runner classes:
CucumberRunner.java       or
CucumberRegressionRunner.java


Benefits of the Framework
BDD style readable test scenarios
Scalable and maintainable test structure
Reusable page objects
Supports regression testing
Easy integration with CI/CD pipelines


