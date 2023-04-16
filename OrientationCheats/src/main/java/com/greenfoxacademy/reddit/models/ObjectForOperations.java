package com.greenfoxacademy.reddit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectForOperations {

    @JsonProperty("until")
    private Integer until;

    public ObjectForOperations() {
    }

    public ObjectForOperations(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "Doing operations until : " + getUntil();
    }
}