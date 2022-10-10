package com.company;

class Constructor {
    public  Constructor(int rollno) {
        System.out.println("Roll no: " + rollno);
    }

    public  Constructor(int age, String name) {
        System.out.println("Your age: " + age);
        System.out.println("Your name: " + name);
    }

    public Constructor(String education) {
        System.out.println("Your education: " + education);
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Constructor obj1 = new Constructor(237425);
        Constructor obj2 = new Constructor(21,"vamshi");
        Constructor obj3 = new Constructor("btech");
    }
}
