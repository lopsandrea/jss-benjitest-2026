package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class333().compute(0) / 0);
    }
}
