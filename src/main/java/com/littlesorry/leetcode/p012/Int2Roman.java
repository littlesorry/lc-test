package com.littlesorry.leetcode.p012;

/**
 * Created by baofeng.wbf on 2016-05-03 5:56 PM.
 */
public class Int2Roman {

    public String intToRoman(int num) {
        String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; num > 0; i++) {

            while (num >= val[i]) {
                num -= val[i];
                sb.append(str[i]);
            }

        }

        return sb.toString();
    }
}