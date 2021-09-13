package org.example.lesson5;

/**
 * @author navigatezll
 * @date 2021/9/13 11:50 下午
 */
public class ConcatTest {
    public static void main(String[] args) {
//        complexTest01();
//        test01_01_01();

        String bb = "11";

        String aa = new String(new char[]{'1','1'}, 0 ,2);
        aa.intern();

        System.out.println(aa == bb);

    }
    public static  void test01(){
        String d = "11";


        String a = "1";
        String b = "1";
        // 是不会查常量池的
        // new String(new char[]{'1','1'}, 0, 2)
        String c = a + b;
        // false
        System.out.println(c == d);

    }

    public static  void test01_01(){

        String d = "11";

        String a = "1";
        String b = "1";
        // 是不会查常量池的
        // new String(new char[]{'1','1'}, 0, 2)
        String c = a + b;
        c.intern();


        // false
        System.out.println(c == d);
    }
    public static  void test01_01_01(){



        String a = "1";
        String b = "1";
        // 是不会查常量池的
        // new String(new char[]{'1','1'}, 0, 2)
        String c = a + b;
        c.intern();

        String d = "11";
        // true
        System.out.println(c == d);
    }


    public static  void test02(){
        String a = new String("11");
        String b = new String("11");
        String c = a + b;


    }

    public static  void test03(){

        String d = "11";

        final String a ="1";
        final String b = "1";
        String c = a + b;
        // true
        System.out.println(c == d);
    }




    public static void complexTest01(){
        String s1 = "1";
        String s2 = "1";
        String s3 = s1+ s2;

        String s4 = "11";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }

    /**
     * intern 做的事情为2种
     * 1。 如果常量池没有字符串，就先在常量池种创建，并返回引用
     * 2。 如果常量池有字符串，则创建string引用，返回
     *    在这一步种，肯定会有rehash操作。index 》100 ，则重新rehash，并重新返回值
     */
    public static void internlTest(){
        String bb = "11";

        String aa = new String(new char[]{'1','1'}, 0 ,2);
        aa.intern();
        // false
        System.out.println(aa == bb);
    }

    public static void internlTest2(){


        String aa = new String(new char[]{'1','1'}, 0 ,2);
        aa.intern();
        //  bb的引用和aa的引用一直，类似于  String  aa  = "11"； String bb = "11";
        String bb = "11";
        // true
        System.out.println(aa == bb);
    }
}
