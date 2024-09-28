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
class D{
    public static void main(String[] args) {

        int num = 9;

                // while input is > 0
            int digit = num % 10;    //
        System.out.println("num%10 : "+digit);

        num = num / 10;
        //System.out.println("num/=10" + num);

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