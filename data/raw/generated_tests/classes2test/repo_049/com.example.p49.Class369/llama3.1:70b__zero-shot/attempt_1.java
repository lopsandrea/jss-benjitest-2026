package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class369().compute(0) / 0);
    }
}
