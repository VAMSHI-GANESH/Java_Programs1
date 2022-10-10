package com.company;

class Overloading {

    public void disp(){
        System.out.println("Inside the first display method");
    }
    public void disp(String val1){
        System.out.println("INside second display method with argument: "+val1);
    }
    public void disp(String val1, String val2){
        System.out.println("Inside the thrid display method with arguments: "+val1 +val2);
    }
}
public class overload{
    public static void main(String[] args){
        Overloading obj = new Overloading();
        obj.disp();
        obj.disp("hero");
        obj.disp("Hero","Helo");

    }
}

