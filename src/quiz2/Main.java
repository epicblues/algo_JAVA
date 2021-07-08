package quiz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            boolean isSamePerm = true;
            System.out.println("Insert 2 strings");
            String str1string = scan.next();
            String str2string = scan.next();
            char[] str1 = str1string.toCharArray();
            char[] str2 = str2string.toCharArray();

            if (!(str1.length == str2.length)) {
                System.out.println("they are not related in permutation");
                continue;
            } else {
                for (int i = 1; i < str1.length; i++) {
                    for (int j = 0; j < i; j++) {
                        int diff1 = str1[i] - str1[j];
                        int diff2 = str2[i] - str2[j];
                        if (diff1 > 0) {
                            char temp;
                            temp = str1[i];
                            str1[i] = str1[j];
                            str1[j] = temp;
                        }
                        if (diff2 > 0) {
                            char temp;
                            temp = str2[i];
                            str2[i] = str2[j];
                            str2[j] = temp;
                        }
                    }
                }
                for (int i=0;i<str1.length;i++) {
                    if(!(str1[i] == str2[i])) {
                        isSamePerm = false;
                    }
                }
            }

            if (isSamePerm) System.out.println("They are in same permutation");
            else System.out.println("They are not in same permutation");
        }
    }


}
