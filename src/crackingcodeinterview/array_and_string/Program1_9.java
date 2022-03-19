package crackingcodeinterview.array_and_string;

public class Program1_9 {

  public static void main(String[] args) {
    System.out.println(isRotation("waterbottle", "erbottlewat"));
  }

  private static boolean isRotation(String input, String target) {
    int len = input.length();
    if (len == target.length() && len > 0) {
      // 같은 문자열 두개를 연결하면 회전 축과 상관 없이 substring인지 확인할 수 있다.
      // "waterbottlewaterbottle"
      // "erbottlewat" 발견 가능
      String concatenatedInput = input + input;
      return concatenatedInput.contains(target);
    }

    return false;
  }


}
