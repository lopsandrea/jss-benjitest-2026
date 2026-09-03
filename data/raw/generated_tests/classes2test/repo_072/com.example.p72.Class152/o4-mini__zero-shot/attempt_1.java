package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class152().compute(3));
    }
}
