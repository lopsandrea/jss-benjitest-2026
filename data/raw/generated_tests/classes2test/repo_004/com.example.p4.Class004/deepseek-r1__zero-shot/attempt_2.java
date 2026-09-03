package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class004().compute(3));
    }
}
