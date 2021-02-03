package com.factorymethod;

public class SayServiceFatory {
    ISayService getService(int type) {
        switch (type) {
            case 1:
                return new MySayService1();
            case 2:
                return new MySayService2();
            case 3:
                return new MySayService3();
            default:
                throw new IllegalArgumentException("非法类型");
        }
    }
}
