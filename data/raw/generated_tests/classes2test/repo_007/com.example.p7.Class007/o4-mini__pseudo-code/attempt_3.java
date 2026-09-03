package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class007().computeTotalOrDefault(3));
    }
}
