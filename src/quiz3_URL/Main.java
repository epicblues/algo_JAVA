package quiz3_URL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type strings to URL");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] inputChar = input.toCharArray();
        char blank = ' ';
        int spaceCount = 0;
        for (int i = 0; i < inputChar.length; i++) {
            if (inputChar[i] == blank) {
                spaceCount++;
            }
        }
        char[] bigCharArray = new char[inputChar.length + 2 * spaceCount];
        int j = 0;
        for (int i = 0; i < inputChar.length; i++) {
            if (inputChar[i] == blank) {
                bigCharArray[j] = '%';
                bigCharArray[j + 1] = '2';
                bigCharArray[j + 2] = '0';
                j += 3;
            } else {
                bigCharArray[j] = inputChar[i];
                j++;
            }
        }
        System.out.println(bigCharArray);

    }
    void replaceSpaces(char[] str,int trueLength) {
        int spaceCount = 0; int index =0; int i=0;
        for (i=0; i<trueLength; i ++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount*2;
        if(trueLength < str.length) str[trueLength] = '\0';
        for(i=trueLength-1; i>=0;i--) {
            if(str[i] == ' ') {
                str[index -1] = '0';
                str[index -2] = '2';
                str[index -3] = '%';
                index = index - 3;
            } else {
                str [index -1] = str[i];
                index--;
            }
        }
    }
}
