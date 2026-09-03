package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {

    @Test
    void returnsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class272().compute(0) / 0);
    }
}
