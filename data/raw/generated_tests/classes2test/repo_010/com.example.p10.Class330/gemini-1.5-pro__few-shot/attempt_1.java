package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        assertEquals(99, new Class330().compute(3));
    }
}
