package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {

    @Test
    void clampsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class234().computeTotalOrDefault(3));
    }
}
