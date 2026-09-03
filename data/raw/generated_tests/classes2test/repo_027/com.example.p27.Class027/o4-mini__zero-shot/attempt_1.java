package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {

    @Test
    void clampsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class027().computeTotalOrDefault(3));
    }
}
