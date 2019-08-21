package com.ybing.patterns.singleton.innerclass;

import java.io.*;

public enum  YbingEnumSingleton {

    INSTANCE;

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


    public static void main(String[] args) throws Exception {
        YbingEnumSingleton singleton = YbingEnumSingleton.INSTANCE;
        singleton.setObj(new Object());
        FileOutputStream os = new FileOutputStream("singleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(singleton);
        oos.flush();
        FileInputStream fis = new FileInputStream("singleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        YbingEnumSingleton singleton1 = (YbingEnumSingleton) ois.readObject();
        System.out.println(singleton.getObj() == singleton1.getObj());
    }
}
