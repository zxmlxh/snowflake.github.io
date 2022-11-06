package com.example.demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/**
 * @author 明日雪花
 * @version 1.0
 */
public class 实验 {
    public static void main(String[] args)throws IOException {
        fun2();
    }
    public static void fun()throws IOException {
        File file = new File("D:" + File.separator + "dog.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("xuehua".getBytes());
        long time=file.lastModified();
        System.out.println(time);
        fileOutputStream.close();
        Date date=new Date(time);
        System.out.println(date);
    }
    public static void fun2(){
        String s = new String("f");
        System.out.println(s.length());
    }
}
