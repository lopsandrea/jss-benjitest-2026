package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {

    @Test
    void reportsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class119().compute(0) / 0);
    }
}
