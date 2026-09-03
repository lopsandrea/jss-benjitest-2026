package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class007().compute(0) / 0);
    }
}
