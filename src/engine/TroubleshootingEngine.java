package engine;

import model.LogEntry;
import model.IssueType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TroubleshootingEngine {

    public void generateIssueSummary(List<LogEntry> logs) {

        Map<IssueType, Integer> issueCount = new HashMap<>();

        for (LogEntry log : logs) {

            IssueType type = log.getIssueType();

            issueCount.put(
                    type,
                    issueCount.getOrDefault(type, 0) + 1
            );
        }

        System.out.println("\n========= ISSUE SUMMARY =========\n");

        for (Map.Entry<IssueType, Integer> entry : issueCount.entrySet()) {

            System.out.println(
                    entry.getKey() +
                            " : " +
                            entry.getValue()
            );
        }
    }
}