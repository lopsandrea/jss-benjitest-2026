package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class308().computeTotalOrDefault(3));
    }
}
