package crackingcodeinterview.array_and_string;

public class Program1_2 {

  public static void main(String[] args) {

    String str1 = "asdfsd";
    String str2 = "dsadsd";
    boolean isPermutation = isPermutation(str1, str2);
    System.out.println(isPermutation);
  }

  private static boolean isPermutation(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;

    }
    int[] table = new int[65536];

    for (int i = 0; i < str1.length(); i++) {
      int index = (int) str1.charAt(i);
      table[index]++;
    }

    for (int i = 0; i < str2.length(); i++) {
      int index = (int) str2.charAt(i);
      if (table[index] == 0) {
        return false;
      }
      table[index]--;
    }

    return true;


  }
}
