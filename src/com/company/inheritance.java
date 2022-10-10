package com.company;

import java.util.Scanner;

public class inheritance {
    int z;
    public void addition(int x, int y){
        z= x+y;
        System.out.println("addition: "+z);
    }
    public void sub(int x,int y){
        z = x-y;
        System.out.println("subtraction: "+z);
    }

}
class Calcultor extends inheritance{
    public void multi(int x, int y){
        z= x*y;
        System.out.println("multiplication: "+z);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int y= sc.nextInt();
        Calcultor obj = new Calcultor();
        obj.addition(x,y);
        obj.sub(x,y);
        obj.multi(x,y);
    }
}
