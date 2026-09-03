package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class178Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class178().computeTotalOrDefault(3));
    }
}
