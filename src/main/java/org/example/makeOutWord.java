package org.example;

public class makeOutWord {
    public  String makeOutWord(String out, String word) {
        // Find the middle index where the word should be inserted
        int middle = out.length() / 2;
        // new string by inserting the word into the middle
        return out.substring(0, middle) + word + out.substring(middle);
    }
}
