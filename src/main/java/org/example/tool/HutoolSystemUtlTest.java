package org.example.tool;

import cn.hutool.system.JavaRuntimeInfo;
import cn.hutool.system.SystemUtil;

/**
 * @author navigatezll
 * @date 2021/11/17 3:01 下午
 */
public class HutoolSystemUtlTest {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            int[] ints = new int[100 * 1024 * 1024];
            JavaRuntimeInfo javaRuntimeInfo = SystemUtil.getJavaRuntimeInfo();
//            System.out.println(javaRuntimeInfo);


            System.out.println("################");
//            System.out.println(SystemUtil.getOsInfo());
            System.out.println("################ ");
            System.out.println(SystemUtil.getRuntimeInfo());
            Thread.sleep(1000);
        }
    }
}
