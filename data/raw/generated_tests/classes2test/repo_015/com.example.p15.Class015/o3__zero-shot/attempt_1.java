package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class015().compute(0) / 0);
    }
}
