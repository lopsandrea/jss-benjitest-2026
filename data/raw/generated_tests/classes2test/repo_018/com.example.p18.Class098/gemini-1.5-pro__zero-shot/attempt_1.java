package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class098().compute(0) / 0);
    }
}
