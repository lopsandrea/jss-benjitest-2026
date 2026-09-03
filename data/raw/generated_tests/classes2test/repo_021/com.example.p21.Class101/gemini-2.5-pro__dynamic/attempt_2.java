package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {

    @Test
    void clampsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class101().compute(0) / 0);
    }
}
