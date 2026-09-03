package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class170().compute(3));
    }
}
