package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class018().computeTotalOrDefault(3));
    }
}
