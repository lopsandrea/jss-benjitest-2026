package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class343().computeTotalOrDefault(3));
    }
}
