package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class305().computeTotalOrDefault(3));
    }
}
