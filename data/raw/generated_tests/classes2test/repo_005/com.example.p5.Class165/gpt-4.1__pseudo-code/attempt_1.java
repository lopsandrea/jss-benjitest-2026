package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class165().compute(3));
    }
}
