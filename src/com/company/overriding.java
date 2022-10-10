package com.company;
class over1 {
    public void method(){
        System.out.println("method in parent  class");
    }
}
class over extends over1{
    public void method(){
        System.out.println("method in child class");
    }
}
public class overriding{
    public static void main(String[] args){
        over1 obj1 = new over1();
        over1 obj2 = new over();
        obj1.method();
        obj2.method();
    }
}

