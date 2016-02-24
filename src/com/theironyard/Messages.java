package com.theironyard;

/**
 * Created by ericweidman on 2/24/16.
 */
public class Messages {
    int id;
    int replyId;
    String author;
    String text;

    public Messages(int id, int replyId, String author, String text) {
        this.id = id;
        this.replyId = replyId;
        this.author = author;
        this.text = text;
    }
}