package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {

    @Test
    void yieldsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class286().compute(0) / 0);
    }
}
