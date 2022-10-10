package com.company;

class W
{

    int a =143;
    public void method()
    {
        System.out.println("this is default methid");
    }
    protected int c = 144;
    public void ProMethod()
    {
        System.out.println("this protected method");
    }
    public int f = 222;
    public void PublicMethod(){
        System.out.println("this is pulbic method");
    }


}
public class Default1{
    public static void main(String[] args){
        W obj = new W();
        System.out.println(obj.a);
        obj.method();
        System.out.println(obj.c);
        obj.ProMethod();

    }
}
