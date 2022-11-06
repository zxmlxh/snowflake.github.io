package com.example.demo1;

import java.io.PrintWriter;

/**
 * @author 明日雪花
 * @version 1.0
 */
public class 心型公式 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        PrintWriter printWriter = new PrintWriter(System.out);
        float x,y,a;
        for(y=2.5f;y>-2.0f;y-=0.12f){
            for(x=-2.3f;x<2.3f;x+=0.041f){
                a=x*x+y*y-1;
              printWriter.print(a*a*a-x*x*y*y*y<-0.0f?'*':' ');
            }
           printWriter.println("");
        }
        printWriter.close();
    }
}
