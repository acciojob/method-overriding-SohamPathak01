package com.driver;

public class Main {

    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{

        public String meth(){
            return "method is overriden in class B";
        }
    }
    public static void main(String[] agrs){

        B a=new B();

        System.out.println(a.meth());
    }
  
}