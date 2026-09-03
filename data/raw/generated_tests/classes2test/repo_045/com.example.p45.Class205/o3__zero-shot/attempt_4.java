package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class205().compute(0) / 0);
    }
}
