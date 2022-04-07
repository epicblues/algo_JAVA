package com.practice.private_class;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MySet<E> extends AbstractSet<E> {

  // 정적 문맥
  private static Map.Entry<?, ?> anonymousMap = new Entry<Object, Object>() {
    private static final int b = 10;

    @Override
    public Object getKey() {
      return null;
    }

    @Override
    public Object getValue() {
      return null;
    }

    @Override
    public Object setValue(Object value) {
      return null;
    }
  };
  private int baka = 0;

  @Override
  public Iterator<E> iterator() {
    return new MyIterator();
  }

  @Override
  public int size() {
    return 0;
  }

  // 비정적 멤버 클래스
  private class MyIterator implements Iterator<E> {

    @Override
    public boolean hasNext() {
      int b = MySet.this.baka; // 이 인스턴스가 바깥 인스턴스(MySet을 암묵적으로 참조하고 있다.)

      // 이 익명 클래스(정적 클래스가 아니므로)도 바깥 클래스에 대한 인스턴스를 참조하고 있다.
      // 동적 문맥에서 작성되었기 때문에
      Runnable a = () -> {
        System.out.println(MySet.this.baka);
      };
      return false;
    }

    @Override
    public E next() {
      return null;
    }
  }
}
