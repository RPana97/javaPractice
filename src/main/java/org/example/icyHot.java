package org.example;

public class icyHot {
    //returns true if one temp is below 0 and the other is above 100
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 >100) ||(temp1>100 && temp2<0)) ;
    }

}
