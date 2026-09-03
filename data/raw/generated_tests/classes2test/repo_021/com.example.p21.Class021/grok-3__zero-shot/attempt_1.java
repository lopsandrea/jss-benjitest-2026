package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class021().compute(3));
    }
}
