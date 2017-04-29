package com.example.java8test.inter;

/**
 * Created by yuxin on 2017-04-29.
 */

public interface Inter {

    static void method(){
        System.out.println(" static method in Inter");
    }

    default void defaultMethod(){
        System.out.println(" default method in Inter");
    }
}
