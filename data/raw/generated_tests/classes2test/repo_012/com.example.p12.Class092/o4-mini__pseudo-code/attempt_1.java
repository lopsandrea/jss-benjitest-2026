package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class092().computeTotalOrDefault(3));
    }
}
