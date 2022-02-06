package com.jip.mail.models;

import com.jip.mail.models.User;
import java.util.Date;

class Mail {
    private User from;
    private User to;
    private Date date;
    private String subject;
    private String payload;

    Mail(User from, User to, Date date, String subject, String payload) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.subject = subject;
        this.payload = payload;
    }

    public User getFrom() {
        return this.from;
    }

    public User getTo() {
        return this.to;
    }

    public Date getDate() {
        return date;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getPayload() {
        return this.payload;
    }
}
