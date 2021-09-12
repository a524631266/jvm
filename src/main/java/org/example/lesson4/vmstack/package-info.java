/**
 * @author navigatezll
 * 虚拟机栈分5块讲
 * 1、局部变量表
 * @see org.example.lesson4.vmstack.LocalVariableM
 * 2、操作数栈
 * @see org.example.lesson4.vmstack.OperateStackM
 * 3、动态连接
 *   动态连接为 直接内存地址【直接引用】，即机器码执行的地址比如
 *    方法method_local_index
 *
 * 4、返回地址
 *    return 恢复现场
 *    或者
 *    pc 在执行  invokespecial #3 <org/example/lesson4/LocalVariableM.<init> : ()V>
 *        1. 先push 程序当前的执行地址
 *        2. 执行完之后return 会pop一个程序init地址返回地址
 *    可以查看 第四章
 *    @see https://ke.coderead.cn/live_pc/l_607aa1aae4b071a81eb2e7d1
 *    1:35:01
 * 5、轻量级锁
 *
 *
 *
 *
 * 内存模型  <-  执行引擎
 *         <-  gc
 *         <-  类加载器
 *         <-  JIT
 *
 *
 * @important  字节码指令    虚拟机规范 第7章，操作码助记符
 * @see org.example.lesson3.HelloWorld
 *
 *
 * @date 2021/9/12 4:09 下午
 */
package org.example.lesson4.vmstack;

