package crackingcodeinterview.array_and_string;

public class Program1_5 {

  public static void main(String[] args) {
    System.out.println(isTwoStringCouldBeSameByEditingOnce("abc", "abccc"));
  }

  private static boolean isTwoStringCouldBeSameByEditingOnce(String target1, String target2) {
    int lengthDiff = Math.abs(target1.length() - target2.length());
    // 길이 차이가 2 이상 나면 불가능
    if (lengthDiff > 1) {
      return false;
    }

    int[] table = new int[128];

    for (int i = 0; i < target1.length(); i++) {
      char c = target1.charAt(i);
      table[c]++;
    }

    for (int i = 0; i < target2.length(); i++) {
      char c = target2.charAt(i);
      table[c]--;
    }

    int tableSum = 0;
    for (int i = 0; i < table.length; i++) {
      if (table[i] == 0) {
        continue;
      }
      tableSum += Math.abs(table[i]);
    }
    // tableSum이 2인 경우 : 문자열의 길이는 같고 한 문자만 다를 때
    // tableSum이 1인 경우 : 문자열의 길이는 1만큼 차이나고 다른 문자는 같고 한 문자만 추가해야 할 때
    return tableSum <= 2;

  }
}
