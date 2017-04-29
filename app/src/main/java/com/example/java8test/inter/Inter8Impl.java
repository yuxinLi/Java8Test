package com.example.java8test.inter;

/**
 * Created by yuxin on 2017-04-29.
 */

public class Inter8Impl implements Inter8 , Inter{

    @Override
    public void defaultMethod() { // 由于两个接口都有 defaultMethod函数 ， 必须重写
        System.out.println(" Inter8Impl default method ");
    }
}
