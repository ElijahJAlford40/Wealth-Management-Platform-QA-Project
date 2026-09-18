
# Wealth Management Platform QA Project 01
### Using the Parabank Demo Application

---

## Project Overview

This project demonstrates my ability to perform manual and automated quality assurance testing for a financial services web application.

Using the Parabank Demo Application as the system under test, I designed and executed manual test cases, documented defects, and developed Selenium-based test automation as part of a structured Software Testing Life Cycle (STLC) approach.

The project focuses on applying QA processes, testing techniques, and automation tools to core customer-facing banking workflows.

---

## Project Goals

### What Skills Do I Want to Demonstrate?

- Execute and document manual test cases.
- Develop automated tests using Java and Selenium WebDriver.
- Identify, document, and track software defects.
- Demonstrate understanding of the SDLC and STLC.
- Apply object-oriented programming (OOP) principles.
- Use Git and GitHub for version control.
- Create and maintain test automation scripts.
- Communicate test results and testing observations.
- Develop foundational knowledge of CI/CD practices.

### What QA Deliverables Am I Creating?

- Test case documentation.
- Manual test execution results.
- Bug reports and defect documentation.
- Selenium automation framework.
- Automated test cases.
- Test reporting and execution summaries.
- Regression testing coverage.

---

## Application Tested

**Application:** Parabank Demo Application

**Industry:** Financial Services / Online Banking

**Application Type:** Web Application

**System Under Test :** Parabank

---

## Test Scope

The following application features and business workflows are included in the testing scope.

Manual testing was performed across core customer-facing workflows, including account management, authentication, transfers, payments, loan requests, and navigation. Selected workflows are also being used to develop Selenium-based test automation.

### 1. Accounts

- Open New Account functionality.
- Accounts Overview and account information display.
- Account navigation and access to account services.

### 2. Authentication

- Valid user login.
- Invalid password testing and authentication security validation.
- Logout functionality and session-related behavior.

### 3. Profile

- Update Contact Info functionality.
- Validation of profile information updates.
- Verification of updated user information.

### 4. Transfers

- Transfer Funds workflow.
- Transfer form input and validation.
- Verification of transfer results.

### 5. Security

- Invalid password authentication testing.
- Validation of unauthorized access behavior.
- Session and logout behavior.

### 6. Navigation

- Navigation between core application pages.
- Verification of navigation links and page accessibility.
- Access to account services and application workflows.

### 7. Payments

- Bill Pay workflow.
- Payment form input and required field validation.
- Verification of payment submission behavior.

### 8. Transaction History

- Find Transactions functionality.
- Transaction search and filtering behavior.
- Verification of displayed transaction information.

### 9. Loans

- Request Loan workflow.
- Loan application form input and validation.
- Verification of loan request submission behavior.

---

## Out of Scope

The following areas are outside the scope of this project:

- Performance and load testing.
- Full backend security penetration testing.
- Production financial transactions and real banking integrations.
- Features and integrations not supported by the Parabank demo application.

---

## Test Strategy

### Testing Approach

The project uses a combination of manual and automated testing techniques to evaluate the functionality and reliability of the Parabank Demo Application.

### Manual Testing

- Functional Testing
- Negative Testing
- UI Testing
- Exploratory Testing
- Business Workflow Testing

### Automation Testing

- Smoke Testing
- Regression Testing
- End-to-End Testing

Additional testing types, including integration testing, may be incorporated as the project expands.

### Test Design Approach

Test cases are designed using:

- Positive test scenarios.
- Negative test scenarios.
- Boundary Value Analysis.
- Equivalence Partitioning.
- Business Workflow Testing.
- Data Validation.

---

## Test Environment

| Component | Environment |
|---|---|
| Operating System | Windows |
| Browser | Google Chrome |
| IDE | IntelliJ IDEA |
| Programming Language | Java |
| Automation Framework | Selenium WebDriver |
| Test Framework | TestNG |
| Build Tool | Maven |
| API Tool | Postman |
| Database | SQL |
| Defect Tracking | Jira |
| Version Control | Git / GitHub |

---

## Tools & Technologies

### Programming

- Java

### Test Automation

- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

### API Testing

- Postman

### Database Testing

