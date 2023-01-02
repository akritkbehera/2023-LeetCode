package com.company.January.Week1.Day2;

public class Solution {
    public static boolean detectCapitalUse(String word) {
        char[] myArr = word.toCharArray();
        if (Character.isUpperCase(myArr[0])){
            int i = 1;
            int j = 1;
           while (i<=myArr.length-1&&Character.isUpperCase(myArr[i])){
               i++;
           }
            while (j<=myArr.length-1&&Character.isLowerCase(myArr[j])){
                j++;
            }
            if (j==myArr.length||i==myArr.length){
                return true;
            }
            return false;
        }else if (Character.isLowerCase(myArr[0])){
            int k = 1;
            while (k< myArr.length&&Character.isLowerCase(myArr[k])){
                k++;
            }
            if (k== myArr.length){
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        String word1 = "Usa";
        boolean a = detectCapitalUse(word1);
        System.out.println(a);
    }
}
