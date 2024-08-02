package org.example;

public class front3 {
    //takes the first 3 chars in a str and repeats it 3 times
    public String front3(String str) {
        String front;

        if (str.length() >=3) {
            front = str.substring (0,3);
        }
        else {
            front =str;
        }
        return front + front + front;
    }

}
