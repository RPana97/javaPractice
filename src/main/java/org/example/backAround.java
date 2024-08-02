package org.example;

public class backAround {
    //the last char and return a new string with the last char added at the front and back
    public String backAround(String str) {
        String last = str.substring (str.length()-1);
        return last + str + last;
    }

}
