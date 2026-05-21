package engine;

import model.CaseReport;
import model.IssueType;

public class IssueClassifier {

    public CaseReport generateReport(IssueType issueType) {

        switch (issueType) {

            case NULL_POINTER:
                return new CaseReport(
                        issueType,
                        "HIGH",
                        "Sev2",
                        "Engineering Team",
                        "Application tried to access a null object reference.",
                        "Check object initialization before usage.",
                        "The application encountered an unexpected internal error.",
                        "Known issue caused by missing object initialization. Restart may temporarily recover the service."
                );

            case TIMEOUT:
                return new CaseReport(
                        issueType,
                        "MEDIUM",
                        "Sev3",
                        "Infrastructure Team",
                        "Request processing exceeded allowed response time.",
                        "Check server response times and network latency.",
                        "The system took too long to respond to the request.",
                        "Timeouts commonly occur during peak traffic or slow network response."
                );

            case DATABASE_FAILURE:
                return new CaseReport(
                        issueType,
                        "CRITICAL",
                        "Sev1",
                        "DBA Team",
                        "Application could not connect to the database.",
                        "Verify database server status and credentials.",
                        "The application is temporarily unable to access required data services.",
                        "Database connectivity issues may occur during DB maintenance or credential failures."
                );

            case MEMORY_ERROR:
                return new CaseReport(
                        issueType,
                        "CRITICAL",
                        "Sev1",
                        "Engineering Team",
                        "Java heap memory exhausted.",
                        "Increase JVM heap size or optimize memory usage.",
                        "The application ran out of available memory resources.",
                        "Memory exhaustion can occur due to large object allocation or memory leaks."
                );

            case AUTH_FAILURE:
                return new CaseReport(
                        issueType,
                        "LOW",
                        "Sev3",
                        "Security Team",
                        "Invalid authentication credentials detected.",
                        "Verify username and password inputs.",
                        "The login attempt failed due to invalid credentials.",
                        "Authentication failures are commonly caused by incorrect credentials or expired sessions."
                );

            default:
                return new CaseReport(
                        issueType,
                        "UNKNOWN",
                        "Sev3",
                        "Support Team",
                        "Unknown issue detected.",
                        "Further investigation required.",
                        "An unidentified issue occurred in the application.",
                        "No knowledge base article available for this issue."
                );
        }
    }
}