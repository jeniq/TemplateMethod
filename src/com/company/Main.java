package com.company;

public class Main {

    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}

abstract class C {
    public void templateMethod() {
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}

class A extends C{
    @Override
    public void differ(){
        System.out.print("2");
    }

    @Override
    void differ2() {
        System.out.print("5");
    }
}

class B extends C{

    @Override
    public void differ() {
        System.out.print("4");
    }

    @Override
    void differ2() {

    }
}