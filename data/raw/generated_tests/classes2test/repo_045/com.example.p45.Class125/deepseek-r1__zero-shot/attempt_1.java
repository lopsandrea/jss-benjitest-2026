package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class125Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class125().computeTotalOrDefault(3));
    }
}
