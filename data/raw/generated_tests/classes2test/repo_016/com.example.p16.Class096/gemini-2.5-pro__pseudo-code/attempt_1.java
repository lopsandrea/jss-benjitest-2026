package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class096Test {

    @Test
    void keepsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class096().compute(0) / 0);
    }
}
