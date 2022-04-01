package com.practice.cleaner;

import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;

public class Main {

  static Cleaner cleaner = Cleaner.create();
  public int member1 = 10;
  Cleanable cleanable;


  public Main() {
    this.cleanable = cleaner.register(this, () -> {
      // 가비지 컬렉터가 호출되었을 때 실행되는 함수?
      System.out.println("cleaner activated");

    });
  }

  public static void main(String[] args) {
    System.out.println("시스템 시작");
    Main m = new Main();
    System.out.println(m.member1);
    m = null;
    System.gc();

  }

  public void release() {
    cleanable.clean();
  }


}
