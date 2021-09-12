/**
 * @author navigatezll
 * 方法区
 * 概念 java进程堆 = jvm 堆 + 堆外内存【直接内存】
 *
 * 1、 方法区
 *    是一套规范，是存储类元信息的地方【元信息 类的权限标志+属性+方法等等】， 【永久代】 ｜ 【元空间】是对
 *    方法区的各自的实现。
 *    是在字节码文件载入jvm内存中的过程中触发的解析操作，并保留了instanceKlass对象，【mirror放在堆中】
 *       注： 其中字节码文件 是存在 【直接内存】中的，程序被jvm解析之后生成了两个对象之后会自动释放这【部分直接内存】
 *
 *    a） 在jdk7.0之前 是 在jvm堆区的【老年代中的/永久代中的】
 *        弊端：
 *          1、 很难释放或者触发类卸载
 *            触发卸载条件1： 因为要确保class对象没有被引用
 *            触发卸载条件2：三大类加载器 app，ext，root定义的klass无法被加载
 *                  释放的内存不多，造成空间浪费【碎片化】，需要有一个统一整理的地方
 *          2、 同时动态字节码技术【之前没有】迅速发展，急需要一个新技术合理地进行动态类加载与卸载
 *          3、永久代oom会引发full gc，直接搞挂java程序，不安全
 *    b) 在jdk8.0及其之后 是在 java进程堆中的【直接内存】中的，或者叫做【元空间】
 *         元空间是在直接内存，解决了永久代的以上的几个问题点。
 *         理论上来讲是不限制内存大小的。但是，还是要学会调优
 *         但是【元空间】没有解决碎片化问题。，可以参考 【分代-复制算法逻辑】。
 *      % java -XX:+PrintFlagsFinal -version | grep Meta
         *     uintx [MaxMetaspaceSize]   = 18446744073709547520    {product} 最大
         *     uintx 【MetaspaceSize】    = 21807104 【20.7G 2^ 64】     {pd product} 【正常大小】
         * java version "1.8.0_271"
         * Java(TM) SE Runtime Environment (build 1.8.0_271-b09)
         * Java HotSpot(TM) 64-Bit Server VM (build 25.271-b09, mixed mode)
 *
 * @date 2021/9/12 11:36 下午
 */
package org.example.lesson4.method;