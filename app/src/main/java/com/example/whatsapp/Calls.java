package com.example.whatsapp;

public class Calls {

    int dp_calls, call_icon_calls;
    String name_calls, time_calls;

    public int getDp() {
        return dp_calls;
    }

    public void setDp(int dp) {
        this.dp_calls = dp;
    }

    public void setName(String name) {
        this.name_calls = name;
    }

    public Calls(String name, int p, String time, int call_icon) {
        this.name_calls = name;
        dp_calls=p;
        this.call_icon_calls = call_icon;
        this.time_calls = time;
    }

    public String getName()
    {
        return name_calls;
    }

    public int getPersons()
    {
        return dp_calls;
    }

    public String getTime()
    {
        return time_calls;
    }

    public int getCallIcon() { return call_icon_calls; }
}
