package com.example.demo1; /**
 * @author 明日雪花
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ZiMu {
    public static void main(String[] agrs)throws IOException {
        fun1();
    }
    public static void fun1()throws IOException {
        File file=new File("D:"+File.separator+"English.txt");
        FileReader read=new FileReader(file);
        BufferedReader buff=new BufferedReader(read);
        String word;
        Map<String,List> map=new HashMap<>();
        while((word=buff.readLine())!=null) {
            char[] single=word.toLowerCase().toCharArray();
            Arrays.sort(single);
            String name=new String(single);
            if(!map.containsKey(name)) {
                map.put(name,new ArrayList());
            }
            List<String> list=map.get(name);
            list.add(word);
        }
        buff.close();
        Set<Entry<String, List>> set=map.entrySet();
        java.util.Iterator<Entry<String, List>> iterator=set.iterator();
        while (iterator.hasNext()) {
            Entry<String, List> next =  iterator.next();
            List<String> list01=(List) next.getValue();
            System.out.println(list01.toString());
            for(String s: list01){
                System.out.println(s);
            }
        }

    }

}
