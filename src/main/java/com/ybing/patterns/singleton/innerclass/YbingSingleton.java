package com.ybing.patterns.singleton.innerclass;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class YbingSingleton implements Serializable {

    private YbingSingleton() {
        if(YbingSingletonInner.LAZY != null) {
            throw new RuntimeException("不准创建");
        }
    }

    public static final YbingSingleton getInstance() {
        return YbingSingletonInner.LAZY;
    }

    static class YbingSingletonInner {
        private static YbingSingleton LAZY = new YbingSingleton();
    }

    public static void main(String[] args) throws Exception {
       // YbingSingleton singleton = YbingSingleton.getInstance();
        Constructor constructor =  YbingSingleton.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        YbingSingleton singleton = (YbingSingleton)constructor.newInstance(null);
        System.out.println(singleton);
    }

    private Object readResolve() {
        return YbingSingletonInner.LAZY;
    }
}
