package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class363().compute(3));
    }
}
