package org.example.lesson5;

/**
 * @author navigatezll
 * @date 2021/9/13 11:21 下午
 */
public class StringTest {
    public static void main(String[] args) {
//        test01();
//        test02();
        String a = "a" + "b";

        while (true);
    }
    public static void test01(){
        // char[] + 1   String +1
        String a = "zll";
        // char[] +0  String +1
        String b = new String("zll");
        System.out.println(a == b);
    }

    public static void test02(){
        // String +2 char[] +1
        String b = new String("zll01");
        String a = "zll01";
        System.out.println(a == b);
    }


    public static void test03(){
        String a  = "1" + "1";
    }
}
