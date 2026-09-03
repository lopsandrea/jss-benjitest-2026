package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class279().computeTotalOrDefault(3));
    }
}
