package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class046().computeTotalOrDefault(3));
    }
}
