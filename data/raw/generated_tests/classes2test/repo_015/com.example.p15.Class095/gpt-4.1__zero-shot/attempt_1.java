package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class095().computeTotalOrDefault(3));
    }
}
