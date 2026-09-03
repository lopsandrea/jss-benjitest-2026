package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class106().compute(0) / 0);
    }
}
