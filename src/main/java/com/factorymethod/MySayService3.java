package com.factorymethod;

public class MySayService3 implements ISayService{
    public void say(String... strings) {
        int len = strings.length;
        if(len == 3) {
            new Service3().say3(strings[0], strings[1], strings[2]);
        }
    }
}
