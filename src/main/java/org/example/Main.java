package org.example;
class A{
    public void m1(){
        System.out.println("A");
    }
}
class B extends A{
    public void m1(){
        System.out.println("B");
        super.m1();
    }
}
public class Main {
    public static void main(String[] args) {
       A a = new A();
       //a.m1();
       A a1 = new B();
       a1.m1();


    }
}