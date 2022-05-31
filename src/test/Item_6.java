package test;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Item_6 {

  public static <E> Stream<E> streamOf(Iterable<E> iterable) {
    return StreamSupport.stream(iterable.spliterator(), false);
  }

  @Test
  @DisplayName("testName")
  void test1() {

    // Given
    Map<String, Long> freq = new HashMap<>();
    Stream<String> words = Stream.of("ya", "YA", "ho", "check", "rule");
    // When
    words.forEach(word -> {
      freq.merge(word.toLowerCase(), 1L, Long::sum);
    });

    // Then
    assertThat(freq.get("ya")).isEqualTo(2);
  }

  @Test
  @DisplayName("testName")
  void test3() {

    // Given

    Stream<String> words = Stream.of("ya", "YA", "ho", "check", "rule");

    // When
    Map<String, Long> freq = words.collect(
        groupingBy(String::toLowerCase, ConcurrentHashMap::new, counting()));
    // Then
    assertThat(freq).isInstanceOf(ConcurrentHashMap.class);

  }

  @Test
  @DisplayName("testName")
  void test() {

    // Given
    // When

    var beforeStream = Stream.of("hello", "world", "check");

    // Then
    assertThat(IntStream.rangeClosed(1, 5)).hasSize(5);

  }

  @Test
  @DisplayName("testName")
  void test5() {

    // Given

    // When

    // Then
    assertThatThrownBy(() -> {
      invariantTest(null);
    }).isInstanceOf(NullPointerException.class);
    assertThatNoException().isThrownBy(() -> {
      invariantTest("hello");
    });

  }

  private void invariantTest(String target) {
    Objects.requireNonNull(target);

  }

}
