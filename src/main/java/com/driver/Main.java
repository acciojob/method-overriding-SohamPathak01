package com.driver;

public class Main {

    public static class A {
        public void meth(){
            System.out.println("Invoking method from class A");
        }
    }
    public static class B extends A{

        public void meth(){
            System.out.println("method is overriden in class B");
        }
    }
    public static void main(String[] agrs){
        A a=new B();

        a.meth();
    }
  
}