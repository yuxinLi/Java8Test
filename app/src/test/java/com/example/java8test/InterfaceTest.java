package com.example.java8test;

import com.example.java8test.inter.Inter8;
import com.example.java8test.inter.Inter8Impl;

import org.junit.Test;

/**
 * Created by yuxin on 2017-04-29.
 */

public class InterfaceTest {

    @Test
    public void test1(){
        Inter8.method();

        new Inter8Impl().defaultMethod();
    }
}
