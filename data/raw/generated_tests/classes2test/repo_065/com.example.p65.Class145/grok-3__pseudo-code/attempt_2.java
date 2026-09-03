package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class145().compute(3));
    }
}
