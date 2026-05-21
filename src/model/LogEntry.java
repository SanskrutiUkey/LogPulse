package model;

public class LogEntry {

    private String timestamp;
    private String rawLog;
    private IssueType issueType;

    public LogEntry(String timestamp, String rawLog, IssueType issueType) {
        this.timestamp = timestamp;
        this.rawLog = rawLog;
        this.issueType = issueType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getRawLog() {
        return rawLog;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    @Override
    public String toString() {
        return "Timestamp: " + timestamp +
                "\nIssue Type: " + issueType +
                "\nLog: " + rawLog;
    }
}