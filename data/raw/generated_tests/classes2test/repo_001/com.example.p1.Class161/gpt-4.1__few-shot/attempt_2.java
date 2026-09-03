package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class161().computeTotalOrDefault(3));
    }
}
