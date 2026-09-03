package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class269().compute(0) / 0);
    }
}
