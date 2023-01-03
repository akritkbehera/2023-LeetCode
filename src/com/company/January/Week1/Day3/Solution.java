package com.company.January.Week1.Day3;

public class Solution {
    public static int minDeletionSize(String[] strs){
        int delete = 0;
        int a = strs.length;
        int b = strs[0].length();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)){
                    delete++;
                    break;
                }

            }
        }
        return delete;
    }

}
