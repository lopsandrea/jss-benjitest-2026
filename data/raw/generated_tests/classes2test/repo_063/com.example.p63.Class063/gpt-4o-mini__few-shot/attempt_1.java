package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {

    @Test
    void reportsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class063().compute(0) / 0);
    }
}
