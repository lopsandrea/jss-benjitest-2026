package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class172().compute(0) / 0);
    }
}
