package com.example.whatsapp;

public class Chats {
    int dp;
    String name, msg, time;

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chats(String name, int p, String msg, String time) {
        this.name = name;
        dp=p;
        this.msg = msg;
        this.time = time;
    }

    public String getName()
    {
        return name;
    }

    public int getPersons()
    {
        return dp;
    }

    public String getMessage()
    {
        return msg;
    }

    public String getTime()
    {
        return time;
    }
}