package org.example;

public class parrotTrouble {
    //if parrot is talking before 7 or after 20 return true. parrot is causing trouble
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour<7 || hour>20)) {
            return true;
        }
        return false;
    }

}
