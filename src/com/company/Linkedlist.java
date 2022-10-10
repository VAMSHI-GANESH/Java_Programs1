package com.company;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("H");
        obj.add("W");
        obj.add("E");
        obj.add("T");
        obj.add("M");
        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.addAll(obj);
        System.out.println("Elements are: "+obj1);
        Collections.sort(obj);
        System.out.println("Sorting elements"+obj);
        Collections.sort(obj,Collections.reverseOrder());
        System.out.println("reverse order"+obj);
        Collections.shuffle(obj);
        System.out.println("shuffling the elements: "+obj);

    }
}
