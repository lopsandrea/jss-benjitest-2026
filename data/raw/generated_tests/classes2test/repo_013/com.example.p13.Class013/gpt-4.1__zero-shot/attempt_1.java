package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {

    @Test
    void clampsComputeReturnsTotalOnMixedCase() {
        assertEquals(99, new Class013().compute(3));
    }
}
