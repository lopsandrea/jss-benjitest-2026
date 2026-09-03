package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class011Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(99, new Class011().compute(3));
    }
}
