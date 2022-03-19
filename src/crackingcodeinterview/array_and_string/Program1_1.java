package crackingcodeinterview.array_and_string;

import java.util.HashSet;
import java.util.Set;

public class Program1_1 {

  public static void main(String[] args) {

    System.out.println(isDuplicatedChar("hello"));
    System.out.println(isDuplicatedChar("bakf"));

  }

  private static boolean isDuplicatedChar(String str) {
    Set<Character> table = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      char myCode = str.charAt(i);
      if (table.contains(myCode)) {
        return true;
      }
      table.add(myCode);

    }
    return false;
  }
  

}
