/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author hmuhire
 */
import java.util.Date;

public class Message {
    private String subject;
    private String contents;
    private Date sentDate;

    public Message(String s, String c, Date d) {
        subject = s;
        contents = c;
        sentDate = d;
    }

    public String displayMessage() {
        StringBuilder b = new StringBuilder();
        b.append("Subject: "); b.append(subject); b.append('\n');
        b.append(sentDate); b.append('\n');
        b.append(contents); b.append('\n');
        return b.toString();
    }
}
