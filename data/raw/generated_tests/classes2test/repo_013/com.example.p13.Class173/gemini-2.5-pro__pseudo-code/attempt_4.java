package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class173Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class173().compute(0) / 0);
    }
}
