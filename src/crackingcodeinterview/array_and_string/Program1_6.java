package crackingcodeinterview.array_and_string;

public class Program1_6 {

  public static void main(String[] args) {
    String compressed = compress("aabcccaaa");
    System.out.println(compressed);
  }

  private static String compress(String target) {
    if (target.length() == 1) {
      return target;
    }
    // 최악의 경우 스트링 크기(모든 문자가 연속된 중복 없이 하나 씩 나열)
    StringBuilder sb = new StringBuilder(target.length() * 2);
    int charCount = 1;
    sb.append(target.charAt(0));

    for (int i = 1; i < target.length(); i++) {
      char frontChar = target.charAt(i - 1);
      char nextChar = target.charAt(i);
      if (frontChar == nextChar) {
        charCount++;
        if (i == target.length() - 1) {
          // 끝에 도달했을 경우
          sb.append(charCount);
          break;
        }
        continue;
      }

      // 새로운 알파벳이 들어왔을 경우
      // 기존의 알파벳의 횟수를 등록한다.
      sb.append(charCount);
      // 새로운 알파벳을 등록한다.
      sb.append(target.charAt(i));
      // 횟수 초기화
      charCount = 1;

      if (i == target.length() - 1) {
        // 끝에 도달했을 경우
        sb.append(charCount);
        break;
      }


    }
    return sb.toString();

  }

}
