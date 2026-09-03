package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        assertEquals(99, new Class340().compute(3));
    }
}
