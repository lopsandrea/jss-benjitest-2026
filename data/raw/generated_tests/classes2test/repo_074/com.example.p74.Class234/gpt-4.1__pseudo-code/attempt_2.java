package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class234().compute(3));
    }
}
