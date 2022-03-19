package crackingcodeinterview.array_and_string;

public class Program1_3 {

  public static void main(String[] args) {

    String encodedStr = encodeURLstr(" asdf vxvs wefsd xcv");
    System.out.println(encodedStr);
  }

  private static String encodeURLstr(String s) {
    char[] answerBuffer = new char[s.length() * 3];

    int pointer = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        answerBuffer[pointer] = '%';
        answerBuffer[pointer + 1] = '2';
        answerBuffer[pointer + 2] = '0';
        pointer += 3;
      } else {
        answerBuffer[pointer] = s.charAt(i);
        pointer++;
      }
    }

    return String.valueOf(answerBuffer, 0, pointer);
  }

}
