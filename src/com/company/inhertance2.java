package com.company;

class inhertance1 {
    public void main(){
        System.out.println("I am walking");
    }
}
class inherit extends inhertance1{
    public void method(){
        System.out.println("I am flying");
    }
    public void sing(){
        System.out.println("I am singing");
    }
}
public class inhertance2 {
    public static void main(String[] args){
        inherit obj=new inherit();
        obj.main();
        obj.method();
        obj.method();
    }

}
