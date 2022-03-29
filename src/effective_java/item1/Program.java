package effective_java.item1;

import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Set;

public class Program {

  public static void main(String[] args) {
    Set<DayOfWeek> dowSet = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.THURSDAY); // of 정적 팩토리 메서드
    for (DayOfWeek dw : dowSet) {
      System.out.println(dw.getValue());
    }

    StaticInterfaceClass.factoryMethod().run();

    Date date = new Date(999, 4444);
    assert false;
  }
}
