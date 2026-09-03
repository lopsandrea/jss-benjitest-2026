package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class356().compute(0) / 0);
    }
}
