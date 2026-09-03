package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class265().compute(0) / 0);
    }
}
