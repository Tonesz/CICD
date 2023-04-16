package com.greenfoxacademy.reddit.models.dtos;

import com.greenfoxacademy.reddit.models.Log;

import java.util.List;

public class LogDto {

    private List<Log> entries;
    private int counter;

    public LogDto(List<Log> entries, int counter) {
        this.entries = entries;
        this.counter = counter;
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
