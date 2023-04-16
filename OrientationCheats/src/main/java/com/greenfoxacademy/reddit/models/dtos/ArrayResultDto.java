package com.greenfoxacademy.reddit.models.dtos;

public class ArrayResultDto {

    int [] result;

    public ArrayResultDto(int[] result) {
        this.result = result;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}
