package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class329().computeTotalOrDefault(3));
    }
}
