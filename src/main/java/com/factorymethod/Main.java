package com.factorymethod;

public class Main {
    public static void main(String[] args) {
        SayServiceFatory fatory = new SayServiceFatory();
        fatory.getService(1).say("aaa");
        fatory.getService(2).say("aaa","bbb");
        fatory.getService(3).say("aaa","bbb","ccc");
        fatory.getService(4);
    }
}
