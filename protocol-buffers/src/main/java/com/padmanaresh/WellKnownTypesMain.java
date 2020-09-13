package com.padmanaresh;

import com.google.protobuf.Timestamp;
import com.padmanaresh.util.MyMessage;

public class WellKnownTypesMain {
    public static void main(String[] args) {
        MyMessage message = MyMessage.newBuilder()
        .setMyField(Timestamp.newBuilder().setSeconds(30).build()).build();
        System.out.println(message);

    }
}
