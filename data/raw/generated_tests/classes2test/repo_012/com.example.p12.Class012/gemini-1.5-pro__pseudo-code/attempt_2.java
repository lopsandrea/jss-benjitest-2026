package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(99, new Class012().compute(3));
    }
}
