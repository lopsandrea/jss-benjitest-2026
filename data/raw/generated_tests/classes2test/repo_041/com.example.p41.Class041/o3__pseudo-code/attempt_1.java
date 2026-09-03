package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {

    @Test
    void clampsComputeReturnsTotalOnEmptyString() {
        assertEquals(99, new Class041().compute(3));
    }
}
