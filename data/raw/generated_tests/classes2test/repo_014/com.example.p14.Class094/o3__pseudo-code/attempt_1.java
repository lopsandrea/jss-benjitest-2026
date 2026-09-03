package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class094().compute(0) / 0);
    }
}