- SQL

### Defect Management

- Jira

### Development & Version Control

- IntelliJ IDEA
- Git
- GitHub

---

## Manual Testing

Manual testing was performed across core customer-facing workflows within the Parabank Demo Application.

### Manual Test Coverage

- Open New Account
- Accounts Overview
- Authentication / Login
- Transfer Funds
- Bill Pay
- Find Transactions
- Update Contact Info
- Request Loan
- Log Out
- Navigation / Links

### Manual Testing Activities

- Designed and executed manual test cases.
- Performed positive and negative testing.
- Validated application functionality and user workflows.
- Documented actual and expected results.
- Identified and documented defects.
- Reviewed authentication-related behavior.

---

## Defect Management

Defects identified during testing are documented using a structured bug report format.

### Bug Report Information

- Bug ID
- Title
- Steps to Reproduce
- Expected Result
- Actual Result
- Module
- Reported By
- Assigned To
- Priority
- Severity
- Date Reported
- Bug Type
- Notes

### Identified Defects

**Bug-001: Invalid Password Allows Unauthorized Login**

- **Module:** Customer Login
- **Type:** Security
- **Priority:** P1 - Critical
- **Severity:** S1 - Critical

**Description:**

During negative authentication testing, an invalid password was observed to allow access to the account overview.

The defect was documented for further investigation and retesting.

> Note: Defect status and final validation should be updated based on the latest retest results.

---

## Test Case Documentation

Manual test cases are organized in a structured test case tracker.

### Test Case Tracker Fields

- Test Case ID
- Test Objective
- Preconditions
- Test Steps
- Test Data
- Expected Result
- Actual Result
- Status

Test cases are designed to support functional validation, negative testing, and business workflow coverage.

---

## Test Execution Summary

- Total Test Cases: 23
- Manual Testing: Completed
- Test Case Documentation: Completed
- Defect Documentation: Completed
- Selenium Automation: In Progress

> Note: Final pass/fail counts and execution percentages will be updated after confirming the latest test execution results and defect retest status.

---

## Test Automation

Selenium automation is being developed using Java, TestNG, Maven, and the Page Object Model (POM).

### Automation Framework

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- IntelliJ IDEA

### Automation Development

- Configure Selenium WebDriver.
- Establish reusable test setup and teardown.
- Develop page object classes.
- Create automated test methods.
- Validate application navigation and workflows.
- Expand automation coverage across core customer journeys.

### Automated / In Progress

- Application launch and smoke validation.
- User login.
- Accounts Overview navigation.

### Planned Automation

- Open New Account.
- Transfer Funds.
- Bill Pay.
- Logout.

> Note: Automation coverage will be updated as test workflows are implemented and executed successfully.

---

## API Testing

API testing is planned using Postman to evaluate application endpoints and response behavior.

### Planned API Testing Activities

- Send API requests.
- Validate response status codes.
- Verify response data.
- Perform negative testing.
- Document API testing results.

---

## Database Testing

SQL validation is planned to support backend data verification and testing activities.

### Planned Database Testing Activities

- Execute SQL queries.
- Validate stored data.
- Verify data consistency.
- Support application data validation.

---

## Regression Testing

Regression testing will be incorporated to verify that application changes do not negatively affect existing functionality.

### Regression Testing Activities

- Re-execute previously passed test cases.
- Validate affected application workflows.
- Verify defect fixes.
- Update test execution results.

---

## Future Improvements

- Expand Selenium automation coverage.
- Add API testing using Postman.
- Implement SQL validation.
- Improve test reporting.
- Integrate automation with CI/CD pipelines.
- Expand regression testing coverage.
- Add additional negative and edge-case scenarios.

---

## Lessons Learned

- Applied manual testing techniques to a financial services web application.
- Developed experience designing and executing structured test cases.
- Practiced identifying and documenting software defects.
- Improved understanding of the Software Testing Life Cycle (STLC).
- Developed Selenium automation using Java and the Page Object Model.
- Gained experience organizing QA documentation and testing workflows.

---

## Project Status

**Current Status:** Manual testing completed; Selenium automation in progress.

This project will continue to evolve as additional automation, API testing, database validation, and QA reporting activities are implemented.
