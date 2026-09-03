package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class173Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class173().compute(0) / 0);
    }
}
