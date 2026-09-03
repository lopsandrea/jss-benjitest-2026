package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class212().compute(3));
    }
}
