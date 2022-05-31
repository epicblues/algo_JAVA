package com.baek_algo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// divide and conquer
public class Problem_1074 {

  @ParameterizedTest
  @CsvSource({"2,3,1,11", "3,7,7,63", "1,0,0,0", "10,511,511,262143", "10,512,512,786432"})
  @DisplayName("알고리즘 입출력")
  void test(int N, int r, int c, int answer) {
    // Given

    // When

    // Then
    assertThat(resolve(N, r, c)).isEqualTo(answer);
  }

  private int resolve(int N, int row, int column) {
    if (N == 0) {
      return 0;
    }
    return reduce(0, (int) Math.pow(2, N), row, column);

  }

  private int reduce(int offset, int length, int row, int col) {
    if (length == 1) {
      return offset;
    }

    // 절반으로 나누고, 어느 격자에 속해있는지 말하면 되지 않을까.
    int halfPoint = length / 2;
    int rowGroup = row >= halfPoint ? 1 : 0;
    int colGroup = col >= halfPoint ? 1 : 0;
    int quarter = length * length / 4;
    // 최종 사각형의 인덱스
    int[][] offsetTable = {{0, quarter}, {quarter * 2, quarter * 3}};
    // 해당 사각형에서의 상대위치
    int newRow = row >= halfPoint ? row - halfPoint : row;
    int newCol = col >= halfPoint ? col - halfPoint : col;
    return reduce(offset + offsetTable[rowGroup][colGroup], halfPoint, newRow, newCol);
  }
}
