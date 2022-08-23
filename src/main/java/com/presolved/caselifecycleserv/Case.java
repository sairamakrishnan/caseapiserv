package com.presolved.caselifecycleserv;

public class Case {

    private String source;
    private String status;
    private String description;
    private Notes notes;

    public Case() {

    }

    public Case(String source, Transaction transaction_detail, Notes notes, ReasonCode reasoncode_details) {
        this.source = source;
        this.notes = notes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String disputeSource) {
        this.source = disputeSource;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

}
