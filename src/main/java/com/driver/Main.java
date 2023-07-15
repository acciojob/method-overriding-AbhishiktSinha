package com.driver;

public class Main {
  static class A {
      String meth() {
          return "Invoking method from class A";
      }
  }
  static class B extends A {
      public B() {
      }
      //      @Override
      String meth() {
          return "Method is overridden in Extended class B";
      }
  }
  public static void main(String[] args) {
      B ob = new B();
      ob.meth();

      B ob2 = new B();
      ob.meth();

  }
}