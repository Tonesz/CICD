package com.greenfoxacademy.reddit.models.dtos;

public class DoublingDto {


    private Integer received;
    private Integer result;

    public DoublingDto(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public DoublingDto() {
    }

    public Integer getReceived() {
        return received;
    }



    public Integer getResult() {
        return result;
    }



    public void setReceived(int received) {
        this.received = received;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
