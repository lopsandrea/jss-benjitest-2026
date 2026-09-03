package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class105().compute(0) / 0);
    }
}
