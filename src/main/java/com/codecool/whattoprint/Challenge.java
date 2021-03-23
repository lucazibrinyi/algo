package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        StringBuilder sb= new StringBuilder();
        if (number % 3 == 0 && number % 7 != 0) {
            sb.append(words[0]);
        } else if (number % 3 != 0 && number % 7 == 0) {
            sb.append(words[1]);
        } else if (number % 3 == 0 && number % 7 == 0) {
            sb.append(words[0]).append(words[1]);
        }
        return sb.toString();
    }
}
