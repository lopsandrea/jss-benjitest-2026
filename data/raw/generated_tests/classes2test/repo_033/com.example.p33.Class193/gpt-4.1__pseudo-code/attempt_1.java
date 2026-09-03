package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class193().computeTotalOrDefault(3));
    }
}
