package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class038().compute(0) / 0);
    }
}
