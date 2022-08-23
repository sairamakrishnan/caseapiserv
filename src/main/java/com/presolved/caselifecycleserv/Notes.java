package com.presolved.caselifecycleserv;

import java.util.*;

public class Notes {

    private String note;
    private Date added_date;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getAdded_date() {
        return added_date;
    }

    public void setAdded_date(Date added_date) {
        this.added_date = added_date;
    }

    public Notes() {

    }

    public Notes(String note, Date added_date) {
        this.note = note;
        this.added_date = added_date;
    }

}
