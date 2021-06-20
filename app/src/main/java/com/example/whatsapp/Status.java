package com.example.whatsapp;

public class Status {

    int dp_status;
    String name_status, msg_status;

    public int getDp() {
        return dp_status;
    }

    public void setDp(int dp) {
        this.dp_status = dp;
    }

    public void setName(String name) {
        this.name_status = name;
    }

    public Status(String name, int p, String msg) {
        this.name_status = name;
        dp_status=p;
        this.msg_status = msg;
    }

    public String getName()
    {
        return name_status;
    }

    public int getPersons()
    {
        return dp_status;
    }

    public String getMessage()
    {
        return msg_status;
    }

}
