package com.atguigu.java;

import java.util.ArrayList;

public class HelloWorld {



    public static void main(String[] args){
        System.out.println("知稻了");
        System.out.println();


        ArrayList<String> list = new ArrayList();
        list.add("Rogers");
        list.add("Stark");
        list.add("Thor");
        for (String o : list) {
            System.out.println(o);
        }
    }


}
