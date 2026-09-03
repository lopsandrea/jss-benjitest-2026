package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class094().compute(3));
    }
}
