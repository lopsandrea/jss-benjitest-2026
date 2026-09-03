package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class088().computeTotalOrDefault(3));
    }
}
