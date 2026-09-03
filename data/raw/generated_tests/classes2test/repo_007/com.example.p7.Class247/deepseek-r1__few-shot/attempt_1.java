package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class247().compute(3));
    }
}
