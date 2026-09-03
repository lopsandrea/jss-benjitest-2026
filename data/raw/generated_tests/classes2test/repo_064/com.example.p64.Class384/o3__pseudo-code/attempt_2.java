package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(99, new Class384().compute(3));
    }
}
