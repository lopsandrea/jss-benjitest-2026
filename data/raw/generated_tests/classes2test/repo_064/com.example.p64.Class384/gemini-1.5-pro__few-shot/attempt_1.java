package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class384().compute(0) / 0);
    }
}
