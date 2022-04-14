package com.practice;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;

public class Program {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    TempClass c = new TempClass();
    try {
      c.checkMyMetadata();

    } catch (Exception e) {
      e.printStackTrace();
    }

    IntStream a = IntStream.range(1, 101);
    a.forEach(System.out::println);





  }
}

class WrappedSet<E> implements Set<E> {

  private final Set<E> set;
  private int addCount = 0;

  public WrappedSet(Set<E> set) {
    this.set = set;
  }

  @Override
  public int size() {
    return this.set.size();
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return this.set.toArray(a);
  }

  @Override
  public boolean add(E e) {
    this.addCount++;

    return this.set.add(e);
  }

  @Override
  public boolean remove(Object o) {
    return this.set.remove(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    return this.set.addAll(c);
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }
}
