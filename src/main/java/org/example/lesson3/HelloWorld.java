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
 *  DCL+volatile
 *
 *  由于指针重排序，导致9 比6
 *
 *  2 new #3 <org/example/lesson3/HelloWorld2>
 *     1、堆区申请一个不完全对象，此时还没有init初始化对象，是一个null的地址指针
 *     2、把内存地址压入栈【方法栈中】 【不完全对象】
 *  5 dup
 *     1、 复制栈顶元素
 *     2、 压入栈顶 【不完全对象】
 *     1、 为什么要dup一个呢？因为在第三步和第四步都有pop操作，需要dup一个压入栈中
 *  -------指令重排序-----------
 *  【9 astore_2
 *  *      1、pop栈顶，也就是【完全对象】对应的指针
 *  *      2、 给局部变量表中的第三个变量】
 *  -------------------------
 *  6 invokespecial #4 <org/example/lesson3/HelloWorld2.<init> : ()V>
 *      非静态方法，有一个this指针
 *      1、构建方法对应的环境【为 this设置堆区】
 *          创建栈桢
 *          传参数
 *          保存现场
 *      2、为栈顶的地址引用的堆中开辟一个Helloworld对象的空间并初始化
 *      3、弹出栈顶元素
 *         此时被复制的栈顶对应的【不完全对象】所对应的堆空间，变成了【完全对象】
 *  9 astore_2
 *      1、pop栈顶，也就是【完全对象】对应的指针
 *      2、 给局部变量表中的第三个变量
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
