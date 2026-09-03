package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class235().compute(0) / 0);
    }
}
