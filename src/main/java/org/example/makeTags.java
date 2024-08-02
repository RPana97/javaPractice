package org.example;

public class makeTags {
    //adds tags around the string word
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
