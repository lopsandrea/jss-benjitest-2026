package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {

    @Test
    void yieldsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class093().computeTotalOrDefault(3));
    }
}
