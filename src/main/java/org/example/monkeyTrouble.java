package org.example;

public class monkeyTrouble {
    //trouble if both monkeys are smiling or not smiling return true.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) return true;
        if (!aSmile && !bSmile) return true;
        return false;
    }

}
