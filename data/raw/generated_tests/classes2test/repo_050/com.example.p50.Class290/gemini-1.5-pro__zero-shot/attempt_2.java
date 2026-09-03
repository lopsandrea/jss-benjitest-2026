package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class290().compute(3));
    }
}
