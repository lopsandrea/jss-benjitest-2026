package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class119().compute(3));
    }
}
