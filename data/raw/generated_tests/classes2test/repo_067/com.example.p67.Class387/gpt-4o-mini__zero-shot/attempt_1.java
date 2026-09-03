package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {

    @Test
    void returnsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class387().compute(0) / 0);
    }
}
