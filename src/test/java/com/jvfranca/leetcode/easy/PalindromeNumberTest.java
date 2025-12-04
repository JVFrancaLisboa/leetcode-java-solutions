package com.jvfranca.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    private final PalindromeNumber solution = new PalindromeNumber();

    @DisplayName("retorna um true quando temos um palíndromo")
    @Test
    void shouldReturnTrueWhenNumberIsPalindrome(){
        Assertions.assertTrue(solution.isPalindrome(121));
    }

    @DisplayName("Retorna falso quando o número é negativo")
    @Test
    void shouldReturnFalseWhenNumberIs(){
        Assertions.assertFalse(solution.isPalindrome(-121));
    }

    @DisplayName("Retorna falso quando o número não é um palíndromo")
    @Test
    void shouldReturnFalseWhenNumberIsNotPalindrome(){
        Assertions.assertFalse(solution.isPalindrome(10));
    }

    @DisplayName("Retona true mesmo quando o palíndromo é um numero extenso")
    @Test
    void shouldReturnTrueWhenNumberIsLargePalindrome(){
        Assertions.assertTrue(solution.isPalindrome(12321));
    }

    @DisplayName("Retorna true quando o número é somente de um digito")
    @Test
    void shouldReturnTrueWhenItIsADigit(){
        Assertions.assertTrue(solution.isPalindrome(5));
    }

    @DisplayName("Zero deve retornar true para confirmar a robustez da lógica")
    @Test
    void shouldReturnTrueWhenItIsZero(){
        Assertions.assertTrue(solution.isPalindrome(0));
    }
}
