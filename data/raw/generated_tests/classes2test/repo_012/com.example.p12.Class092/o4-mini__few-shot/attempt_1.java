package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class092().compute(3));
    }
}
