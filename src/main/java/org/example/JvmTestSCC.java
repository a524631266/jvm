package org.example;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author navigatezll
 * @date 2021/8/28 1:09 下午
 */
public class JvmTestSCC {
    /**
     * XSS 默认1m ，mac本地机器测试最少160k
     * @param args
     */
    public static void main(String[] args) {
        // 查看根类加载器的路径所在的位置
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }
        System.out.println(111);
    }
}
