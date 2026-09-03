package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {

    @Test
    void reportsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class179().compute(0) / 0);
    }
}
