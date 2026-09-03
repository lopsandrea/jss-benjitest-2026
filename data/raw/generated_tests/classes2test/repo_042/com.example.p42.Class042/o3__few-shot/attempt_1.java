package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class042().compute(0) / 0);
    }
}
