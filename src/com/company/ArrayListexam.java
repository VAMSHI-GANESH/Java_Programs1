package com.company;

import java.util.ArrayList;

public class ArrayListexam{
    public static void main(String[] args){
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("vamshi");
        obj.add("tarun");
        obj.add("aditya");
        obj.add("gupta");
        String output = obj.get(3);
        System.out.println(output);
        System.out.println(obj);

    }

}
