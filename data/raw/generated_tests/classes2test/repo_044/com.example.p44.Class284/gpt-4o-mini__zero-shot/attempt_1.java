package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class284().computeTotalOrDefault(3));
    }
}
