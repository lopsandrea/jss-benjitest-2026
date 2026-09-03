package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class235().computeTotalOrDefault(3));
    }
}
