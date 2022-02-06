package programmers;

import java.util.Arrays;

import java.util.Iterator;
import java.util.stream.Stream;


class Solution_42577 {
    public boolean solution(String[] phone_book) {

        Stream<String> sortedPhonebook = Arrays.stream(phone_book).sorted((a, b) -> a.length() - b.length());
        Iterator<String> iter  = sortedPhonebook.iterator();
        PhoneBook pb = new PhoneBook(false);
        while(iter.hasNext()) {
            String phoneNum = iter.next();
            boolean result = pb.insert(phoneNum);
            if(!result) return false;
        }

        return true;
    }
}

class PhoneBook {
    private final PhoneBook[] buffer;
    private boolean isRegistered;
    public PhoneBook(boolean isRegistered) {
        this.buffer = new PhoneBook[10];
        this.isRegistered = isRegistered;
    }

    public boolean insert(String num) {
        char[] chars = num.toCharArray();

        PhoneBook[] nextBuffer = buffer;
        for(int i = 0; i < chars.length;i++) {
            char c = chars[i];
            int n = c - '0';
            if(nextBuffer[n] == null) {
                nextBuffer[n] = new PhoneBook(false);
            }
            if(nextBuffer[n].isRegistered) return false;
            else if(i + 1 == chars.length) {
                nextBuffer[n].isRegistered = true;
            } else {
                nextBuffer = nextBuffer[n].buffer;
            }
        }
        return true;
    }
}