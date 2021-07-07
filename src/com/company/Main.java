package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StringBuilder sentence=new StringBuilder();
        String[] words = {"ya ","yao ","yasuo"};

        for (String w : words) sentence.append(w);
        System.out.println(sentence.toString());

        String word;
        word = "abacedsafsdcfedsf";
        char[] wordArray = word.toCharArray();
        for (char w : wordArray) System.out.println(w);

    }
}
