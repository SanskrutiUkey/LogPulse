package parser;

import model.IssueType;
import model.LogEntry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogParser {

    public List<LogEntry> parseLogs(String filePath) {

        List<LogEntry> logs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                String timestamp = line.substring(0, 19);

                IssueType issueType = classifyIssue(line);

                logs.add(new LogEntry(timestamp, line, issueType));
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return logs;
    }

    private IssueType classifyIssue(String logLine) {

        if (logLine.contains("NullPointerException")) {
            return IssueType.NULL_POINTER;
        }

        if (logLine.contains("TimeoutException")) {
            return IssueType.TIMEOUT;
        }

        if (logLine.contains("DatabaseConnectionException")) {
            return IssueType.DATABASE_FAILURE;
        }

        if (logLine.contains("OutOfMemoryError")) {
            return IssueType.MEMORY_ERROR;
        }

        if (logLine.contains("AuthenticationFailedException")) {
            return IssueType.AUTH_FAILURE;
        }

        return IssueType.UNKNOWN;
    }
}
