package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class144().compute(3));
    }
}
