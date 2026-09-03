package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class394().compute(0) / 0);
    }
}
