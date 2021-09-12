package utils;

import org.example.lesson3.FileClassLoader;

import java.io.File;

/**
 * @author navigatezll
 * 获取当前项目路径https://www.cnblogs.com/daxiaxia/p/8903906.html
 * @date 2021/9/11 2:59 下午
 */
public class PathUtil {
    public static final String getCurrentClassPath(Class<?> cls){
        return cls.getResource("").getPath() + cls.getSimpleName() + ".class";
    }
    public static final String getProjectClassPath(Class<?> cls){
        // cls.getCanonicalName() ==> org.example.lesson3.FileClassLoader
        //
        return cls.getResource("/").getPath()  + cls.getCanonicalName().replace(".",File.separator) +".class";
    }

    public static void main(String[] args) {
        System.out.println(PathUtil.getCurrentClassPath(FileClassLoader.class));
        System.out.println(PathUtil.getProjectClassPath(FileClassLoader.class));
    }
}
