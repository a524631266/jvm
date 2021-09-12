package org.example.lesson3;

/**
 * @author navigatezll
 * 字节码规范
 * -----------------------
 * ------magic 魔数 CA FE BA BE 4个字节
 * ------minor version 次版本号 2个字节
 * ------major version 主版本号 2个字节
 *      33 表示什么？
 * ------constant pool count 常量池大小 2个字节
 *      22 =>  2 * 16 + 2 = 34
 *
 * ------contant pool 常量池 内容
 * ------access flags 类的访问权限  （u2）
 *   访问权限是通过 或运算计算出来的。比如 在常量池之后 2个字节
 *   00 21 === 00 01 ｜ 00 20  得来
 *   也就是 public + super
 *   https://www.cnblogs.com/RDaneelOlivaw/p/13529474.html
 * ------this_class  (u2) 表示当前类
 *   00 06 => 表示常量池中的第6个元素【06】编号，对应的常量池对应的类信息
 *
 *
 *
 *
 * @date 2021/9/11 2:51 下午
 */
public class HelloWorld implements Hello{
    private int asd = 10;
    public static void main(String[] args) {

        int a = 0;

        HelloWorld2 helloWorld2 = new HelloWorld2();

        System.out.println("hello world");
    }
}
