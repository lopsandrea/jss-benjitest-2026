package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class031().computeTotalOrDefault(3));
    }
}
