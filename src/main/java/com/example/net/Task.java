package com.example.net;
public class Task {

    private int id;
    private String name;
    private int duration;


public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getDuration() {
        return duration;
    }


public  String checkDuration ()
{
    if (duration > 100)
    return "High";
    else
    return "Low";
}


public void setId(int id) {
    this.id = id;
}


public void setName(String name) {
    this.name = name;
}


public void setDuration(int duration) {
    this.duration = duration;
}


}