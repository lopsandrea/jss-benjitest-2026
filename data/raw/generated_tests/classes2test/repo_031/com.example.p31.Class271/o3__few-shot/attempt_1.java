package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class271().compute(0) / 0);
    }
}
