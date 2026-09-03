package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class282Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class282().compute(0) / 0);
    }
}
