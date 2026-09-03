package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class103().compute(0) / 0);
    }
}
