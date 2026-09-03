package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class182().computeTotalOrDefault(3));
    }
}
