package org.example;

public class withoutEnd {
    public String withoutEnd(String str) {
        // Use substring to remove the first and last characters
        return str.substring(1, str.length() - 1);
    }

}
