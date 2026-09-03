package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class137().compute(0) / 0);
    }
}
