package com;

interface SampleInteface {

  default void run() {
    System.out.println("Hello World");
  }

}

class SampleIntefaceImpl implements SampleInteface{

  public void run2() {
    this.run();
    System.out.println("hello client");
  }
}


class Test {

  public static void main(String[] args) {
    SampleInteface sample = new SampleIntefaceImpl();
    sample.run();
  }
}


