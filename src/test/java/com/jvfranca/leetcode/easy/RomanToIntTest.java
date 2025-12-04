package com.jvfranca.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

    private final RomanToInt solution = new RomanToInt();

    @Test
    @DisplayName("Retorna o número 5 quando argumentamos o algarismo V")
    void shoulReturnFive(){
        Assertions.assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    @DisplayName("Retorna 3 quando argumentamos o algarismo III")
    void shouldReturnThree(){
        Assertions.assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    @DisplayName("Retorna 58 quando argumentamos o algarismo LVIII")
    void shouldReturnFiftyEight(){
        Assertions.assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    @DisplayName("Retorna 1994 quando argumentamos o algarismo MCMXCIV")
    void shouldReturnNineteenNinetyFour(){
        Assertions.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
