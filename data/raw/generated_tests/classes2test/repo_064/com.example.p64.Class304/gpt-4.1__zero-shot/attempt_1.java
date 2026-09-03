package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class304().compute(0) / 0);
    }
}
