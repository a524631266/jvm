package org.example;

import java.util.ServiceLoader;

/**
 * @author navigatezll
 * @date 2021/9/1 10:08 上午
 */
public class SpiLoader {
    public static void main(String[] args) {
        ServiceLoader<Test1> load = ServiceLoader.load(Test1.class);

        for (Test1 test1 : load) {
            System.out.println(test1);
            // true
            System.out.println(test1 instanceof Test1Impl);
            // true
            System.out.println(test1 instanceof Test1);
        }
    }
}
