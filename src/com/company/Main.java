package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sentence=new StringBuilder();
        String[] words = {"ya ","yao ","yasuo"};

        for (String w : words) sentence.append(w);
        System.out.println(sentence.toString());
        String input = new String();
        System.out.println("문장을 입력하시오");
        input = scan.next();
        quizWord quizW = new quizWord(input);
        quizW.findSameChar();
        quizW.isUniqueChars();

        int val;
        val = 'c' - 'a';
        System.out.println(val);
    }
}
