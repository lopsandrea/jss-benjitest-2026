package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {

    @Test
    void returnsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class332().compute(0) / 0);
    }
}
