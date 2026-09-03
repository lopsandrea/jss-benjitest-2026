package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class136().compute(0) / 0);
    }
}
