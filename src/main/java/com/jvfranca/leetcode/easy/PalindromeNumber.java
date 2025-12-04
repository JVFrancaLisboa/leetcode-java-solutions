package com.jvfranca.leetcode.easy;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * Solução
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // Números negativos nunca são palíndromos
        if (x < 0) return false;

        // Números de 1 dígito são sempre palíndromos
        if (x < 10) return true;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
