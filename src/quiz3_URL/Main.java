package quiz3_URL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type strings to URL");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Char[] inputChar = input.toCharArray();
        char blank = ' ';
        int blankCount = 0;
        for (int i =0; i<inputChar.length;i++) {
            if (char(inputChar[i]) == blank)
        }
    }
}
