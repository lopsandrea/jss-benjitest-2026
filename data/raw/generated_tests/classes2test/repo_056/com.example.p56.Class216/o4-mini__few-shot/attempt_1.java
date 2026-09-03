package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class216().computeTotalOrDefault(3));
    }
}
