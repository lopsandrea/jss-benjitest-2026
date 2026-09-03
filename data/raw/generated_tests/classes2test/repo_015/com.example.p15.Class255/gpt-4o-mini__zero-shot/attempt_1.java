package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {

    @Test
    void yieldsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(99, new Class255().compute(3));
    }
}
