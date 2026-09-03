package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class161().compute(0) / 0);
    }
}
