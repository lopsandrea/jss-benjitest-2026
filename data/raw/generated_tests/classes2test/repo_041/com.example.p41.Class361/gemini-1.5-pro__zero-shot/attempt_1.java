package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class361().computeTotalOrDefault(3));
    }
}
