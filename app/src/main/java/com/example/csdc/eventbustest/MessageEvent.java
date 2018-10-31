package com.example.csdc.eventbustest;

/**
 * Created by csdc on 2018/10/31.
 */

public class MessageEvent {

    private String messgae;

    public MessageEvent(String messgae) {
        this.messgae = messgae;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }
}
