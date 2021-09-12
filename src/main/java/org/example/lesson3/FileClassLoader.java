package org.example.lesson3;

import org.apache.commons.io.FileUtils;
import utils.PathUtil;

import java.io.File;
import java.io.IOException;

/**
 * @author navigatezll
 * 1. 安装 view as binary  hex插件
 * @date 2021/9/11 2:51 下午
 */
public class FileClassLoader {

    public static void main(String[] args) throws IOException {
        File file = new File(PathUtil.getCurrentClassPath(HelloWorld.class));

        byte[] bytes = FileUtils.readFileToByteArray(file);
        System.out.println(bytes);
    }
}
