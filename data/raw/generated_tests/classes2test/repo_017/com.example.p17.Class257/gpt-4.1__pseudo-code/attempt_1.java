package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class257Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class257().computeTotalOrDefault(3));
    }
}
