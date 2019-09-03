package com.example.recycle_card_view_8;

public class Email {
    private String sender,title,message;
    private int pic,time;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public Email(String sender, String title,String message, int time, int pic) {
        this.sender = sender;
        this.title = title;
        this.message = message;
        this.time = time;
        this.pic = pic;
    }
}
