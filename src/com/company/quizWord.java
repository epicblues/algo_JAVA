package com.company;

import java.lang.reflect.Constructor;

public class quizWord {
    String word;
    char[] wordArray;
    int count;

    public quizWord(String word) {
        this.word = word;
        wordArray = word.toCharArray();
        count = 0;

    }
    public void findSameChar() {
        Exit:
        for (int i=0;i<wordArray.length;i++) {
            for(int j=i+1; j<wordArray.length;j++) {
                if (wordArray[i] == wordArray[j]) {
                    System.out.println("SameString!  \n");
                    count=1;
                    break Exit;                }
            }

        }
        if (count == 0) {
            System.out.println("All characters different!");
        }
    }

    public boolean isUniqueChars() {
        if (word.length()>128) return false;
        boolean[] char_set = new boolean[128];
        for(int i=0; i< word.length();i++) {
            int val = word.charAt(i);
            if (char_set[val]) {
                System.out.printf("%c has repeated again!",val);
                return false;
            }
            char_set[val] = true;
        }
        System.out.println("All characters are unique!");
        return true;
    }




}
