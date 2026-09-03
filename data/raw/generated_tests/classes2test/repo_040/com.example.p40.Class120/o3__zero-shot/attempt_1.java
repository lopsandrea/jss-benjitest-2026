package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class120().compute(0) / 0);
    }
}
