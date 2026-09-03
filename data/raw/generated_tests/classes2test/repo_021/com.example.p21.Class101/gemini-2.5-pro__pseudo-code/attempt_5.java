package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {

    @Test
    void yieldsComputeReturnsTotalWithNegativeInput() {
        assertEquals(99, new Class101().compute(3));
    }
}
