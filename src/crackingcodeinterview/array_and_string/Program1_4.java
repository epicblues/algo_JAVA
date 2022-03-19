package crackingcodeinterview.array_and_string;

public class Program1_4 {

  public static void main(String[] args) {
    boolean answer = isPalindromePermutation("abcde   eadcb");
    System.out.println(answer);
  }

  private static boolean isPalindromePermutation(String target) {
    int strLength = target.length();

    // 공백이 아닌 문자열을 테이블에 등록한다.
    int[] table = new int[128];
    for (int i = 0; i < target.length(); i++) {
      char c = target.charAt(i);
      if (c == ' ') {
        strLength--; // 공백은 문자열 개수에 포함시키지 않는다.
        continue;
      }
      if (c < 'a') {
        c += 'a' - 'A'; // 대문자로 변환
      }
      table[c]++;
    }

    // 문자열 개수가 짝수일 경우
    if (strLength % 2 == 0) {
      for (int i = 0; i < table.length; i++) {
        if (table[i] > 0 && table[i] % 2 == 1) {
          return false;
        }
      }
    } else { // 문자열 개수가 홀수일 경우
      int oddCounter = 0;
      for (int i = 0; i < table.length; i++) {
        if (table[i] > 0 && table[i] % 2 == 1) {
          if (oddCounter > 0) {
            return false;
          }
          oddCounter++;
        }

      }

    }

    return true;


  }


}
