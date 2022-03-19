package crackingcodeinterview.array_and_string;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program1_8 {

  public static void main(String[] args) {
    int[][] matrix = new int[][]{
        {0, 1, 2, 3, 4},
        {1, 2, 0, 4, 5},
        {2, 4, 5, 1, 3}
    };

    zero_matrix(matrix);

    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }

  private static int[][] zero_matrix(int[][] matrix) {
    // traverse하면서 0원소의 index를 구한다.

    int M = matrix.length;
    int N = matrix[0].length;

    Set<Integer> rowSet = new HashSet<>();
    Set<Integer> colSet = new HashSet<>();

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (colSet.contains(j)) {
          continue;
        }

        if (matrix[i][j] == 0) {
          rowSet.add(i);
          colSet.add(j);
        }
        if (rowSet.size() == M && colSet.size() == N) {
          break;
        }
      }
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (matrix[i][j] != 0 && rowSet.contains(i) || colSet.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }

    return matrix;
  }
}
