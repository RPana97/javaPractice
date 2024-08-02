package org.example;

public class notString {
    //adds not to the front of the string if not isnt present
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }
}
