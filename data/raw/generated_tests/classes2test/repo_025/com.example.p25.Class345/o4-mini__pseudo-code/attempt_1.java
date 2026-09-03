package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        assertEquals(99, new Class345().compute(3));
    }
}
