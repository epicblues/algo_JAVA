package com.baek_algo;

public class Main
{

    public static void main(String[] args) {
        System.out.println(Babo.GODLIKE);
    }

    static enum Babo{
        GODLIKE("innervlaue");


        private final String value;

        Babo(String value) {
            this.value = value;
        }

//        @Override
//        public String toString() {
//            return value;
//        }
    }
}
