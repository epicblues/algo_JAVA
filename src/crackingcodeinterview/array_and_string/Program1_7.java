package crackingcodeinterview.array_and_string;


import java.util.Arrays;

// 이미지를 표현하는 N*N 행렬이 있다. 이미지의 각 픽셀은 4바이트로 표현된다. 이ㅏ떄 이미지를 90도 회전시키는 메서드를 작성하라.
// 행렬을 추가로 사용하지 않고도 가능한 풀이를 제시할 것

// TODO: 이해 못함;
public class Program1_7 {

  public static void main(String[] args) {
    int[][] image = new int[][]{
        {
            1, 2, 3, 4, 5
        }, {
        1, 3, 5, 7, 9
    }, {
        2, 4, 6, 8, 10
    }, {
        3, 6, 9, 12, 15
    }, {
        4, 8, 12, 16, 20
    }
    };

    int[][] rotatedImage = rotate(image);
    for (int i = 0; i < rotatedImage.length; i++) {
      System.out.println(Arrays.toString(rotatedImage[i]));
    }


  }

  private static int[][] rotate(int[][] image) {
    if (image.length == 0 || image.length != image[0].length) {
      return image;
    }
    int n = image.length;

    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = image[first][i]; // temp 역할

        image[first][i] = image[last - offset][first];
        image[last - offset][first] = image[last][last - offset];
        image[last][last - offset] = image[i][last];
        image[i][last] = top;
      }
    }

    return image;
  }
}
