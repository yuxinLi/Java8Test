package com.example.java8test.inter;

/**
 * Created by yuxin on 2017-04-29.
 */

public interface Inter8 {

    static void method(){
        System.out.println(" static method in Inter8");
    }

    default void defaultMethod(){
        System.out.println(" default method in Inter8");
    }

    default void defaultMethod2(){
        System.out.println(" default method 2 in Inter8");
    }
}
