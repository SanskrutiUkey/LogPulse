import engine.IssueClassifier;
import engine.TroubleshootingEngine;
import model.CaseReport;
import model.LogEntry;
import parser.LogParser;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LogParser parser = new LogParser();

        List<LogEntry> allLogs = new ArrayList<>();

        String[] files = {
                "logs/npe_log.txt",
                "logs/timeout_log.txt",
                "logs/db_failure.txt",
                "logs/memory_error.txt",
                "logs/auth_failure.txt"
        };

        for (String file : files) {
            allLogs.addAll(parser.parseLogs(file));
        }

        IssueClassifier classifier = new IssueClassifier();

        System.out.println("\n========= LOG ANALYSIS SYSTEM =========\n");

        for (LogEntry log : allLogs) {

            System.out.println(log);

            CaseReport report =
                    classifier.generateReport(log.getIssueType());

            System.out.println(report);
        }

        TroubleshootingEngine engine =
                new TroubleshootingEngine();

        engine.generateIssueSummary(allLogs);
    }
}