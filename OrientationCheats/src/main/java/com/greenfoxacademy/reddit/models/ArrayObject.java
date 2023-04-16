package com.greenfoxacademy.reddit.models;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class ArrayObject {

    @JsonProperty("what")
    private String what;
    @JsonProperty("numbers")
    private int [] numbers;

    public ArrayObject(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayObject() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ArrayObject{" +
                "what='" + what + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
