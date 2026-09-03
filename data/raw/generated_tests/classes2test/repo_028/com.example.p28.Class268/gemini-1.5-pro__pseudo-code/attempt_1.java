package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class268().compute(3));
    }
}
