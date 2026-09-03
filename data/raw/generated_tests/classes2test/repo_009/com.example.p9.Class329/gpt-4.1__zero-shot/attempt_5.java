package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class329().compute(0) / 0);
    }
}
