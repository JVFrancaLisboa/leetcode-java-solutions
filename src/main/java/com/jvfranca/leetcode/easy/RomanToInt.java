package com.jvfranca.leetcode.easy;

import java.util.Map;

/**
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInt {

    private static final Map<Character, Integer> ROMAN_VALUES = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
    );

    public int romanToInt(String s) {
        int ans = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = ROMAN_VALUES.get(s.charAt(i));

            // Se não for o último e o próximo for maior → subtrai
            if (i < length - 1 && current < ROMAN_VALUES.get(s.charAt(i + 1))) {
                ans -= current;
            } else {
                ans += current;
            }
        }

        return ans;
    }
}
