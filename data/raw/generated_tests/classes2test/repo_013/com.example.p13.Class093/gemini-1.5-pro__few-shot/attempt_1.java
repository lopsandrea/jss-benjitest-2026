package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        assertEquals(99, new Class093().compute(3));
    }
}
