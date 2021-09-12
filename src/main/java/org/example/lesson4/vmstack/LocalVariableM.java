package org.example.lesson4.vmstack;

/**
 * @author navigatezll
 * 局部变量表
 *
 * @date 2021/9/12 3:47 下午
 */
public class LocalVariableM {
    public static void main(String[] args) {
        LocalVariableM localVariableM = new LocalVariableM();
        localVariableM.show();
    }

    /**
     * 局部变量表slot概念， 一个slot为4个字节。
     * double 为8个字节，相当于2个slot才能装得下。
     *
     * @quest1 局部变量表有多大 ？ 通过javac 编译出来的class直接能够得出，
     * 通过jclasslib可以查看局部变量的基本信息，比如
     * 1. 操作数栈的最大深度,
     * 2. 操作数槽数多大，
     *
     * @example 下面的例子其实是深度和槽位是5，而不是3，
     * this 1个槽
     * a 2个槽
     * b 12个槽
     *
     * 内存中的使用为，地址从大到小
     *  1.  this  2. a  3. b
     *  因为机器在执行指令的时候是通过栈的方式自 大地址向小地址执行指令的。
     *
     */
    public void show(){

        //  start_pc 4 长度 14 序号1   【1 ，2】 占了2个slot
        double a = 10;
        double b = 12;
        //  start_pc 8 长度 10 序号3   【3、4】 占了2个slot
        System.out.println(a + b);
    }

    /**
     * @quest2 静态方法与 非静态方法的区别
     *
     * @example
     * 1. 静态方法的局部变量表中没有this，可以通过jclasslib查看与验证
     * 2.
     * @throws Exception
     */
    public static void staticShow() throws Exception{
        double c = 1;
        int d= 3;
        System.out.println(c + d);
    }
}
