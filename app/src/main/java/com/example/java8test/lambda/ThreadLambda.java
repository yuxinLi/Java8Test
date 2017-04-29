package com.example.java8test.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yuxin on 2017-04-29.
 *
 *
 * Lambda 只能简化 只有一个方法的接口，
 *
 *  (arg1 , arg2 ...)-> {}
 *
 */

public class ThreadLambda {

    public  static void main(String arg[]){


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ;i<10 ; i++){
                    System.out.println(" thread "+ i);
                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0 ;i<10 ; i++){
                System.out.println(" thread "+ i);
            }
        }).start();




        Set<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o, String t1) {
                return 0;
            }
        });
        set = new TreeSet<>(( o  , t1)->{
            return 0;

        });



        File f = new File("");
        f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return false;
            }
        });
        f.listFiles((file)->{
            return false;
        });




    }


}
