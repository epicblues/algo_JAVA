package com.practice.abstract_interface;

import java.util.Map;

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {


  @Override
  // 일종의 디폴트 메서드
  // 이 메서드는는 미리 구현해 놨으니까 나머지만 재정의해!
  // 구현하고 싶으면 직접 재정의하라!
  public V setValue(V value) {
    throw new UnsupportedOperationException();
  }
}
