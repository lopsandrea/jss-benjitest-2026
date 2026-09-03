package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class043().compute(3));
    }
}
