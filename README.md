# LogPulse - Java Log Analysis & Support Case Simulation System

## Overview

LogPulse is a Java-based log analysis and support case simulation tool designed to mimic real-world Technical Support Engineer (TSE) workflows. The application parses application log files, detects production issues, classifies incidents by severity and priority, and generates troubleshooting reports with customer-friendly explanations.

This project demonstrates Java debugging, root-cause analysis, incident triaging, and support-oriented problem solving using Core Java concepts.

---

## Features

- Parse application log files using File I/O
- Detect common production issues:
    - NullPointerException
    - TimeoutException
    - Database connection failures
    - OutOfMemoryError
    - Authentication failures
- Generate support case reports containing:
    - Severity
    - Priority (Sev1/Sev2/Sev3)
    - Probable root cause
    - Troubleshooting steps
    - Customer-friendly explanation
    - Escalation recommendations
    - Knowledge-base/workaround notes
- Count and summarize issue frequency
- Simulate enterprise incident triage workflows

---

## Tech Stack

- Java 17
- Core Java
- OOP
- Collections & HashMap
- File I/O
- Exception Handling
- Enums

---

## Project Structure

```txt
src/
 ├── Main.java
 │
 ├── model/
 │   ├── LogEntry.java
 │   ├── CaseReport.java
 │   └── IssueType.java
 │
 ├── parser/
 │   └── LogParser.java
 │
 ├── engine/
 │   ├── IssueClassifier.java
 │   └── TroubleshootingEngine.java
 │
 └── logs/
     ├── npe_log.txt
     ├── timeout_log.txt
     ├── db_failure.txt
     ├── memory_error.txt
     └── auth_failure.txt