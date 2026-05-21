package model;

public class CaseReport {

    private IssueType issueType;
    private String severity;
    private String priority;
    private String escalationTeam;
    private String probableCause;
    private String troubleshootingStep;
    private String customerMessage;
    private String knowledgeBaseNote;

    public CaseReport(
            IssueType issueType,
            String severity,
            String priority,
            String escalationTeam,
            String probableCause,
            String troubleshootingStep,
            String customerMessage,
            String knowledgeBaseNote
    ) {
        this.issueType = issueType;
        this.severity = severity;
        this.priority = priority;
        this.escalationTeam = escalationTeam;
        this.probableCause = probableCause;
        this.troubleshootingStep = troubleshootingStep;
        this.customerMessage = customerMessage;
        this.knowledgeBaseNote = knowledgeBaseNote;
    }
    @Override
    public String toString() {

        return "\n===================================" +
                "\n SUPPORT CASE REPORT" +
                "\n===================================" +
                "\nIssue Type: " + issueType +
                "\nSeverity: " + severity +
                "\nPriority: " + priority +
                "\nEscalation Team: " + escalationTeam +
                "\nProbable Cause: " + probableCause +
                "\nTroubleshooting Step: " + troubleshootingStep +
                "\nCustomer-Friendly Explanation: " + customerMessage +
                "\nKnowledge Base Note: " + knowledgeBaseNote +
                "\n===================================\n";
    }
}