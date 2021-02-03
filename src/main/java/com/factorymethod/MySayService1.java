package com.factorymethod;

public class MySayService1 implements ISayService {
    public void say(String... strings) {
        int len = strings.length;
        if(len == 1) {
            new Service1().say1(strings[0]);
        }
    }
}
