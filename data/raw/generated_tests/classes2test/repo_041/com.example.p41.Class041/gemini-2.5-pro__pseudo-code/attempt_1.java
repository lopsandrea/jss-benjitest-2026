package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class041().computeTotalOrDefault(3));
    }
}
