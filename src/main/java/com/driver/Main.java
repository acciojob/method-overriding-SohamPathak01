package com.driver;

public class Main {

    public class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public class B extends A{

        public String meth(){
            return "method is overriden in class B";
        }
    }
    public void main(String[] agrs){

        A a=new B();

        System.out.println(a.meth());
    }
  
}