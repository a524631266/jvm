/**
 * @author navigatezll
 *
 * @see ./运行时常量池.png
 *
 * 1、真正在用的时候 jvm才会解析类，证据为 运行时常量池与静态常量池是一致的
 *
 * hashTable  key：整数 value：HashTableEntry(value)
 *  其中 hte中的value指向的是string()地址
 *
 *
 * @date 2021/9/13 8:56 下午
 */
package org.example.lesson5;