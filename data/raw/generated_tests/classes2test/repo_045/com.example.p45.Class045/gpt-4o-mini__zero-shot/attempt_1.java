package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class045().compute(3));
    }
}
