package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class217().compute(0) / 0);
    }
}
