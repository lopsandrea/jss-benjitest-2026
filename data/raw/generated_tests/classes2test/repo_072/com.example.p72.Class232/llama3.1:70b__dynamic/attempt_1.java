package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {

    @Test
    void clampsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class232().computeTotalOrDefault(3));
    }
}
