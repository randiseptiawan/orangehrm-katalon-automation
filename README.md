# OrangeHRM Automation Testing with Katalon Studio

## Project Overview

This project contains automated test scripts developed using Katalon Studio for the OrangeHRM web application. The automation focuses on validating core functionalities such as authentication and employee management through positive and negative test scenarios.

## Objectives

- Validate critical business functionalities of OrangeHRM.
- Reduce manual regression testing effort.
- Ensure application stability after system changes.
- Demonstrate QA Automation skills using Katalon Studio.

## Application Under Test

- Application: OrangeHRM
- URL: https://opensource-demo.orangehrmlive.com
- Automation Tool: Katalon Studio
- Language: Groovy

## Test Coverage

### Test Scenario Login

| Test Case | Test Design Technique | Status | Execution Strategy |
|-------------|---------|---------|------------|
| Login Success | Positive Testing | Automated | Independent |
| Login Failed | Negative Testing | Automated | Independent |
| Login without Username and Password | Validation Testing | Automated | Independent |
| Login without Username | Validation Testing | Automated | Independent |
| Login without Password | Validation Testing | Automated | Independent |
| Logout | Positive Testing | Automated | Independent |

### Test Scenario Employee CRUD

| Test Case | Test Design Technique | Status | Execution Strategy |
|-------------|---------|---------|------------|
| Create Employee | Positive Testing | Automated | Suite-Based (TS_Employee_CRUD) |
| Search Employee | Positive Testing | Automated | Suite-Based (TS_Employee_CRUD) |
| Update Employee | Positive Testing | Automated | Suite-Based (TS_Employee_CRUD) |
| Delete Employee | Positive Testing | Automated | Suite-Based (TS_Employee_CRUD) |
| Create Employee without First Name | Validation Testing | Automated | Independent |
| Search Employee Invalid ID | Negative Testing | Automated | Independent |
| Search Employee Exceed ID Length | Boundary Value Testing | Automated | Independent |
| Delete Employee Cancel Confirmation | Workflow Testing | Automated | Independent |

### Test Suites
| Test Suite | Description |
|------------|-------------|
| TS_Employee_CRUD | Validates the complete employee lifecycle, including employee creation, search, update, and deletion functionalities. |

## Tech Stack

| Technology         | Purpose                   |
| ------------------ | ------------------------- |
| Katalon Studio     | Test Automation           |
| Groovy             | Scripting Language        |
| Selenium WebDriver | Browser Automation Engine |
| Git                | Version Control           |
| GitHub             | Source Code Repository    |

## How to Run

1. Clone repository

```bash
git clone https://github.com/randiseptiawan/orangehrm-katalon-automation.git
```

2. Open Katalon Studio

3. Import Existing Project

4. Open desired Test Case or Test Suite

5. Click Run

## Future Enhancements

- Data-Driven Testing
- API Automation Testing
- Jenkins CI/CD Integration
- Automated Reporting
- Cross Browser Testing

## Author

Randi Septiawan

QA Automation Engineer Portfolio Project
