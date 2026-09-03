package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class254Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class254().compute(0) / 0);
    }
}
