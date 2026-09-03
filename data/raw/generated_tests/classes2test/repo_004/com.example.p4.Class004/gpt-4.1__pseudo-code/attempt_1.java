package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class004().computeTotalOrDefault(3));
    }
}
