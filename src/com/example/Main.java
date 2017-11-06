package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        String s = "aaab";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s){
        if(s.length()==0){
            return 0;
        }
        for(int i = 0; i < s.length(); ++i){
            checkSubstring(s,i,i);
            checkSubstring(s,i,i+1);
        }
        return count;
    }

    public static void checkSubstring(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
}
