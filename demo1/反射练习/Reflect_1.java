package com.example.demo1.反射练习;

import lxh.hsp.Shiyan;
import lxh.hsp.User_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 明日雪花
 * @version 1.0
 */
public class Reflect_1 {
    public static void main(String[] args)throws Exception {
        fun2();
    }
    public static void fun1() throws Exception{
        //Class<?> cls=Class.forName("lxh.hsp.User_1");
        Class<?> cls = User_1.class;
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance("明日雪花");
        System.out.println(o);

        Method declaredMethod = cls.getDeclaredMethod("getName");
        declaredMethod.setAccessible(true);

        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"明日雪");
        System.out.println(declaredMethod.invoke(o));


        Method setName = cls.getDeclaredMethod("setName", String.class);

        setName.setAccessible(true);
        System.out.println(setName.invoke(o,"cc"));
        System.out.println(declaredMethod.invoke(o));
    }

    public static void fun2() throws Exception {
        Class<?> cls=Shiyan.class;
        Object o = cls.newInstance();
        Method setName = cls.getMethod("setName", String.class);
        setName.invoke(o,"雪花");
        Method method = cls.getMethod("getName");
        System.out.println(method.invoke(o));
        char a='0';
        int a1=80;
        System.out.println((char)80);
    }
}
