package org.example;

public class sleepIn {
    //sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) return true;
        else return false;
    }
}

