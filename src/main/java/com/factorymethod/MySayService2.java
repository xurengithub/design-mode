package com.factorymethod;

public class MySayService2 implements ISayService{
    public void say(String... strings) {
        int len = strings.length;
        if(len == 2) {
            new Service2().say2(strings[0], strings[1]);
        }
    }
}
