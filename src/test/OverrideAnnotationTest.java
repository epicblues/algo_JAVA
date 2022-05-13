package test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class OverrideAnnotationTest {

  @Test
  void test() {
    log.info("컴파일러 에러 발생하지 않음");
  }

  interface DefaultMethodHandleable {

    default void run() {
      log.info("run");
    }
  }

  class OverridingDefaultMethodClass implements DefaultMethodHandleable {

    @Override // 시그니처를 제대로 지키지 않을 경우 컴파일러에서 예외를 발생시킨다.
    public void run() {
      log.info("overrided");
    }

  }

}
