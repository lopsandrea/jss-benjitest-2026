package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class070().compute(3));
    }
}
