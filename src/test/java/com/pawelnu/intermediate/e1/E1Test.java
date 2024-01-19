package com.pawelnu.intermediate.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1Test {
    private static final Double avg = 3.3333333333333335;
    private static final Double avgZero = 0.0D;

    @Test
    void shouldCalculateAvgStringLength() {
        Double result = E1.calculateAvgStringLength(DataExample.getStringListWithAllCombinations());
        assertEquals(avg, result);
    }
    @Test
    void shouldCalculateAvgStringLengthZero() {
        Double result = E1.calculateAvgStringLength(DataExample.getStringListWithEmptyString());
        assertEquals(avgZero, result);
    }

    @Test
    void shouldCalculateAvgStringLengthStream() {
        Double result = E1.calculateAvgStringLengthStream(DataExample.getStringListWithAllCombinations());
        assertEquals(avg, result);
    }
    @Test
    void shouldCalculateAvgStringLengthStreamZero() {
        Double result = E1.calculateAvgStringLengthStream(DataExample.getStringListWithEmptyString());
        assertEquals(avgZero, result);
    }
}